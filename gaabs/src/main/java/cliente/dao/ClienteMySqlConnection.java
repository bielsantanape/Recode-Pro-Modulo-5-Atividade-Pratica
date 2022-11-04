package cliente.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClienteMySqlConnection {
	
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			conn = DriverManager.getConnection("jdbc:msql://localhost:3306/gabsagencia", "root", "Crvg1998");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
