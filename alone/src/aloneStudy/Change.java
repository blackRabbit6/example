package aloneStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Change {
	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE"; 
    private static final String JDBC_USER = "alone1"; 
    private static final String JDBC_PASSWORD = "alone1";
	public void change() {
		Scanner sc = new Scanner(System.in);
	    Connection connection = null;

        try {
            // Oracle JDBC 드라이버를 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 데이터베이스와 연결
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            if (connection != null) {
            	System.out.print("제품명: ");
            	String productName = sc.nextLine();
            	
            	String selectSql = "SELECT productname,quantity FROM basket WHERE productname=?";
            	PreparedStatement selectStatement = connection.prepareStatement(selectSql);
            	selectStatement.setString(1, productName);
                ResultSet resultSet = selectStatement.executeQuery();
                
                if(resultSet.next()) {
                	String productNameFind = resultSet.getString("productname");
                	int currentQuantity = resultSet.getInt("quantity");
                	
                	System.out.println("현재 "+ productNameFind + " 이 담긴 수량: "+ currentQuantity);
                	System.out.print("변경할 수량 선택(원하지 않으시면 0 누르세요): ");
                	int newQuantity = sc.nextInt();
                	
                	String updateSql ="UPDATE basket SET quantity = ? WHERE productname = ?";
                	PreparedStatement updateStatement = connection.prepareStatement(updateSql);
                	updateStatement.setInt(1, newQuantity);
                	updateStatement.setString(2,productName);
                	int rowsAffected = updateStatement.executeUpdate();
                	
                	if(rowsAffected>0) {
                		System.out.println(productNameFind + "의 수량이 변경되었습니다.");
                	}else {
                		System.out.println("재고 수량 변경 실패했습니다.");
                	}
                }else {
                	System.out.println("장바구니에 담기지 않은 제품입니다.");
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
