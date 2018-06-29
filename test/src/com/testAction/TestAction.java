package com.testAction;

public class TestAction {

	private String name1;
	private String name2;
	private String name;


	public void setName1(String na1){
		name1 = na1;
	}

	public void setName2(String na2){
		System.out.println("A");
		name2 = na2;
	}

	public String ok(){
		System.out.println(2);
		name = name1 + name2;
		return "success";
	}

	public String getName(){
		return name;
	}

}
