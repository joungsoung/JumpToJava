package com.js.Test;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {							//조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);
	}
	public String toString() {		//Object클래스의 toString()을 오버라이딩 한다.
		return "TV";
	}
}
class Computer extends Product {
	Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Buyer {						//고객. 물건을 사는 사람
	int money = 1000;				//소유금액
	int bonusPoint = 0;				//보너스 점수
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 구입할수 없습니다.");
			return;
		}
		money -=p.price;			//가진 돈에서 구입한 제품의 가격만큼 뺀다.
		bonusPoint +=p.bonusPoint;	//제품 구입보너스 점수를 추가한다.
		System.out.println(p+" 을/를 구입하셨습니다.");
	}
}

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		b.buy(tv);
		b.buy(com);
		System.out.println("현재 남은 돈은 "+b.money+"원 입니다.");
		System.out.println("현재 보너스점수는 "+b.bonusPoint+" 점 입니다.");
	}
}
