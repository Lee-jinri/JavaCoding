package 컬렉션;

/* 한 명의 학생 정보를 Student 클래스에는 이름, 학과, 학번, 학점평균을 저장하는 필드가 있다.
 * [요구사항]
 * 실행 클래스의 이름은 StudentManager이다.
 * 사용자로 하여금 학생정보를 입력받아 Student 객체를 생성하고 4명의 학생 정보를 ArrayList<Student> 컬렉션에 저장한 후에 (read()), 
 * ArrayList<Student>의 모든 학생(4명) 정보를 출력한다(printAll())
 * 반복문을 통해서 학생 이름을 입력받아 학생의 정보를 출력하되 종료를 입력하면 프로그램을 종료하도록(processQuery()) 프로그램을 작성하세요
 */

public class Student {
	private String name;
	private String department;
	private String id;
	private double grade;
	
	// 생성자 (규칙: 이름은 클래스와 동일하고 반환형 가지지 않음)
	public Student(String name, String department, String id, double grade) {
		this.name = name;
		this.department = department;
		this.id = id;
		this.grade = grade;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setDepartment(String department) {
		this.department =department;
	}
	public String getDepartment() {
		return department;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	public String getID() {
		return id;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public double getGrade() {
		return grade;
	}
	
	
}
