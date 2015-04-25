package com.js;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;*/
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Make_Tobocco_DB_Data {
	
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet result = null;
	
	String url = "jdbc:mysql://192.168.0.66/bank?user=bank&password=1234";

	public String getToday() {
		
		@SuppressWarnings("unused")
		String today = "";
		
		String yyyy = "2015";
		String MM = "";
		String dd = "";
		int M = (int)(Math.random() * 4) + 1;
		MM = Integer.toString(M);
		if (MM.length() == 1) {MM = "0" + MM;}
		int d = (int)(Math.random() * 30) + 1;
		dd = Integer.toString(d);
		if (dd.length() == 1) {
			dd = "0" + dd;
		} else if (MM.equals("02") && (dd.equals("29") || dd.equals("30"))) {
			dd = "28";
		}
		return today = yyyy + "-" + MM + "-" + dd;
	}
	
	public String getTime() {
		
		@SuppressWarnings("unused")
		String time = "";
		
		String HH = "";
		String mm = "";
		String ss = "";
		int H = (int)(Math.random() * 23) + 1;
		HH = Integer.toString(H);
		if (HH.length() == 1) {HH = "0"+HH;}
		int m = (int)(Math.random() * 59) + 1;
		mm = Integer.toString(m);
		if (mm.length() == 1) {mm = "0"+mm;}
		int s = (int)(Math.random() * 59) + 1;
		ss = Integer.toString(s);
		if (ss.length() == 1) {ss = "0"+ss;}
		return time = (HH + ":" + mm + ":" + ss);
	}

	public int dbSelect(String name) {
		
		int oldStock = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//String sql = "SELECT * FROM `bank`.`test` WHERE name='" + name + "' ORDER BY no DESC LIMIT 1";
		String sql = "SELECT * FROM `bank`.`test` WHERE name=? ORDER BY no DESC LIMIT 1";
		try {
			conn = (Connection) DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			result = pstmt.executeQuery();
			
			//stmt = (Statement) conn.createStatement();
			//@SuppressWarnings("unused")
			//stmt.setFetchSize(1000);
			//result = stmt.executeQuery(sql);
			//result.setFetchSize(1000);
			
			while (result.next()) {
				oldStock = result.getInt("stock");
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
	
	public void dbInsert() {
		Make_Tobocco_DB_Data db = new Make_Tobocco_DB_Data();
		String name = "";
		int oldStock = 0;
		int newStock = 0;
		String[] arrName = {"DUNHLL", "MEVIUS", "Marlboro", "PARLIAMENT", "ENTZ", "THIS"};
		int[] arrStock = new int[arrName.length];

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql1 = "INSERT INTO `bank`.`test` (`date`, `time`, `name`, `import`, `stock`) VALUES (?, ?, ?, ?, ?)";
		String sql2 = "INSERT INTO `bank`.`test` (`date`, `time`, `name`, `export`, `stock`) VALUES (?, ?, ?, ?, ?)";
		String sql3 = "SELECT * FROM `bank`.`test` WHERE name=? ORDER BY no DESC LIMIT 1";
		
		try {
			conn = (Connection) DriverManager.getConnection(url);
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql3);
			
			for (int i=0; i<arrName.length; i++) {
				pstmt.setString(1, arrName[i]);
				result = pstmt.executeQuery();

				while (result.next()) {
					arrStock[i] = result.getInt("stock");
				}
				System.out.println(arrName[i] + " : " + arrStock[i]);
			}

			for (int i=0; i<100000; i++) {
				String today = db.getToday();
				String time = db.getTime();
				int qty = (int) (Math.random() * 90) + 11;
				int choice = (int) (Math.random() * 2) + 1;
				int r = 0;
				String value = "";

				if (choice == 1) {
					value = "입고";
				} else if (choice == 2) {
					value = "출고";
				}

				for (int j=1; j<arrName.length; j++) {
					r = (int) (Math.random() * arrName.length);
					name = arrName[r];
					oldStock = arrStock[r];
				}

				if (choice == 2 && oldStock < qty) {
					System.out.println(i + 1 + " " + today + " " + time + " "
							+ name + " " + value + "<" + qty + ">"
							+ "======================> 미등록");
					continue;
				} else if (choice == 1) {
					newStock = oldStock + qty;
					pstmt = conn.prepareStatement(sql1);
				} else if (choice == 2) {
					newStock = oldStock - qty;
					pstmt = conn.prepareStatement(sql2);
				}
				arrStock[r] = newStock;

				pstmt.setString(1, today);
				pstmt.setString(2, time);
				pstmt.setString(3, name);
				pstmt.setInt(4, qty);
				pstmt.setInt(5, newStock);
				pstmt.addBatch();
				pstmt.clearParameters();

				System.out.println(i + 1 + " " + today + " " + time + " " + name
								+ " " + value + "<" + qty + ">" + " "
								+ newStock);

				pstmt.executeBatch();
				pstmt.clearBatch();
				conn.commit();
			}
			pstmt.executeBatch();
			conn.commit();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (result != null) try {result.close();} catch (SQLException e) {}
			if (pstmt != null)try {pstmt.close();} catch (SQLException e) {}
			if (conn != null)try {conn.close();} catch (SQLException e) {}
		}
	}
		
	public static void main(String[] args) throws InterruptedException {
		Make_Tobocco_DB_Data db = new Make_Tobocco_DB_Data();
		String[] arrName = {"DUNHLL", "MEVIUS", "Marlboro", "PARLIAMENT", "ENTZ", "THIS"};

		/*for (int i=0; i<arrName.length; i++) {
			int result = db.dbSelect(arrName[i]);
			System.out.println(arrName[i] + " : " + result);
		}*/
		db.dbInsert();
	}
}















