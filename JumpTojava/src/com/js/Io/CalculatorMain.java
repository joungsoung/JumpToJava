package com.js.Io;

public class CalculatorMain extends Calculator {
	public CalculatorMain(int x, int y) {
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
		CalculatorMain que = new CalculatorMain(x, y);
		
		que.sum();
		//que.mult();
	}
}
