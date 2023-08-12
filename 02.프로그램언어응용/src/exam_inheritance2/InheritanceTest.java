package exam_inheritance2;

public class InheritanceTest {

	public static void main(String[] args) {
		// 실행 클래스
		// 한꺼번에 설정해주도록 만들어둔 메소드 emp를 사용한당
		
		// 실행결과 1
//		Employee emp = new Employee();
//		emp.setEmpdata("김철수", "서울시 강남구", "010-1234-5678", 1000000);

//		System.out.println(emp.toString());
		
//		Manager mgr = new Manager();
//		mgr.setMgrData("임연수", "경기도 고양시", "010-0000-0000", 1500000, "총괄 매니저", 100000);
		
//		System.out.println(mgr.toString());
	
		// 실행결과 2
		Employee emp = new Employee("김철수","서울시 강남구","010-1234-5678",200000);
		System.out.println(emp.toString());
		
		Manager mgr = new Manager("홍길동","서울시 성동구","010-0000-0000",2000000,100000,"대리");
		System.out.println(mgr.toString());
		
//		Employee[] e = new Employee[2];
//		e[0] = new Employee("김철수","서울시 영등포구","010-1234-5678",2000000);
//		e[1] = new Manager("홍길동","서울시 성동구","010-0000-0000",2000000,"대리",100000);
		
		
//      개별적으로 설정한 것
//		Employee e = new Employee();
//		Manager m = new Manager();		
				
//		// Employee의 정보 입력
//		e.setName("김철수");
//		e.setAddress("서울시 강남구");
//		e.setPhoneNumber("010-1234-1234");
//		e.setSalary(1000000);
		
//		Manager의 정보 입력
//		m.setName("임연수");
//		m.setAddress("경기도 김포시");
//		m.setPhoneNumber("010-0000-0000");
//		m.setSalary(1500000);
//		m.setBonus(100000);
//		m.setJob("총괄 매니저");
		
		

		
		
		
		
		
		
		
	}

}
