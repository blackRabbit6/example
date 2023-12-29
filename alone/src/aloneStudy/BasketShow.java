package aloneStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BasketShow {
	// JDBC URL, 사용자 이름, 비밀번호
    private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE"; 
    private static final String JDBC_USER = "alone1"; 
    private static final String JDBC_PASSWORD = "alone1"; 

    public void basketShow() {
        Connection connection = null;

        try {
            // Oracle JDBC 드라이버를 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 데이터베이스와 연결
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            if (connection != null) {
                System.out.println("-----------------------------------");
                
                String sql = "SELECT productname, quantity FROM basket";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()) {
                	String productName = resultSet.getString("productname");
                	int quantity = resultSet.getInt("quantity");
                	System.out.println("제품명: "+ productName + " 재고수량: "+ quantity);
                	System.out.println("-----------------------------------------");
                }
                
                resultSet.close();
                preparedStatement.close();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
