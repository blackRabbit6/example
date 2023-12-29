package aloneStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Basket {
	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE"; 
    private static final String JDBC_USER = "alone1"; 
    private static final String JDBC_PASSWORD = "alone1";
	public void basket() {
		Scanner sc = new Scanner(System.in);
		Connection connection = null;

        try {
            // Oracle JDBC 드라이버를 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 데이터베이스와 연결
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            if (connection != null) {
            	System.out.print("상품명: ");
                String productName = sc.nextLine();
                System.out.print("구매수량: ");
                int quantity = sc.nextInt();
                sc.nextLine();
                
                String selectSql = "SELECT quantity FROM menu WHERE productname = ?";
                PreparedStatement selectStatement = connection.prepareStatement(selectSql);
                selectStatement.setString(1, productName);
                ResultSet resultSet = selectStatement.executeQuery();
                
                if(resultSet.next()) {
                	int currentQuantity = resultSet.getInt("quantity");
                	
                	if(currentQuantity >= quantity) {
                		String updateSql = "INSERT INTO basket(productname,quantity) VALUES (?,?)";
                		PreparedStatement updateStatement = connection.prepareStatement(updateSql);
                		updateStatement.setString(1, productName);
                		updateStatement.setInt(2, quantity);
                		updateStatement.executeUpdate();
                		
                		connection.commit();
                		System.out.println("장바구니 추가완료 되었습니다.");
                	}else {
                		System.out.println("재고수가 부족합니다.");
                	}
                	resultSet.close();
                    selectStatement.close();
                }else {
                	System.out.println("상품이 존재하지 않습니다.");
                }  
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
