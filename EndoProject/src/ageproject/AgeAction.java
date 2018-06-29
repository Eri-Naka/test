package ageproject;

public class AgeAction {

	private int age;

	private String send;


	public String execute() {


		//ここでしか使わないからここに書く
		if (age < 20) {
			send = "未成年";

		} else {
			send = "成人";

		}

		return "OK";
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSend(){
		return send;
	}




}
