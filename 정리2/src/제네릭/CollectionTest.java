package ���׸�;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTest {

	public static void main(String[] args) {
		String[] s = {"���","��","�ٳ���"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(s));

		// 1
		list.add("����"); 
		System.out.println(list);
		
		//2
		list.add(2,"�ڸ�"); 
		System.out.println(list);
		
		//3
		System.out.println(list.get(3));
		
		//4 
		list.remove(1); System.out.println(list);
		
		//5
		System.out.println(list.contains("���"));
		
		//6
		System.out.println(list.indexOf("���"));
		
	}

}
