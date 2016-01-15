package com.yaoge.designPattern.singleton;

public class SingletonDemo3 {
	
	private SingletonDemo3(){
		
	}
	
	//volatile 关键字确保singletonDemo变量被初始化成单例时，多线程能正确处理singletonDemo变量
	private static volatile SingletonDemo3 singletonDemo3;
	
	//双重检查加锁，在getInstance中减少使用同步
	public static SingletonDemo3 getInstance(){
		if (singletonDemo3==null) {
			synchronized (SingletonDemo3.class) {
				if (singletonDemo3==null) {
					singletonDemo3=new SingletonDemo3();
				}
			}			
		}		
		return singletonDemo3;
	}
}
