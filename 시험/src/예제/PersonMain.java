package ����;

class Person {
	private String name;
	private int age;
	
	// ������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// ������
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// ������
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String show() {
		return "�̸� : " + name + ", " + "���� : "+ age;
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
		return super.show() + ", �й� : " + number;
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
		Person person = new Person("ȫ�浿",56);
		Student student = new Student("�Ѵú�",42,99010001);
		ForeignStudent foreign = new ForeignStudent("Olivia",39,97060004,"U.S.A");
		
		System.out.println("���[ " + person.show() + "]");
		System.out.println("�л�[ " + student.show() + "]");
		System.out.println("�ܱ��л�[ " + foreign.show() + "]" );
	}
}