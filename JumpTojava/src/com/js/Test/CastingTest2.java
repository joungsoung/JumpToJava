package com.js.Test;

public class CastingTest2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;

		car.drive();
		fe = (FireEngine)car;	/* 실행시 에러가 발생한다.(조상타입의 인스턴스 를
		자손타입의 참조변수로 참조하는 것을 허용하지 않는다. --> Child c = new Person(); */
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}
