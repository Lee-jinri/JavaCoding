package exam_inheritance2;

public class Employee {
// 직원은   이름, 주소, 전화번호, 월급 필드를 가지고
// 매니저는 이름, 주소, 전화번호, 월급, 보너스, 직책을 필드로 갖는다.
// 공통된 부분 = 이름, 주소, 전화번호, 월급 = 직원 클래스	= 부모 클래스
	
	// 부모클래스 (공통된 부분)
	
	private String name;        // 4개의 필드
	private String address;
	private String phoneNumber;
	private int salary;
		
	// 생성자 1
	public Employee() {		
	}
	
	// 생성자 2
	public Employee(String name, String address, String phoneNumber, int salary) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	
	// 이름에 대한 정의
	public String getName() {    // 접근자
		return name;
	}
		
	public void setName(String name) {		// 설정자
		this.name = name;
	}
	
	// 주소에 대한 정의
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	// 전화번호에 대한 정의
	public String getPhone() {
		return address;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// 월급에 대한 정의
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
			
		
	// 전체 필드 설정하기 위한 메서드 (직원정보)
	// 필드를 한번에 설정하기 위해서 setEmpdata라는 것을 만들고 한번에 받아와서 한번에 설정하겠따
	public void setEmpdata(String name, String address, String phoneNumber, int salary) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
		
	public String toString() {
		return "사원명 : " + name + ", 사원 주소 : " + address + ", 전화번호 : " + phoneNumber + ", 급여 : " + salary;
	}
		
}