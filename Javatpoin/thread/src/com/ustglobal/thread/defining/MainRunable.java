package com.ustglobal.thread.defining;

public class MainRunable {

	public static void main(String[] args) {
		
		System.out.println("main Started");
		MyRunable r1 = new MyRunable();
		Thread t1=new Thread(r1);
		t1.start();
		/*
		 * for (int i = 0; i < 10; i++) { System.out.println("main class"); }
		 */
		System.out.println("ended main");
	}
}