package com.js.WeeklyPay;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WeeklyPay_CLI {
	String name;
	int workTime;
	int hourly;
	int overTime;
	int weekly;
	
	public WeeklyPay_CLI (String name, int workTime, int hourly) {
		this.name = name;
		this.workTime = workTime;
		this.hourly = hourly;
		
		if (this.workTime > 40) {
			this.overTime = this.workTime-40;
			this.workTime = this.workTime-this.overTime;
		}
		this.weekly = (int)((this.workTime*this.hourly)+((this.hourly*1.5)*this.overTime));
	}
	public String payMent() {
		DecimalFormat df = new DecimalFormat("#,###");	//õ���� �޸� ���
		return df.format(this.weekly);
	}

	public static void main(String[] args) {
		String name;
		int workTime;
		int hourly;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.nextLine();
		System.out.print("�ٹ��ð��� �Է��ϼ���: ");
		workTime = sc.nextInt();
		System.out.print("�ñ��� �Է��ϼ���: ");
		hourly = sc.nextInt();
		sc.close();
		
		WeeklyPay_CLI wp = new WeeklyPay_CLI (name, workTime, hourly);
		System.out.println(name+"�� �ֱ�: "+wp.payMent()+"��");
	}
}
