package exam_inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		// ����Ŭ����
		
		Employee e = new Employee("ȫ�浿", 30, "����ó");
		Professor p = new Professor("��ö��", 50, "�ڹ�");
		Student s = new Student("�����", 20 , "��ǻ�Ͱ���");
		
		// Employee�� ���� �Է�
//		e.setName("ȫ�浿");
//		e.setAge(47);
//		e.setDept("����������");
		
		// Professor�� ���� �Է�
//		p.setName("��Ǫ��");
//		p.setAge(52);
//		p.setSubject("�����ͺ��̽�");
		
		// Student�� ���� �Է�
//		s.setName("������");
//		s.setAge(20);
//		s.setMajor("�ڹ� ���α׷��� ����");
		
		// ���
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
		
		
		
		
		
		
		
		
	}

}
