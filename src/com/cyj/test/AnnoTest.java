package com.cyj.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnoTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		try {
			// 获取class annotation
			Class cla = Class.forName("com.cyj.test.MyAnnoModel");
			boolean flag = cla.isAnnotationPresent(MyAnno.class);
			if (flag) {
				MyAnno ma = (MyAnno) cla.getAnnotation(MyAnno.class);
				System.out.println(ma.name());
			}
			// 获取Field annotation
			Field[] fs = cla.getDeclaredFields();
			for (Field field : fs) {
				flag = field.isAnnotationPresent(MyAnno.class);
				if (flag) {
					MyAnno ma = (MyAnno) field.getAnnotation(MyAnno.class);
					System.out.println(ma.name());
				}
			}

			// 获取method annotation
			Method[] mt = cla.getDeclaredMethods();
			for (Method method : mt) {
				flag = method.isAnnotationPresent(MyAnno.class);
				if (flag) {
					MyAnno ma = (MyAnno) method.getAnnotation(MyAnno.class);
					System.out.println(ma.name());
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
