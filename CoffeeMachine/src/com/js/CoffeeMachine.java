package com.js;

import javax.swing.JOptionPane;

public class CoffeeMachine {
	
	protected String[] coffeeKind = {"��Ŀ��", "����Ŀ��", "����Ŀ��"};	//�Ǹ��ϰ� �ִ� Ŀ������ �� ��´�.
	protected int[] coffeePrice = {400, 300, 300};				//�Ǹ��ϰ� �ִ� Ŀ���� �������� ������ ��´�.
	private int[] coffeeQty = {10, 0, 10};						//�Ǹ��ϰ� �ִ� Ŀ���� �������� �����ϰ� �ִ� ����(���)�� ��´�(��)

	private String choiceKind;				//���õ� Ŀ������ �� ��´�.
	private int change = 0;					//�Ž����� �� �ʱ�ȭ �Ѵ�.
	private int haveMoney = 1000;			//�Ž����� ���� ������, ���纸�� �ݾ��� ��´�.

	/*
	 ***********************************************************
	 * Ŀ�� ���Ǳ�
	 * *********************************************************
	 * 1. Ŀ�� ���� �� "��Ŀ��' "����Ŀ��" "����Ŀ��" �� �ִ�.
	 * 2. ������ Ŀ�Ǵ� 10�� �з��� ��� �� �ִ�.
	 * 3. ��� 0 �̸� �ش� Ŀ�Ǵ� �Ǹŵ� �� ����.
	 * 4. ������ Ŀ�ǰ����� "��Ŀ��=400��" "����Ŀ��=300��" "����Ŀ��=300��" �̴�.
	 * 5. ���Ե� ������ ���õ� Ŀ�ǰ����� �� ������ �ݾ��� �Ž����� ���� ��������.
	 * 6. ���õ� Ŀ���� ���ݺ��� ���Ե� ���� �������, �Ǹ����� �ʴ´�. �̰��� �մ�(CoffeeMachineMain)
	 *    ���� �����Ѵ�.
	 * */

	/* 
	 * �Ű������� ������ money�� choice�� �޴´�. 
	 * �̰��� CoffeeMachineMainŬ���� ���� InputDialLog�� ���� �Է¹��� ���� �Ѱ� �޴´�.
	 * money�� �Һ��ڰ� ���Ǳ⿡ ������ �ݾ� �̶�� �����ϰ�
	 * choice�� �Һ��ڰ� ���Ǳ� ��ư�� �̿��� ������ Ŀ�� ���� ��� �����Ѵ�.
	 * money��, choice�� �̿��� �Ž��� ��� �� �ݾ� change�� ���Ѵ�.
	 * 
	 * �Ž����� = money - ���õ� Ŀ�ǰ�
	 * */
	
	public void out(int money, int choice) {
		
		this.change = money - coffeePrice[choice-1];
		if (change > haveMoney) {
			JOptionPane.showMessageDialog(null, "�Ž������� �����մϴ�.   ������ �̿��� �ּ���.");
			System.exit(0);
		}
		
		this.choiceKind = coffeeKind[choice-1];
		if (coffeeQty[choice-1] == 0) {
			JOptionPane.showMessageDialog(null, choiceKind + " �� �� �ȷȽ��ϴ�.   ������ �̿��� �ּ���.");
			System.exit(0);
		}
		haveMoney -= change;
		coffeeQty[choice-1] -= 1;
		
		if (change > 0) {
			JOptionPane.showMessageDialog(null, choiceKind + " ��, �Ž����� " + change + "�� �� ��µ˴ϴ�.");
		} else {
			JOptionPane.showMessageDialog(null, choiceKind + " �� ��µ˴ϴ�.");
		}
		System.exit(0);
	}
}
