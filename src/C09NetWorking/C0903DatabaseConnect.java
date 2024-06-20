package C09NetWorking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class C0903DatabaseConnect {
    public static void main(String[] args) throws SQLException {
        // mysql 드라이버가 필요
        //useSSL : 보안처리
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
        String userName = "root";
        String password = "1234";

        Connection con = DriverManager.getConnection(url, userName, password);
        System.out.println("DB 연결 성공");
    }
}
