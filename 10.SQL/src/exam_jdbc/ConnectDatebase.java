package exam_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatebase {
	public static Connection makeConnection(String id, String password) {
		// 18c : jdbc:oracle:thin:@127.0.0.1:1521/xepdb1
		//							������ġ:��Ʈ��ȣ/�����̸�
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/xepdb1";
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ���� ����");
			
			con = DriverManager.getConnection(url, id, password);
			System.out.println("�����ͺ��̽� ���� ����");
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���ῡ �����߽��ϴ�.");
			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String arg[]) throws SQLException { // �����۾��� �Ϸ��� ����ó���ؾߵǴµ� ���� �Ѱܹ���
		Connection con = makeConnection("javauser","java134");
		con.close();
	}

}
