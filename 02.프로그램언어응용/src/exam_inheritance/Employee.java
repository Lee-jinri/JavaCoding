package exam_inheritance;

public class Employee extends Person {   // 상속 
	private String dept;				 // 부서명 필드
	
	public Employee() {
		super();  // 생략해도 알아서 됨
		System.out.println("Employee 생성자 호출");
	}
	
	public Employee(String name, int age, String dept) {
		/*super();
		  setName(name);
		  setAge(age); */
		super(name, age); // 수퍼클래스의 생성자 호출, public Person(String name, int age){}
		this.dept = dept;
		System.out.println("Employee(name, age, dept) 생성자 호출");
	}
	
	public String getDept() {		// 접근자
		return dept;
	}
	
	public void setDept(String dept) {   // 설정자
		this.dept = dept;
	} 
	/* 이렇게 해도 됨. 결과 값 동일
	public String toString() {
		return getName() + "  :" + getAge() + ":" + dept;
	*/
	
	
	 public String toString() {
	 		return super.toString() + " : " + getDept();
	 //			    ( name : age )
	  
	 // super.toString(); // 부모가 갖고 있는 toString을 갖고온다.

	

	}

}
