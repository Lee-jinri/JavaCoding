package 컬렉션3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//1, 1에서 100중에 임의의 정수값 10개를 얻어 데이터를 저장한 후 출력하고 오름차순으로 정렬하여 데이터를 출력한다. (중복 허용)
//* - Random
//* - ArrayList 
//* - Sort
public class RandomList {

	public static void main(String[] args) {
		Random r = new Random();
		
		// 랜덤한 숫자를 얻는다.
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			list.add(r.nextInt(100)+1);
		}
		
		System.out.println("정렬 전 list 데이터");
		// 반복자를 사용한다.
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + "\t");
		}
		
		// 정렬한다: sort
		Collections.sort(list);
		System.out.println("\n정렬 후 list 데이터");
		for(Integer i : list) {
			System.out.print(i+ "\t");
		}
		
	}

}
