package exam_inheritance2;

public class Manager extends Employee {

	// �θ� Ŭ���� (Employee)�� ���ʽ�(bonus)�� ��å(job) �߰�
	
	// ������ 1 : ����Ʈ ������, ������� ������ �����Ϸ��� �ڵ� �߰�
	public Manager() {		
		super();
	}
		
	// ������ 2 : ���� �̸��� ������ 2��
	public Manager(String name, String address, String phoneNumber, int salary, int bonus, String job) {
		// super() �θ� ������ ȣ��, super�� ù��°�� �;ߵ�.
		super(name, address, phoneNumber, salary);
		this.bonus = bonus;
		this.job = job;
	}
	
	private int bonus;		// �ʵ� ����
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
	
	// ��ü �ʵ� �����ϱ� ���� �޼ҵ�(������ ����) �Ѳ����� ������ �� �ְ� ����.
	public void setMgrData(String name, String address, String phoneNumber, int salary, String job, int bonus) {
		// ���� Ŭ������ setEmpData()�� ���� ������ ���ǵ� �ʵ� ����
		setEmpdata(name, address, phoneNumber, salary);
		// ���������� ������ ��
		// setName(name); ������ super�ؾߵǴµ� Name�̶�°� �θ�Ŭ�������� �־ �� �ᵵ ��. 
		// �ڽ��� ���� �ʵ� ����
		this.job = job;
		this.bonus = bonus;
	}
	
	// �θ�Ŭ������ �ʵ�� �޼��带 ȣ��
	public String toString() {
		String data = ", ���ʽ� : " + bonus + ", ��å : " + job ;
		return super.toString() + data;
	}
	
	
	
}
