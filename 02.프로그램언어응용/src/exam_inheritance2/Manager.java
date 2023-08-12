package exam_inheritance2;

public class Manager extends Employee {

	// 부모 클래스 (Employee)에 보너스(bonus)와 직책(job) 추가
	
	// 생성자 1 : 디폴트 생성자, 명시하지 않으면 컴파일러가 자동 추가
	public Manager() {		
		super();
	}
		
	// 생성자 2 : 같은 이름의 생성자 2개
	public Manager(String name, String address, String phoneNumber, int salary, int bonus, String job) {
		// super() 부모 생성자 호출, super가 첫번째로 와야됨.
		super(name, address, phoneNumber, salary);
		this.bonus = bonus;
		this.job = job;
	}
	
	private int bonus;		// 필드 만듦
	private String job;
	
	public int getBonus() {
		return bonus;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	// 전체 필드 설정하기 위한 메소드(관리자 정보) 한꺼번에 설정할 수 있게 만듦.
	public void setMgrData(String name, String address, String phoneNumber, int salary, String job, int bonus) {
		// 직원 클래스의 setEmpData()를 통해 직원에 정의된 필드 설정
		setEmpdata(name, address, phoneNumber, salary);
		// 개별적으로 설정한 것
		// setName(name); 원래는 super해야되는데 Name이라는게 부모클래스에만 있어서 안 써도 됨. 
		// 자신이 가진 필드 설정
		this.job = job;
		this.bonus = bonus;
	}
	
	// 부모클래스의 필드와 메서드를 호출
	public String toString() {
		String data = ", 보너스 : " + bonus + ", 직책 : " + job ;
		return super.toString() + data;
	}
	
	
	
}
