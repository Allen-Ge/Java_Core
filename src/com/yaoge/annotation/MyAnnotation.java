package com.yaoge.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//Retention 注解决定MyAnnotation注解的生命周期
@Target(value={ElementType.TYPE,ElementType.METHOD}) // Target 注解决定MyAnnotaion注解的使用范围
public @interface MyAnnotation {
	
	String color() default "blue"; //为属性指定缺省值
	
	/**
	 * 为注解添加value属性，这个value属性很特殊，如果一个注解中只有一个value属性要设置，
     * 那么在设置注解的属性值时，可以省略属性名和等号不写， 直接写属性值，如@SuppressWarnings("deprecation")，
     * 这里的MyAnnotation注解设置了两个String类型的属性，color和value，
     * 因为color属性指定有缺省值，value属性又是属于特殊的属性，因此使用MyAnnotation注解时
     * 可以这样使用MyAnnotation注解："@MyAnnotation(color="red",value="yaoge")"
     * 也可以这样使用："@MyAnnotation("Yao Ge")"，这样写就表示MyAnnotation注解只有一个value属性要设置，color属性采用缺省值
     * 当一个注解只有一个value属性要设置时，是可以省略"value="的
	 */
	String value();//定义一个名为value的属性
	
	//添加一个枚举类型的属性，并指定属性的缺省值
	TrafficLight light() default TrafficLight.Red;
	
	//为注解添加一个注解类型的属性，并指定注解的缺省值
	MetaAnnotation metaAnnotation() default @MetaAnnotation("yg");
	
	//添加一个int类型数组的属性
	int[] intArray() default {1,2,3};	
}
