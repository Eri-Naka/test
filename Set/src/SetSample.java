/**
 *
 */

/**
 * @author internousdev
 *
 */
import java.util.HashSet;
import java.util.Set;
public class SetSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<String>set = new HashSet<String>();


		set.add("value1");
		set.add("value2");
		set.add("value3");
		set.add("value4");
		set.add("value5");

		set.add("value2");


		for(String s : set){
			System.out.println(s);
		}



	}

}