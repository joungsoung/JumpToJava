package com.js.Io;

public class Question extends Calculator {
	public Question(int x, int y) {
		super(x, y);
	}
	public void mult() {
		super.rightAnswer = super.x * super.y;
		System.out.print(x + "*" + y + "=");
		scanner();
	}
	public static void main(String[] args) {
		int x = (int) (Math.random() * 10 + 1);
		int y = (int) (Math.random() * 10 + 1);
		Question que = new Question(x, y);
		
		que.sum();
		que.mult();
	}
}
