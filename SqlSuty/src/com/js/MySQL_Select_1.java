package com.js;

import java.sql.*;

public class MySQL_Select_1 {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt;
		ResultSet result;
		
		String url = "jdbc:mysql://192.168.0.66:3306/bank";
		String id = "bank";
		String pw = "1234";

		/*
		 * SELECT balance FROMM history WHERE name='이종성' ORDER BY no DESC LIMIT 1;
		 * balance컬럼만 가져오는데, name이 이종성 인 것을 no칼럼을 역순으로 세워서 1개 만 가져와라.
		 * 결론은 이종성(name)의 제일 마지막 거래내역중 잔액(balance) 만 가져와라.
		*/
		String select = "SELECT balance FROM history WHERE name='이종성' ORDER BY no DESC LIMIT 1";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driveer download OK");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			con = DriverManager.getConnection(url, id, pw);
			//System.out.println("Connect OK");
			stmt = con.createStatement();
			result = stmt.executeQuery(select);
			
			while(result.next()) {
				int balance = result.getInt("balance");
				System.out.println(balance);
			}
			con.close();
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
