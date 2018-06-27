package com.practice.action;

public class NameAction {

	private String name;
	private int age;

	private String send;

	public String execute(){
		send = name + "さんは" + age + "歳です。";
		return "ok";
	}

	public void setName(String n){
		name = n;
	}

	public void setAge(int a){
		age = a;
	}

	public String getSend(){
		return send;
	}
}
