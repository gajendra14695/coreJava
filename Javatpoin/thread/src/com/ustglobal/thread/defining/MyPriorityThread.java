package com.ustglobal.thread.defining;

public class MyPriorityThread  extends Thread {

public static void main(String[] args) {
	
	System.out.println("Main Started");

	int p= Thread.currentThread().getPriority();
	System.out.println("Main  thread Priority "+p);
	Thread.currentThread().setPriority(7);
	System.out.println("main thread priority "+Thread.currentThread().getPriority());

	MyPriorityThread t1= new MyPriorityThread();
	int q =t1.getPriority();
	System.out.println("My_Thread thread priority "+q);
	
	t1.setPriority(6);
System.out.println("MyPriority thread prority "+t1.getPriority());

System.out.println("Ended main");


}


}
	

