package com.yaoge.designPattern.singleton;
/**
 * 优点：
 * 	1.节约系统资源
 * 	2.严格控制客户的访问方式和时间
 * 
 * 缺点：
 * 	1.单例模式没有抽象层，所以扩展困难
 * 	2.单例类的职责过重，一定程度上违背了 单一职责原则
 * 
 * 使用场景：
 * 	1.系统只需要一个实例对象或者需要考虑资源开销太大只允许创建一个对象
 * 	2.客户调用类的单个实例只允许使用一个公共的访问点，除了该访问点，不能通过其他途径访问该实例
 * 
 * @author YaoGe
 *
 */
public class SingletonDemo {
	
	/**
	 * 构造器私有化，只有类内部才可以调用
	 */
	private SingletonDemo(){
		
	}	
	
//	//方案一
//	//利用静态变量来记录SingletonDemo的唯一实例
//	private static SingletonDemo singletonDemo;
//	
//	//使用synchronized，保证线程安全
//	public static synchronized SingletonDemo getInstance(){
//		if (singletonDemo==null) {
//			singletonDemo=new SingletonDemo();
//		}
//		return singletonDemo;
//	}
	
//	//方案二
//	//直接初始化静态变量，保证线程安全
//	private static SingletonDemo singletonDemo=new SingletonDemo();	
//	
//	public static SingletonDemo getInstance(){
//		return singletonDemo;
//	}
	
//	//方案三
//	//volatile 关键字确保singletonDemo变量被初始化成单例时，多线程能正确处理singletonDemo变量
//	private volatile static SingletonDemo singletonDemo;
//	
//	//双重检查加锁，在getInstance中减少使用同步
//	public static SingletonDemo getInstance(){
//		if (singletonDemo==null) {
//			synchronized (SingletonDemo.class) {
//				if (singletonDemo==null) {
//					singletonDemo=new SingletonDemo();
//				}
//			}
//		}
//		return singletonDemo;
//	}	

}
