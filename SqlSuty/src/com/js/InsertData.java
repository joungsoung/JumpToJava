package com.js;

import java.sql.*;

public class InsertData {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stmt = null;
		try {
			// CUBRID에 Connect
			Class.forName("cubrid.jdbc.driver.CUBRIDDriver");
			conn = DriverManager.getConnection(
					"jdbc:cubrid:localhost:30000:demodb:::", "dba", "");
			String sql = "insert into olympic(host_year, host_nation, host_city, opening_date,            closing_date) values (2008, 'China', 'Beijing', to_date('08-08-2008','mm-dd-yyyy'),            to_date('08-24-2008','mm-dd-yyyy'))";
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("데이터가 입력되었습니다.");
			stmt.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			if (conn != null)
				conn.close();
		}
	}
}