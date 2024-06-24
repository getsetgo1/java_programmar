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

public class C0903DatabaseConnect {
    public static void main(String[] args) throws SQLException, IOException {
        // mysql 드라이버가 필요
        //useSSL : 보안처리
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
        String userName = "root";
        String password = "1234";

        Connection con = DriverManager.getConnection(url, userName, password);
        System.out.println("DB 연결 성공");

        // statement : 쿼리를 담아 db로 쿼리 전달하는 객체
        Statement st = con.createStatement();
        String myQuery = "SELECT * FROM post";
        ResultSet rs = st.executeQuery(myQuery);
        int id=0;
        String title="";
        while(rs.next()){
            id = rs.getInt("id");
            title = rs.getString("title");
            System.out.println("id는 "+id+" title은 "+title);
        }


    }
}
