package 컬렉션;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
/* Member 클래스를 생성한다. 필드는 이름(name)과 나이(age)를 가지고 있다.
 * [요구사항]
 * 나이가 같으면 동일 객체로 본다 */
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",50));
		set.add(new Member("홍길동",50));
		set.add(new Member("김철수",36));
		
		// 출력
		System.out.println("총 객체수"+set.size());
		System.out.println("\t"+set.toString());
		
	}

}
