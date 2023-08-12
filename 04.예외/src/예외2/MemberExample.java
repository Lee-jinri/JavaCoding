package 예외2;

/* 아이디와 나이를 필드로 가진 Member 클래스를 생성한다.
 * 각각의 객체를 생성하여 나이가 같으면 두 객체는 "동등합니다"
 * 또는 나이가 다르면 두 객체는 "동등하지 않습니다"라고 출력할 수 있도록
 * 실행클래스를 작성하세요
 */

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("blue1234",25);
		Member m2 = new Member("blue1234",27);
		Member m3 = new Member("yellow77",25);
	
		// 객체의 참조값 비교 -> 나이를 비교하지 않고 주소만 비교해버림~!
		System.out.println("m1==m2 = " + (m1 == m2));
		// 참조형의 주소값이 다르기때문에 false
		
		m3 = m1;
		System.out.println("m1==m3 = "+(m1 == m3));
		// 주소값을 동일하게 만들었기 때문에 true
		
		// equals()메서드 재정의 후 다시 확인.
		if(m1.equals(m2)) {
			System.out.println("m1과 m2는 동등합니다.");
		}else {
			System.out.println("m1과 m2는 동등하지 않습니다.");
		}
		// 참조형의 주소값이 다르기때문에 false
		
		if (m1.equals(m3)) {
			System.out.println("m1과 m3는 동등합니다.");
		}else {
			System.out.println("m1과 m3는 동등하지 않습니다.");
		}
		// 주소값을 동일하게 만들었기 때문에 true
	}

}
