package com.yaoge.thread;

/**
 * 
 * 
 * 
 * @author YaoGe
 *
 */
public class ThreadDemo {

	public static void main(String[] args) {
		Thread thread= Thread.currentThread();
		System.out.println(thread.isInterrupted());
	}
}

class MyThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}		
	}	
}
