package com.js;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class BankDBWriter {
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet result = null;

	private int balance;
	private int newBalance;
	@SuppressWarnings("unused")
	private String name = "";
	private String url = "jdbc:mysql://192.168.0.66:3306/bank";
	private String id = "bank";
	private String pw = "1234";
	private String today;
	private String time;
	
	public void getDateTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
		Date d = new Date();
		this.today = dateFormat.format(d);
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", Locale.KOREA);
		Date t = new Date();
		this.time = timeFormat.format(t);
	}
	
	public int select(String name) {
		this.name = name;
		String sql = "SELECT balance FROM history WHERE name='" + name + "' ORDER BY no DESC LIMIT 1";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			con = DriverManager.getConnection(url, id, pw);
			stmt = con.createStatement();
			result = stmt.executeQuery(sql);
			
			while(result.next()) {
				balance = result.getInt("balance");
			}

		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (result != null) try {result.close();} catch(SQLException e) {}
			if (stmt != null) try {stmt.close();} catch(SQLException e) {}
			if (con != null) try {con.close();} catch(SQLException e) {}
		}
		return balance;
	}

	public int insert(String name, String choice, int money) {
		this.balance = select(name);
		
		if (choice.equals("1")) {
			newBalance = balance + money;
		} else if (choice.equals("2")) {
			newBalance = balance - money;
		}
		
		getDateTime();
		String deposit = "INSERT INTO `bank`.`history` (`date`, `time`, `name`, `deposit`, `balance`)"
							+ " VALUES (?, ?, ?, ?, ?)";
		String withdrawal = "INSERT INTO `bank`.`history` (`date`, `time`, `name`, `withdrawal`, `balance`)"
							+ " VALUES (?, ?, ?, ?, ?)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			con = DriverManager.getConnection(url, id, pw);
			
			if (choice.equals("1")) {
				pstmt = con.prepareStatement(deposit);
			} else if (choice.equals("2")) {
				pstmt = con.prepareStatement(withdrawal);
			}
			
			pstmt.setString(1, today);
			pstmt.setString(2, time);
			pstmt.setString(3, name);
			pstmt.setInt(4, money);
			pstmt.setInt(5, newBalance);
			pstmt.executeUpdate();
			
			con.close();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (stmt != null) try {stmt.close();} catch(SQLException e) {}
			if (con != null) try {con.close();} catch(SQLException e) {}
		}
		return newBalance;
	}
}
