package com.acorn.Threads;

public class RunnableThreadTest1 {

	public static void main(String[] args) {
		Runnable threadFirst = new RunnableThread1(0,250000,1);
		Runnable threadSecond = new RunnableThread1(250001, 500000, 2);
		Runnable threadThird = new RunnableThread1(500001, 750000, 3);
		Runnable threadFourth = new RunnableThread1(750001, 1000000, 4);
		
		Thread thread1 = new Thread(threadFirst);
		Thread thread2 = new Thread(threadSecond);
		Thread thread3 = new Thread(threadThird);
		Thread thread4 = new Thread(threadFourth);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
