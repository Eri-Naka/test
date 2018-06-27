package com.practice.action;

public class PlaceAction {

	private String place;
	private String value;

	private String place1;


	public String execute(){
		place1 = value + place + "県出身です。";
		return "ok";
	}

	public void setPlace(String p1){
		place = p1 ;
	}



	public void setValueAAA(String value) {
		this.value = value;
	}

	public String getPlace1(){
		return place1;
	}

}
