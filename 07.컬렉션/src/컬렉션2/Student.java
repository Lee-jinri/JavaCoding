package �÷���2;

public class Student implements Comparable<Student> {
	private int sno;
	private String name;
	
// ������ (��Ģ: �̸��� Ŭ������ �����ϰ� ��ȯ�� ������ ����)
	public Student(int sno, String name) {
		this.name = name;
		this.sno = sno;
	}
	
	public Student(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	// �ߺ��� �������� �Ǵ��Ұ��� 
	// �й��� �̸��� �� �� ���� �� ���� ��ü�� �Ǵ��ϰڴ�
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno==student.sno)&&(name.equals(student.name));
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
	
	// ���� ����ϰ� ���� ������� toString ������
	@Override
	public String toString() {
		return "�̸� : "+ name + " �й� : " + sno ;
	}

	@Override
	public int compareTo(Student o) {
		if (this.sno > o.sno)
			return 1;
		else if (this.sno == 0)
			return 0;
		else 
			return -1;
		}

	

	
}
