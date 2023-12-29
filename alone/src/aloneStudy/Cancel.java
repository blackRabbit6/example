package aloneStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Cancel {
	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE"; 
    private static final String JDBC_USER = "alone1"; 
    private static final String JDBC_PASSWORD = "alone1";
    
	public void cancel() {
		Scanner sc = new Scanner(System.in);
	    Connection connection = null;

        try {
            // Oracle JDBC 드라이버를 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 데이터베이스와 연결
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            if (connection != null) {
            	System.out.print("취소할 제품명: ");
            	String productName = sc.nextLine();
            	
            	String selectSql = "SELECT productname,quantity FROM basket WHERE productname=?";
            	PreparedStatement selectStatement = connection.prepareStatement(selectSql);
            	selectStatement.setString(1, productName);
                ResultSet resultSet = selectStatement.executeQuery();
                
                if(resultSet.next()) {
                	String productNameFind = resultSet.getString("productname");
                	int currentQuantity = resultSet.getInt("quantity");
                	
                	System.out.println("현재 "+ productNameFind + " 이 담긴 수량: "+ currentQuantity);
                	
                	System.out.print("선택한 상품을 장바구니에서 삭제 하시겠습니까? (Y/N): ");
                	String delectChoice = sc.nextLine().toUpperCase();
                	
                	if(delectChoice.equals("Y")) {
                		String delectSql = "DELETE FROM basket WHERE productname = ?";
                		PreparedStatement delectStatement = connection.prepareStatement(delectSql);
                		delectStatement.setString(1, productName);
                		int rowsAffected = delectStatement.executeUpdate();
                		
                		if(rowsAffected>0) {
                    		System.out.println(productNameFind + " 가 장바구니에서 삭제되었습니다.");
                    	}else {
                    		System.out.println("장바구니에게 제품 삭제 실패했습니다.");
                    	}
                	}else if(delectChoice.equals("N")) {
                		System.out.println("장바구니 삭제 취소했습니다.");
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
