package com.js;

import java.sql.SQLException;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Tobacco_Main extends Tobacco {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DecimalFormat df = new DecimalFormat("#,##0");
		Tobacco tb = new Tobacco();
		String[] arrName = {"DUNHLL", "MEVIUS", "Marlboro", "PARLIAMENT", "ENTZ", "THIS"};
		String[] arrChoice = {"�԰�", "���", "���Ȯ��"};
		String name;
		String choice;
		int oldStock;
		int qty, result;
		
		
		choice = (String)JOptionPane.showInputDialog(null, "�۾�����", "�۾�����", JOptionPane.QUESTION_MESSAGE,
				null, arrChoice, null);
		
		name = (String)JOptionPane.showInputDialog(null, "��ǰ����", "��ǰ����", JOptionPane.QUESTION_MESSAGE,
				null, arrName, null);
		
		oldStock = tb.getStock(name);

		if (choice.equals("���Ȯ��")) {
			JOptionPane.showMessageDialog(null,
					name + "  ��� : " + df.format(oldStock));
			System.exit(0);
		}
		
		String var = JOptionPane.showInputDialog(null, "�����Է�", "�����Է�", JOptionPane.QUESTION_MESSAGE);
		qty = Integer.parseInt(var);

		if (choice.equals("���")) {
			oldStock = tb.getStock(name);
			if (oldStock < qty) {
				JOptionPane.showMessageDialog(null, "������\n"
						+ name + " ��� : " + oldStock);
				System.exit(0);
			}
		} else if (choice.equals("�԰�")) {
			result = tb.insert(name, choice, qty);
			if (result == 0) {
				JOptionPane.showMessageDialog(null, "��ǰ : " + name + "\n" + "���� : " +
						qty + "\n" + "�����۾� : " + choice + "\n" + "��� : ó���Ϸ�");
			} else if (result == 1) {
				JOptionPane.showMessageDialog(null, "�۾�����\n" + "������ ���� �����ϼ���"); 
			}
		}
	}
}
