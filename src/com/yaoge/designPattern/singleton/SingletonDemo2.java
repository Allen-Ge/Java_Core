package com.yaoge.designPattern.singleton;

public class SingletonDemo2 {
	
	private SingletonDemo2(){
		
	}
	
	//直接初始化静态变量，保证线程安全
	private static SingletonDemo2 singletonDemo2 =new SingletonDemo2();
	
	public static SingletonDemo2 getInstance(){
		return singletonDemo2;
	}
	
}
