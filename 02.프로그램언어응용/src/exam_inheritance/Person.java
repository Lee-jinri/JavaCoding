package exam_inheritance;

public class Person {
	private String name;  		 // 필드 1
	private int age;	  		 // 필드 2
	
	// 생성자 오버로딩 : 같은 클래스에서 같은 이름의 메소드를 여러변 선언하는 것 (매개변수의 개수, 타입이 달라야 됨)
	public Person() {  // 디폴트 생성자
		System.out.println("Person 생성자 호출");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public String toString() {   	// 문자열 toString
		return name + " : " + age;
	}

}
