package exam_inheritance;

public class Student extends Person { // ��� : �θ�Ŭ���� person, �ڽ�Ŭ���� student
	private String major;  // �ʵ���� major �ν��Ͻ�����
	
	public Student() {
		System.out.println("Student ������ ȣ��");
		
	}
	public Student(String name, int age, String major) {
		/*super();
		  setName(name);
		  setAge(age); */
		super(name, age); // ����Ŭ������ ������ ȣ��, public Person(String name, int age){}
		this.major = major;
		System.out.println("Student(name, age, major) ������ ȣ��");
	}
	
	public String getMajor() {  // ������
		return major;
	}
	
	public void setMajor(String major) {  // ������
		this.major = major;
	}
	
	@Override // �θ� Ŭ������ �޼ҵ�� ����ΰ� ������ �˻��ϴ� ��
			  // �����Ǹ� �ǵ��ߴٰ� Ȯ���ϰ� ������ -> ��������
			  // �̰� �Ⱦ��� ��Ÿ�� ���� ������ �� ��.
			  // �̰� ���� ��Ÿ�� ���� ������ ��.
	public String toString() {
		return super.toString() + " : " + major;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
