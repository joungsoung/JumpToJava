package com.js.Interface;

public class ZooKeeper {
	public void feed(Predator predator) {
		System.out.println("feed "+predator.getName());
	}
	public static void main(String[] args) {
		Tiger ti = new Tiger();
		ti.setName("tiger");
		
		Lion li = new Lion();
		li.setName("lion");
		
		ZooKeeper zk = new ZooKeeper();
		zk.feed(ti);
		zk.feed(li);
	}
}
