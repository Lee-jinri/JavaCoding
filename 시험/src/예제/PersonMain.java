package 예제;

class Person {
	private String name;
	private int age;
	
	// 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 접근자
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// 설정자
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String show() {
		return "이름 : " + name + ", " + "나이 : "+ age;
	}
}


class Student extends Person {
	private int number;
	
	public Student(String name, int age, int number) {
		super(name, age);
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String show() {
		return super.show() + ", 학번 : " + number;
	}
}

class ForeignStudent extends Student{
	private String nationality;
	
	public ForeignStudent(String name, int age, int number, String nationality) {
		super(name,age,number);
		this.nationality = nationality;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}

public class PersonMain{
	public static void main(String[] args) {
		Person person = new Person("홍길동",56);
		Student student = new Student("한늘봄",42,99010001);
		ForeignStudent foreign = new ForeignStudent("Olivia",39,97060004,"U.S.A");
		
		System.out.println("사람[ " + person.show() + "]");
		System.out.println("학생[ " + student.show() + "]");
		System.out.println("외국학생[ " + foreign.show() + "]" );
	}
}