package com.endomath.action;

import java.util.ArrayList;
import java.util.List;



public class EndoMathAction {


	private int number;
	private List<Integvver> list = new ArrayList<Integer>();




	public void setNumber(int number){
		this.number = number;
	}


	public String execute(){

		int answer;
		int a = 1;
		while( a <= 10 ){
			answer = number * a ;
			a++;

		}
		return "OK";
	}



	public int getList(){
		return list;
	}

}
