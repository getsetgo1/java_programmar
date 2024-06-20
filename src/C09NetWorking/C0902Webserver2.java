package C09NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;

public class C0902Webserver2 {
    // 소켓이란 서버와 사용자가 통신을 하기 위한 네트워크 통신의 끝점을 나타내는 개념
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("8081 서비스 시작");
        while(true){
            // accept() : 클라이언트의 연결 요청을 수락
            Socket socket = serverSocket.accept();
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while((line= bf.readLine())!=null && !line.isEmpty()){
                sb.append(line + "\n");
            }
            String requestString = sb.toString();
            String firstLine = requestString.split("\n")[0];
            String infos = firstLine.split(" ")[1];
            String id="";
            if(infos.contains("?")){
                // localhost:8081?name=hongildong&age=30 이런 거 커버 가능하려면
                // 물음표를 기준으로 split -> name=hongildong&age=30 그럼 이거 나오게
                String st1 = infos.split("\\?")[1];
                // name=hongildong&age=30 이걸 & 기준으로 split
                String[] stArr = st1.split("&");
                for(String s : stArr){
                    //name=hongildong이걸 key-value로 자르기
                    String[] keyValue = s.split("=");
                    if(keyValue[0].equals("id")){
                        id = keyValue[1];
                    }
                }

            }
            System.out.println("id : "+id);

//            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n"+"hello world";
//            // UTF-8 문자열로 return 해주는 게 아래 메서드,
//            // 스프링에서는 이런 거 다 필요 없음 그냥 hello world 찍음 됨
//            socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
//            // flush() : 일반적으로 변경사항을 확정(반영)하는 것을 의미
//            socket.getOutputStream().flush();
//            socket.close();
        }
    }
}
