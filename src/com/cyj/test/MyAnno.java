package com.cyj.test;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 
 * MyAnno
 * chengyj
 * 2015年6月9日 下午1:47:21
 * @Retention用来声明注解的保留策略，有CLASS、RUNTIME和SOURCE这三种，分别表示注解保存在类文件、JVM运行时刻和源代码中。
 * 只有当声明为RUNTIME的时候，才能够在运行时刻通过反射API来获取到注解的信息。
 * 
 * @Target用来声明注解可以被添加在哪些类型的元素上，如类型、方法和域等。
 *
 *@Documented 用来声明生成javadoc时是否保存注解信息
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})
public @interface MyAnno {
	
	public String name() default "1";

}
