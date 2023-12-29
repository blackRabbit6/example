package project.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Order {
    public void orderScan() {
        // 데이터베이스 연결 정보
    	String jdbcUrl = "jdbc:oracle:thin:@192.168.0.86:1521:XE"; // Oracle 데이터베이스 URL
        String username = "project2"; // 데이터베이스 사용자 이름
        String password = "project2"; // 데이터베이스 비밀번호

        // JDBC 연결
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // SQL 쿼리
            String query = "SELECT userid, username, productname, quantity, buyday, ordernum FROM receipt";

            // PreparedStatement 생성
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // 쿼리 실행 및 결과 검색
            ResultSet resultSet = preparedStatement.executeQuery();

            // 결과 출력
            while (resultSet.next()) {
                String userId = resultSet.getString("userid");
                String userName = resultSet.getString("username");
                String productName = resultSet.getString("productname");
                String quantity = resultSet.getString("quantity");
                String buyDay = resultSet.getString("buyday");
                String orderNum = resultSet.getString("ordernum"); // ordernum을 문자열로 읽음

                System.out.println("UserID: " + userId);
                System.out.println("성명: " + userName);
                System.out.println("제품명: " + productName);
                System.out.println("수량: " + quantity);
                System.out.println("구매일: " + buyDay);
                System.out.println("주문번호: " + orderNum);
                System.out.println("------------------------------");
            }


            // 연결 해제
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
