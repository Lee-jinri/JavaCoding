package exam_inheritance;

public class Professor extends Person {  // ��� : �θ�Ŭ���� person, �ڽ�Ŭ���� professor
	
	public Professor() {
		System.out.println("Professor ������ ȣ��");
	}
	public Professor(String name, int age, String subject) {
		/*super();
		  setName(name);
		  setAge(age); */
		super(name, age); // ����Ŭ������ ������ ȣ��, public Person(String name, int age){}
		this.subject = subject;
		System.out.println("Professor (name, age, subject) ������ ȣ��");
	}
	
	private String subject; // �ʵ�
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return super.toString() + " : " + getSubject(); 
		// ���� Ŭ������ �ִ� �� ���� �Ŷ� getSubject() ���� �׳� subject�ص���
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
