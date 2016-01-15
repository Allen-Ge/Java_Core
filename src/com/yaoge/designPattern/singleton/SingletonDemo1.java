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
public class SingletonDemo1 {
	
	/**
	 * 构造器私有化，只有类内部才可以调用
	 */
	private SingletonDemo1(){
		
	}
	
	//利用静态变量来记录SingletonDemo的唯一实例
	private static SingletonDemo1 singletonDemo;
	
	//使用synchronized，保证线程安全
	public static synchronized SingletonDemo1 getInstance(){
		if (singletonDemo==null) {
			singletonDemo=new SingletonDemo1();
		}
		return singletonDemo;
	}
}
