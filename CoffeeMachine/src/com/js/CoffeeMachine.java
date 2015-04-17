package com.js;

import javax.swing.JOptionPane;

public class CoffeeMachine {
	
	protected String[] coffeeKind = {"블랙커피", "설탕커피", "프림커피"};	//판매하고 있는 커피종류 를 담는다.
	protected int[] coffeePrice = {400, 300, 300};				//판매하고 있는 커피의 종류마다 가격을 담는다.
	private int[] coffeeQty = {10, 0, 10};						//판매하고 있는 커피의 종류마다 보유하고 있는 수량(재고)을 담는다(잔)

	private String choiceKind;				//선택된 커피종류 를 담는다.
	private int change = 0;					//거스름돈 을 초기화 한다.
	private int haveMoney = 1000;			//거스름돈 으로 내어줄, 현재보유 금액을 담는다.

	/*
	 ***********************************************************
	 * 커피 자판기
	 * *********************************************************
	 * 1. 커피 종류 는 "블랙커피' "설탕커피" "프림커피" 가 있다.
	 * 2. 각각의 커피는 10잔 분량의 재고 가 있다.
	 * 3. 재고가 0 이면 해당 커피는 판매될 수 없다.
	 * 4. 각각의 커피가격은 "블랙커피=400원" "설탕커피=300원" "프림커피=300원" 이다.
	 * 5. 투입된 돈에서 선택된 커피가격을 뺀 나머지 금액은 거스름돈 으로 내보낸다.
	 * 6. 선택된 커피의 가격보다 투입된 돈이 적을경우, 판매하지 않는다. 이것은 앞단(CoffeeMachineMain)
	 *    에서 구현한다.
	 * */

	/* 
	 * 매개변수로 정수형 money와 choice를 받는다. 
	 * 이값은 CoffeeMachineMain클래스 에서 InputDialLog를 통해 입력받은 값을 넘겨 받는다.
	 * money는 소비자가 자판기에 투입한 금액 이라고 가정하고
	 * choice는 소비자가 자판기 버튼을 이용해 선택한 커피 종류 라고 가정한다.
	 * money와, choice를 이용해 거슬러 줘야 할 금액 change를 구한다.
	 * 
	 * 거스름돈 = money - 선택된 커피값
	 * */
	
	public void out(int money, int choice) {
		
		this.change = money - coffeePrice[choice-1];
		if (change > haveMoney) {
			JOptionPane.showMessageDialog(null, "거스름돈이 부족합니다.   다음에 이용해 주세요.");
			System.exit(0);
		}
		
		this.choiceKind = coffeeKind[choice-1];
		if (coffeeQty[choice-1] == 0) {
			JOptionPane.showMessageDialog(null, choiceKind + " 는 다 팔렸습니다.   다음에 이용해 주세요.");
			System.exit(0);
		}
		haveMoney -= change;
		coffeeQty[choice-1] -= 1;
		
		if (change > 0) {
			JOptionPane.showMessageDialog(null, choiceKind + " 와, 거스름돈 " + change + "원 이 출력됩니다.");
		} else {
			JOptionPane.showMessageDialog(null, choiceKind + " 가 출력됩니다.");
		}
		System.exit(0);
	}
}
