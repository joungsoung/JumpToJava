package com.js;

import java.sql.*;

public class SelectData {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// CUBRID¿¡ Connect
			Class.forName("cubrid.jdbc.driver.CUBRIDDriver");
			
			conn  = DriverManager.getConnection("jdbc:cubrid:localhost:30000:demodb:::","dba","");
			String sql = "select name, players from event";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String name = rs.getString("name");
				String players = rs.getString("players");
				System.out.println("name ==> " + name);
				System.out.println("Number of players==> " + players);
				System.out.println("\n=========================================\n");
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
	        System.err.println(e.getMessage());
	    } finally {
	           if (conn != null) conn.close();
		}
	}
}
