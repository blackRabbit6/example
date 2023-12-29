package aloneStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Scanner;

public class Purchase {
	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE"; 
    private static final String JDBC_USER = "alone1"; 
    private static final String JDBC_PASSWORD = "alone1";
    
	public void buy() {
		Scanner sc = new Scanner(System.in);
	    Connection connection = null;
		 try {
	            // Oracle JDBC 드라이버를 로드
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            // 데이터베이스와 연결
	            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	            if(connection != null) {
	            	System.out.print("상품명: ");
            		String productName = sc.nextLine();
            		// 장바구니 테이블에서 해당 상품을 찾아보고 수량을 확인
                    String selectSql = "SELECT quantity FROM basket WHERE productname = ?";
                    PreparedStatement selectStatement = connection.prepareStatement(selectSql);
                    selectStatement.setString(1, productName);
                    ResultSet resultSet = selectStatement.executeQuery();
                    
                    if(resultSet.next()) {
                    	int currentQuantity = resultSet.getInt("quantity");
                        System.out.println("현재 " + productName + " 이 담긴 수량: " + currentQuantity);
                    	System.out.println("구매하시겠습니까?(Y/N): ");
    	            	String functions = sc.nextLine().toUpperCase();
    	            		if(functions.equals("Y")) {
    	            			 // 메뉴 테이블에서 해당 상품의 재고량을 조회
    	                        String menuSelectSql = "SELECT quantity FROM menu WHERE productname = ?";
    	                        PreparedStatement menuSelectStatement = connection.prepareStatement(menuSelectSql);
    	                        menuSelectStatement.setString(1, productName);
    	                        ResultSet menuResultSet = menuSelectStatement.executeQuery();
    	                        
    	                        if(menuResultSet.next()) {
    	                        	int menuQuan = menuResultSet.getInt("quantity");
    	                        	if(currentQuantity <= menuQuan) {
    	                        		// 현재 시간 구하기
    	                                Timestamp orderTime = new Timestamp(System.currentTimeMillis());

    	                                // 주문 정보를 orders 테이블에 저장
    	                                String insertOrderSql = "INSERT INTO receipt (ordernum, buyday, productname, quantity) VALUES (sequence1.NEXTVAL, ?, ?, ?)";
    	                                PreparedStatement insertOrderStatement = connection.prepareStatement(insertOrderSql);
    	                                insertOrderStatement.setTimestamp(1, orderTime);
    	                                insertOrderStatement.setString(2, productName);
    	                                insertOrderStatement.setInt(3, currentQuantity);
    	                                insertOrderStatement.executeUpdate();
    	                        		// 1. 메뉴 테이블의 재고량 업데이트
    	                                String updateMenuSql = "UPDATE menu SET quantity = quantity - ? WHERE productname = ?";
    	                                PreparedStatement updateMenuStatement = connection.prepareStatement(updateMenuSql);
    	                                updateMenuStatement.setInt(1, currentQuantity);
    	                                updateMenuStatement.setString(2, productName);
    	                                updateMenuStatement.executeUpdate();

    	                                // 2. 장바구니에서 해당 상품 삭제
    	                                String deleteBasketSql = "DELETE FROM basket WHERE productname = ?";
    	                                PreparedStatement deleteBasketStatement = connection.prepareStatement(deleteBasketSql);
    	                                deleteBasketStatement.setString(1, productName);
    	                                deleteBasketStatement.executeUpdate();
    	                               
    	                                System.out.println(productName + "을(를) " + currentQuantity + "개 구매하였습니다.");
    	                        	}else	{
    	                        		System.out.println("재고 부족으로 인하여 구매가 취소되었습니다.");
    	                        	}
    	                        }else {
    	                        	System.out.println("장바구니에 담겨있지 않거나, 없는 제품입니다.");
    	                        }
    	            		}else if(functions.equals("N")) {
    	            			System.out.println("구매를 취소하셨습니다.");
    	            		}else {
    	            			System.out.println("Y 나 N을 입력하세요");
    	            		}
                    	}else {
                    		System.out.println("장바구니에 담겨있지 않거나, 없는 제품입니다.");
                    	}
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
}
