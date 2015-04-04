package com.js.Test;

class Parent {
	int x = 100;
	void mathod() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;
	void mathod() {
		System.out.println("Child method");
	}
}

public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x= "+p.x);
		p.mathod();
		
		System.out.println("c.x= "+c.x);
		c.mathod();
	}
}
