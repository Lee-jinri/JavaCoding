package exam_inheritance;

public class Student extends Person { // 상속 : 부모클래스 person, 자식클래스 student
	private String major;  // 필드생성 major 인스턴스변수
	
	public Student() {
		System.out.println("Student 생성자 호출");
		
	}
	public Student(String name, int age, String major) {
		/*super();
		  setName(name);
		  setAge(age); */
		super(name, age); // 수퍼클래스의 생성자 호출, public Person(String name, int age){}
		this.major = major;
		System.out.println("Student(name, age, major) 생성자 호출");
	}
	
	public String getMajor() {  // 접근자
		return major;
	}
	
	public void setMajor(String major) {  // 설정자
		this.major = major;
	}
	
	@Override // 부모 클래스의 메소드와 선언부가 같은지 검사하는 것
			  // 재정의를 의도했다고 확실하게 전달함 -> 오류방지
			  // 이걸 안쓰고 오타를 내면 오류가 안 남.
			  // 이걸 쓰고 오타를 내면 오류가 남.
	public String toString() {
		return super.toString() + " : " + major;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
