package 제네릭;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTest {

	public static void main(String[] args) {
		String[] s = {"사과","배","바나나"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(s));

		// 1
		list.add("포도"); 
		System.out.println(list);
		
		//2
		list.add(2,"자몽"); 
		System.out.println(list);
		
		//3
		System.out.println(list.get(3));
		
		//4 
		list.remove(1); System.out.println(list);
		
		//5
		System.out.println(list.contains("사과"));
		
		//6
		System.out.println(list.indexOf("사과"));
		
	}

}
