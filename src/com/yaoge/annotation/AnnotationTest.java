package com.yaoge.annotation;

import java.util.Arrays;

@MyAnnotation(
		color="pink",
		light=TrafficLight.Green,
		metaAnnotation=@MetaAnnotation("Yao Ge"),
		intArray={4,5,6},
		value="MyAnnotationTest"
		)
public class AnnotationTest {
	@MyAnnotation("注解在方法上")
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		//检查AnnotationTest类是否有MyAnnotation注解
		if (AnnotationTest.class.isAnnotationPresent(MyAnnotation.class)) {
			
			MyAnnotation myAnnotation= AnnotationTest.class.getAnnotation(MyAnnotation.class);
			System.out.println(myAnnotation.color());
			System.out.println(myAnnotation.light());
			System.out.println(myAnnotation.metaAnnotation().value());
			System.out.println(Arrays.toString(myAnnotation.intArray()));
			System.out.println(myAnnotation.value());			
		}
		System.out.println("------------------分割线-----------------------");
		if (AnnotationTest.class.getMethod("main", String[].class).isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation myAnnotation=AnnotationTest.class.getMethod("main", String[].class).getAnnotation(MyAnnotation.class);
			System.out.println(myAnnotation.color());
			System.out.println(myAnnotation.light());
			System.out.println(myAnnotation.metaAnnotation().value());
			System.out.println(Arrays.toString(myAnnotation.intArray()));
			System.out.println(myAnnotation.value());	
		}		
	}	
}
