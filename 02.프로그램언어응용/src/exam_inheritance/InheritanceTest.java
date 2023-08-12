package exam_inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		// 실행클래스
		
		Employee e = new Employee("홍길동", 30, "입학처");
		Professor p = new Professor("김철수", 50, "자바");
		Student s = new Student("김희수", 20 , "컴퓨터과학");
		
		// Employee의 정보 입력
//		e.setName("홍길동");
//		e.setAge(47);
//		e.setDept("행정지원팀");
		
		// Professor의 정보 입력
//		p.setName("김푸름");
//		p.setAge(52);
//		p.setSubject("데이터베이스");
		
		// Student의 정보 입력
//		s.setName("김유빈");
//		s.setAge(20);
//		s.setMajor("자바 프로그래밍 과정");
		
		// 출력
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
		
		
		
		
		
		
		
		
	}

}
