package com.cyj.test;

@MyAnno(name="class annotation")
public class MyAnnoModel {
	
	@MyAnno(name="filed annotation1")
	private String name;
	
	@MyAnno(name="filed annotation2")
	private String age;
	
	@MyAnno(name="method annotation")
	public void getAnnoName(){
		System.out.println("Test Anno");
	}

}
