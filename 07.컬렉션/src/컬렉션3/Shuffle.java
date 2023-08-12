package 컬렉션3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
	// 메인메소드
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=2; i <= 10; i++)
			list.add(i);
		
		// 리스트의 순서를 무작위로 섞는다.
		Collections.shuffle(list);
		System.out.println(list.toString());
	}

}
