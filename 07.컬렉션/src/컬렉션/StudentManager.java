package �÷���;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

/* �� ���� �л� ������ Student Ŭ�������� �̸�, �а�, �й�, ��������� �����ϴ� �ʵ尡 �ִ�.
 * [�䱸����]
 * ���� Ŭ������ �̸��� StudentManager�̴�.
 * ����ڷ� �Ͽ��� �л������� �Է¹޾� Student ��ü�� �����ϰ� 4���� �л� ������ ArrayList<Student> �÷��ǿ� ������ �Ŀ� (read()), 
 * ArrayList<Student>�� ��� �л�(4��) ������ ����Ѵ�(printAll())
 * �ݺ����� ���ؼ� �л� �̸��� �Է¹޾� �л��� ������ ����ϵ� ���Ḧ �Է��ϸ� ���α׷��� �����ϵ���(processQuery()) ���α׷��� �ۼ��ϼ���
 */

public class StudentManager {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Student>dept = new ArrayList<Student>();
		
	// �޼ҵ� 1
	private void read() {
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.(, ������)");
		for(int i=0; i<4; i++) {
			System.out.println(">> ");
			String text = sc.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();  // trim ���� �����ϴ� ��
			String department = st.nextToken().trim();
			String id = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, department, id, grade);
			dept.add(student); // ArrayList�� ����
		}
	}
	
	// �޼ҵ�2
	private void printAll() { // Iterator�� �ۼ��غ�����, toString�ص� ��
		Iterator<Student> it = dept.iterator();
		System.out.println("----------------------");
		while(it.hasNext()) {
			Student student = it.next();
			System.out.println("�̸� : " + student.getName());
			System.out.println("�а� : " + student.getDepartment());
			System.out.println("�й� : " + student.getID());
			System.out.println("������� : " + student.getGrade());
			System.out.println("----------------------------------");
		}
	} 

	// �޼ҵ�3
	private void processQuery() {
		while(true) {
			System.out.println("�л� �̸� >>");
			String name = sc.nextLine(); // �л� �̸� �Է�
			if(name.equals("����")) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
			
			for(int i=0; i<dept.size(); i++) { // dept�� �ִ� ��� �л� �̻�
				Student student = dept.get(i); // i��° �л� ��ü
				if(student.getName().equals(name)) { // �̸��� ���� studentã��
					System.out.println(student.getName() + ", ");
					System.out.println(student.getDepartment() + ", ");
					System.out.println(student.getID() + ", ");
					System.out.println(student.getGrade() + ", ");
					break; // for���� ���
				}
			}
		}// while ����
	}		
	public void run() {
		read();
		printAll();
		processQuery();
	}
			
	public static void main(String[] args) {
		// �ν��Ͻ� ����
		StudentManager man = new StudentManager();
		man.run();
	}
}
