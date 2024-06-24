package C09NetWorking;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class C0904Webserver3 {
    public static void main(String[] args) throws SQLException, IOException {
        String url = "jdbc:mysql://localhost:3306/webserver3?useSSL=false";
        String userName = "root";
        String password = "1234";

        Connection con = DriverManager.getConnection(url, userName, password);
        System.out.println("DB 연결 성공");

        // statement : 쿼리를 담아 db로 쿼리 전달하는 객체
        Statement st = con.createStatement();
        String myQuery = "SELECT * FROM Author";
        ResultSet rs = st.executeQuery(myQuery);
        int id=0;
        String name="";
        String email="";
        String password_author="";
        List<JsonNode> authors = new ArrayList<>();
//        while(rs.next()){
//            id = rs.getInt("id");
//            name = rs.getString("name");
//            email = rs.getString("email");
//            password_author = rs.getString("password");
//
//        }
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("8081 서비스 시작");
        while(true) {
            // accept() : 클라이언트의 연결 요청을 수락
            Socket socket = serverSocket.accept();
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = bf.readLine()) != null && !line.isEmpty()) {
                sb.append(line + "\n");
            }
            String requestString = sb.toString();
            String firstLine = requestString.split("\n")[0];
            String infos = firstLine.split(" ")[1];
            String idWeb = "";
            String nameWeb = "";
            String emailWeb = "";
            String password_authorWeb = "";
            if (infos.contains("?")) {
                // localhost:8081?name=hongildong&age=30 이런 거 커버 가능하려면
                // 물음표를 기준으로 split -> name=hongildong&age=30 그럼 이거 나오게
                String st1 = infos.split("\\?")[1];
                // name=hongildong&age=30 이걸 & 기준으로 split
                String[] stArr = st1.split("&");
                for (String s : stArr) {
                    //name=hongildong이걸 key-value로 자르기
                    String[] keyValue = s.split("=");
                    if (keyValue[0].equals("id")) {
                        idWeb = keyValue[1];
                    }
                    else if (keyValue[0].equals("name")) {
                        nameWeb = keyValue[1];
                    }
                    else if(keyValue[0].equals("email")){
                        emailWeb = keyValue[1];
                    }

                    while(rs.next()){
                        id = rs.getInt("id") ;
                        name = rs.getString("name");
                        email = rs.getString("email");
                        password_author = rs.getString("password");

                        if(!idWeb.equals("")&&(Integer.parseInt(idWeb) == id)) {
                            System.out.println("id는 " + id + " name은 " + name + " email은 " + email + " 비밀번호는 " + password_author);
                            break;
                        }
                        else if(!emailWeb.equals("")&&emailWeb.equals(email)) {
                            System.out.println("id는 " + id + " name은 " + name + " email은 " + email + " 비밀번호는 " + password_author);
                            break;
                        }
                        else if(!nameWeb.equals("")&&nameWeb.equals(name)) {
                            System.out.println("id는 " + id + " name은 " + name + " email은 " + email + " 비밀번호는 " + password_author);
                            break;
                        }

                    }
                }

            }

        }
    }
}
