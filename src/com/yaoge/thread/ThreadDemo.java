package com.yaoge.thread;





/**
 *  
 * 
 * @author YaoGe
 *
 */
public class ThreadDemo {

	public static void main(String[] args) throws Exception {
		Thread thread= Thread.currentThread();
		System.out.println(thread.isInterrupted());		
		
	}	
	
	
	
	
}

class OuterClass{
	
	class InnerClass{
		
		public void test(){
			
		}
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
