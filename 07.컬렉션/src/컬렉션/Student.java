package �÷���;

/* �� ���� �л� ������ Student Ŭ�������� �̸�, �а�, �й�, ��������� �����ϴ� �ʵ尡 �ִ�.
 * [�䱸����]
 * ���� Ŭ������ �̸��� StudentManager�̴�.
 * ����ڷ� �Ͽ��� �л������� �Է¹޾� Student ��ü�� �����ϰ� 4���� �л� ������ ArrayList<Student> �÷��ǿ� ������ �Ŀ� (read()), 
 * ArrayList<Student>�� ��� �л�(4��) ������ ����Ѵ�(printAll())
 * �ݺ����� ���ؼ� �л� �̸��� �Է¹޾� �л��� ������ ����ϵ� ���Ḧ �Է��ϸ� ���α׷��� �����ϵ���(processQuery()) ���α׷��� �ۼ��ϼ���
 */

public class Student {
	private String name;
	private String department;
	private String id;
	private double grade;
	
	// ������ (��Ģ: �̸��� Ŭ������ �����ϰ� ��ȯ�� ������ ����)
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
