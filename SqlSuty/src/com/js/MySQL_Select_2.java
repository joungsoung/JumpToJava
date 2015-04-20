package com.js;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_Select_2 {
	Connection con;
	Statement stmt;
	ResultSet result;
	
	String url = "jdbc:mysql://192.168.0.66:3306/bank";
	String id = "bank";
	String pw = "1234";
	String name;
	int balance;

	public void select(String name) {
		this.name = name;
		String select = "SELECT balance FROM history WHERE name='" + name + "' ORDER BY no DESC LIMIT 1";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			con = DriverManager.getConnection(url, id, pw);
			stmt = con.createStatement();
			result = stmt.executeQuery(select);

			while (result.next()) {
				balance = result.getInt("balance");
			}

			con.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		MySQL_Select_2 te = new MySQL_Select_2();
		te.select("¿Ã¡æº∫");
		System.out.println(te.balance);
	}
}