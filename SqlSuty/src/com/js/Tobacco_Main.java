package com.js;

import java.sql.SQLException;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Tobacco_Main extends Tobacco {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DecimalFormat df = new DecimalFormat("#,##0");
		Tobacco tb = new Tobacco();
		String[] arrName = {"DUNHLL", "MEVIUS", "Marlboro", "PARLIAMENT", "ENTZ", "THIS"};
		String[] arrChoice = {"입고", "출고", "재고확인"};
		String name;
		String choice;
		int oldStock;
		int qty, result;
		
		
		choice = (String)JOptionPane.showInputDialog(null, "작업선택", "작업선택", JOptionPane.QUESTION_MESSAGE,
				null, arrChoice, null);
		
		name = (String)JOptionPane.showInputDialog(null, "재품선택", "재품선택", JOptionPane.QUESTION_MESSAGE,
				null, arrName, null);
		
		oldStock = tb.getStock(name);

		if (choice.equals("재고확인")) {
			JOptionPane.showMessageDialog(null,
					name + "  재고 : " + df.format(oldStock));
			System.exit(0);
		}
		
		String var = JOptionPane.showInputDialog(null, "수량입력", "수량입력", JOptionPane.QUESTION_MESSAGE);
		qty = Integer.parseInt(var);

		if (choice.equals("출고")) {
			oldStock = tb.getStock(name);
			if (oldStock < qty) {
				JOptionPane.showMessageDialog(null, "재고부족\n"
						+ name + " 재고 : " + oldStock);
				System.exit(0);
			}
		} else if (choice.equals("입고")) {
			result = tb.insert(name, choice, qty);
			if (result == 0) {
				JOptionPane.showMessageDialog(null, "제품 : " + name + "\n" + "수량 : " +
						qty + "\n" + "선택작업 : " + choice + "\n" + "결과 : 처리완료");
			} else if (result == 1) {
				JOptionPane.showMessageDialog(null, "작업오류\n" + "관리자 에게 문의하세요"); 
			}
		}
	}
}
