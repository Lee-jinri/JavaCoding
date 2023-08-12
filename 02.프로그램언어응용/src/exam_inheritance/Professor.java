package exam_inheritance;

public class Professor extends Person {  // 상속 : 부모클래스 person, 자식클래스 professor
	
	public Professor() {
		System.out.println("Professor 생성자 호출");
	}
	public Professor(String name, int age, String subject) {
		/*super();
		  setName(name);
		  setAge(age); */
		super(name, age); // 수퍼클래스의 생성자 호출, public Person(String name, int age){}
		this.subject = subject;
		System.out.println("Professor (name, age, subject) 생성자 호출");
	}
	
	private String subject; // 필드
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return super.toString() + " : " + getSubject(); 
		// 같은 클래스에 있는 걸 쓰는 거라서 getSubject() 말고 그냥 subject해도됨
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
