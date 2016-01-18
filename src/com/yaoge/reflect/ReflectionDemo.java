package com.yaoge.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionDemo {
	
	public static void main(String[] args) {
		
		PublicClass publicClass=new PublicClass(1,2,"String1","String2");
		
		System.out.println("publicClass.toString() :"+publicClass);
		
		System.out.println("PublicClass.class :"+PublicClass.class);
		
		System.out.println("publicClass.getClass() :"+publicClass.getClass());
		
		//打印该类所有公开构造器
		System.out.println("publicClass.getClass().getConstructors() :"+Arrays.toString(publicClass.getClass().getConstructors()));
		//打印该类多有构造器
		System.out.println("publicClass.getClass().getDeclaredConstructors() :"+Arrays.toString(publicClass.getClass().getDeclaredConstructors()));
		//打印该类以及父类所有公开方法
		System.out.println("publicClass.getClass().getMethods() :"+Arrays.toString(publicClass.getClass().getMethods()));
		//打印该类所有方法
		System.out.println("publicClass.getClass().getDeclaredMethods() :"+Arrays.toString(publicClass.getClass().getDeclaredMethods()));		
		//打印该类以及父类所有公开字段
		System.out.println("publicClass.getClass().getFields() :"+Arrays.toString(publicClass.getClass().getFields()));
		//打印该类所有字段
		System.out.println("publicClass.getClass().getDeclaredFields() :"+Arrays.toString(publicClass.getClass().getDeclaredFields()));		
				
		try {
			//根据无参构造函数生成新对象
			PublicClass publicClass2= (PublicClass) Class.forName("com.yaoge.reflection.PublicClass").newInstance();
			System.out.println(publicClass2);
			
			//根据有参构造函数生成新对象
			PublicClass publicClass3=(PublicClass) Class.forName("com.yaoge.reflection.PublicClass").getConstructor(int.class,int.class,String.class,String.class).newInstance(3,4,"String3","String4");
			System.out.println(publicClass3);
			
			//方法调用
			Method method= PublicClass.class.getDeclaredMethod("publicGenerateToString");
			System.out.println(method.invoke(publicClass));
			
			//设置字段
			Field field=PublicClass.class.getDeclaredField("publicString");
			field.set(publicClass2, "String6");
			field=PublicClass.class.getDeclaredField("privateString");
			field.setAccessible(true);
			field.set(publicClass2, "String5");			
			System.out.println(publicClass2);			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}
}
