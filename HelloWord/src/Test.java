/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args){



		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "111-111-1111";
		jiro.address = "jirojirominaide@yahoo.co.jp";
		jiro.birth = "1990.8.10";

		System.out.print(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		System.out.println(jiro.birth);
		jiro.talk();
		jiro.walk();
		jiro.run();


		Person hanako= new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber="222-2222-2222";
		hanako.address="hanakoimatoire@yahoo.co.jp";
		hanako.birth = "1995.5.18";

		System.out.print(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		System.out.println(hanako.birth);
		hanako.talk();
		hanako.walk();
		hanako.run();


		Person eri = new Person();
		eri.name = "中山恵里";
		eri.age = 24;
		eri.phoneNumber="333-3333-3333";
		eri.address="imayamanonaka@yahoo.co.jp";
		eri.birth = "1993.12.16";


		System.out.print(eri.name);
		System.out.println(eri.age);
		System.out.println(eri.phoneNumber);
		System.out.println(eri.address);
		System.out.println(eri.birth);
		eri.talk();
		eri.walk();
		eri.run();



	    Robot asimo = new Robot();
	    asimo.name = "ASIMO";
	    asimo.talk();
	    asimo.walk();
	    asimo.run();
	    System.out.println(asimo.name);

	    Robot pepper = new Robot();
	    pepper.name = "ペッパーくん";
	    pepper.talk();
	    pepper.walk();
	    pepper.run();
	    System.out.println(pepper.name);


	    Robot doraemon = new Robot();
	    doraemon.name = "ドラえもん";
	    doraemon.talk();
	    doraemon.walk();
	    doraemon.run();
	    System.out.println(doraemon.name);



		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;

		System.out.println(taro.name);
		System.out.println(taro.age);


		Person jirou = new Person("jirou",20);
		System.out.println(jirou.name);
		System.out.println(jirou.age);

		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);


		Person a = new Person(25);
		System.out.println(a.name);
		System.out.println(a.age);

		Person hanako1 = new Person(17,"hanako");
		System.out.println(hanako1.name);
		System.out.println(hanako1.age);









	}

}