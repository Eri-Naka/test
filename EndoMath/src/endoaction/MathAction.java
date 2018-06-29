package endoaction;

public class MathAction {

	private int number1;
	private int number2;
	private int sign;

	private int answer;


	public void setNumber1(int number1){
		System.out.println(number1);
		this.number1 = number1;
	}

	public void setNumber2(int number2){
		this.number2 = number2;
	}

	public void setSign(int sign){
		this.sign = sign;
	}


	public String execute(){

		System.out.println(number1);
		System.out.println(number2);
		System.out.println(sign);

		if( sign == 1 ){
			answer = number1 + number2;
		}
		if( sign == 2){
			answer = number1 - number2;
		}
		if( sign == 3 ){
			answer = number1 * number2;
		}
		if( sign == 4){
			answer = number1 / number2;
		}
		System.out.println(answer);

		return "OK";
	}

	public int getAnswer(){
		return answer;
	}

}
