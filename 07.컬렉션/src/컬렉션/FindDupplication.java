package 컬렉션;

import java.util.HashSet;
import java.util.Set;

/* 전체 문자에서 중복된 단어를 검출하는 프로그램을 작성해보자.
 * 이 예제 HashSet을 이용하여 코딩해보세요.
 * String[] sample = { "단어","의미","구절","의미","단락"}
 * 
 * [출력 결과]
 * 중복된 단어 : 의미
 * 단어 수 : 4
 * 중복되지 않은 단어 : [단락, 의미, 구절, 단어] */

public class FindDupplication {
	public static void main(String[] args) {
		
		String[] sample = {"단어","의미","구절","의미","단락"};
		Set<String> s = new HashSet<String>();
		
		// 중복된 단어
		for (String a : sample) { // sample을 하나씩 a로 만듦
			if (!s.add(a))  // !(부정연산자) true -> false false -> true. if(s.add(a) == false
				// 만약 a가 추가되지 않는다면 true
				System.out.println("중복된 단어: " + a);
		}
		
		// 출력
		System.out.println("단어 수 : "+s.size());
		System.out.println("중복되지 않은 단어: " + s.toString()); 
		// toString - HashSet의 배열 출력
	}

	
}
