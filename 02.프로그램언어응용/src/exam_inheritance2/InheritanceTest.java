package exam_inheritance2;

public class InheritanceTest {

	public static void main(String[] args) {
		// ���� Ŭ����
		// �Ѳ����� �������ֵ��� ������ �޼ҵ� emp�� ����Ѵ�
		
		// ������ 1
//		Employee emp = new Employee();
//		emp.setEmpdata("��ö��", "����� ������", "010-1234-5678", 1000000);

//		System.out.println(emp.toString());
		
//		Manager mgr = new Manager();
//		mgr.setMgrData("�ӿ���", "��⵵ ����", "010-0000-0000", 1500000, "�Ѱ� �Ŵ���", 100000);
		
//		System.out.println(mgr.toString());
	
		// ������ 2
		Employee emp = new Employee("��ö��","����� ������","010-1234-5678",200000);
		System.out.println(emp.toString());
		
		Manager mgr = new Manager("ȫ�浿","����� ������","010-0000-0000",2000000,100000,"�븮");
		System.out.println(mgr.toString());
		
//		Employee[] e = new Employee[2];
//		e[0] = new Employee("��ö��","����� ��������","010-1234-5678",2000000);
//		e[1] = new Manager("ȫ�浿","����� ������","010-0000-0000",2000000,"�븮",100000);
		
		
//      ���������� ������ ��
//		Employee e = new Employee();
//		Manager m = new Manager();		
				
//		// Employee�� ���� �Է�
//		e.setName("��ö��");
//		e.setAddress("����� ������");
//		e.setPhoneNumber("010-1234-1234");
//		e.setSalary(1000000);
		
//		Manager�� ���� �Է�
//		m.setName("�ӿ���");
//		m.setAddress("��⵵ ������");
//		m.setPhoneNumber("010-0000-0000");
//		m.setSalary(1500000);
//		m.setBonus(100000);
//		m.setJob("�Ѱ� �Ŵ���");
		
		

		
		
		
		
		
		
		
	}

}
