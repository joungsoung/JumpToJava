package com.js.Extends;

public class HouseDog2 extends Dog {
	public HouseDog2(String name) {
		this.setName(name);
	}
	public void sleep() {
		System.out.println(this.name+" zzz");
	}
	public static void main(String[] args) {
		HouseDog2 dog = new HouseDog2("happy");
		System.out.println(dog.name);
	}
}
