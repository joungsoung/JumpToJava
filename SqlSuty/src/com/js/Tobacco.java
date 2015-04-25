package com.js;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

public class Tobacco {
	
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet result = null;

	private String today, time;
	protected int oldStock, newStock;
	private String url = "jdbc:mysql://192.168.0.66/bank?user=bank&password=1234";

	public void getTodayTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
		Date d = new Date();
		today = dateFormat.format(d);
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", Locale.KOREA);
		Date t = new Date();
		time = timeFormat.format(t);
	}
	
	public int getStock(String name) {
		//String sql = "SELECT * FROM test WHERE 제품명=? ORDER BY 순번 DESC LIMIT 1";
		String sql = "SELECT * FROM test WHERE name='" + name + "' ORDER BY no DESC LIMIT 1";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url);
			
			//pstmt = conn.prepareStatement(sql);
			//pstmt.setString(1, name);
			stmt = (Statement) conn.createStatement();
			result = stmt.executeQuery(sql);
			
			while (result.next()) {
				oldStock = result.getInt("stock");
				//System.out.println(oldStock);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (result != null) try {result.close();} catch(SQLException e) {}
			if (stmt != null) try {stmt.close();} catch(SQLException e) {}
			if (conn != null) try {conn.close();} catch(SQLException e) {}
		}
		return oldStock;
	}

	public int insert(String name, String choice, int qty) {
		String sql1 = "INSERT INTO `bank`.`test` (`date`, `time`, `name`, `import`, `stock`) VALUES (?, ?, ?, ?, ?)";
		String sql2 = "INSERT INTO `bank`.`test` (`date`, `time`, `name`, `export`, `stock`) VALUES (?, ?, ?, ?, ?)";

		getStock(name);
		getTodayTime();

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url);
			if (choice.equals("입고")) {
				newStock = oldStock+qty;
				pstmt = conn.prepareStatement(sql1);
			} else if (choice.equals("출고")) {
				if (oldStock < qty) {
					JOptionPane.showMessageDialog(null, "재고가 부족합니다\n" + name + " 재고 : " + oldStock);
					System.exit(0);
				}
				newStock = oldStock-qty;
				pstmt = conn.prepareStatement(sql2);
			}
			pstmt.setString(1, today);
			pstmt.setString(2, time);
			pstmt.setString(3, name);
			pstmt.setInt(4, qty);
			pstmt.setInt(5, newStock);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			return 1;
			//System.out.println(e.getMessage());
			//e.printStackTrace();
		} finally {
			if (pstmt != null) try {pstmt.close();} catch(SQLException e) {}
			if (conn != null) try {conn.close();} catch(SQLException e) {}
		}
		return 0;
	}
}
