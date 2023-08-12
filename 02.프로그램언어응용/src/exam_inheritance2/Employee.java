package exam_inheritance2;

public class Employee {
// ������   �̸�, �ּ�, ��ȭ��ȣ, ���� �ʵ带 ������
// �Ŵ����� �̸�, �ּ�, ��ȭ��ȣ, ����, ���ʽ�, ��å�� �ʵ�� ���´�.
// ����� �κ� = �̸�, �ּ�, ��ȭ��ȣ, ���� = ���� Ŭ����	= �θ� Ŭ����
	
	// �θ�Ŭ���� (����� �κ�)
	
	private String name;        // 4���� �ʵ�
	private String address;
	private String phoneNumber;
	private int salary;
		
	// ������ 1
	public Employee() {		
	}
	
	// ������ 2
	public Employee(String name, String address, String phoneNumber, int salary) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	
	// �̸��� ���� ����
	public String getName() {    // ������
		return name;
	}
		
	public void setName(String name) {		// ������
		this.name = name;
	}
	
	// �ּҿ� ���� ����
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	// ��ȭ��ȣ�� ���� ����
	public String getPhone() {
		return address;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// ���޿� ���� ����
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
			
		
	// ��ü �ʵ� �����ϱ� ���� �޼��� (��������)
	// �ʵ带 �ѹ��� �����ϱ� ���ؼ� setEmpdata��� ���� ����� �ѹ��� �޾ƿͼ� �ѹ��� �����ϰڵ�
	public void setEmpdata(String name, String address, String phoneNumber, int salary) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
		
	public String toString() {
		return "����� : " + name + ", ��� �ּ� : " + address + ", ��ȭ��ȣ : " + phoneNumber + ", �޿� : " + salary;
	}
		
}