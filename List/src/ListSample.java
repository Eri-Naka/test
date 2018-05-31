import java.util.List;

/**
 *
 */

/**
 * @author internousdev
 *
 */
public class ListSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String>list = new List>();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");


		for(int = 0;i < list.size() -1; i++){
			System.out.println(list.get(i));
		}


		for(String s : list){
			System.out.println(s);
		}



	}

}
