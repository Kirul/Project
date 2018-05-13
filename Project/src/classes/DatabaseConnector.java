package classes;

import java.sql.*;

//db connection class
public class DatabaseConnector {
	private Connection con;
	private String url;
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
		try {
			this.url = "jdbc:mysql://localhost:3306/Project";
			this.con = DriverManager.getConnection(url, "root", "sac123"); //username,psw
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		return this.con;
	} 
	
	public void closeConnection() {
		try {
			//closing the connection
			if(con != null && !con.isClosed()) {
				con.close();
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	
}
