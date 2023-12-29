package aloneStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE"; 
    private static final String JDBC_USER = "alone1"; 
    private static final String JDBC_PASSWORD = "alone1";
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ID: ");
		String id = sc.nextLine();
		System.out.print("PW: ");
		String pw = sc.nextLine();
		Connection connection = null;

        try {
            // Oracle JDBC 드라이버를 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 데이터베이스와 연결
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            if (connection != null) {
                // 사용자가 입력한 ID와 비밀번호를 사용하여 데이터베이스에서 조회
                String sql = "SELECT name FROM position WHERE id = ? AND pw = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, id);
                preparedStatement.setString(2, pw);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    String name = resultSet.getString("name");

                    if ("탁창우".equals(name)) {
                        System.out.println(name+"님, 관리자 전용메뉴로 이동합니다.");
                        Manager manager = new Manager();
                        manager.manager();
                    } else {
                        System.out.println(name+"님, 손님 전용메뉴로 이동합니다.");
                        Main main = new Main();
                        main.main();
                    }
                } else {
                    System.out.println("ID 또는 비밀번호가 일치하지 않습니다.");
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
