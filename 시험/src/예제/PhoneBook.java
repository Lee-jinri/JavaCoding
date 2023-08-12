package ����;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	// ������
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
}

public class PhoneBook {
	private Scanner scanner;
	// ��ü �迭 ����(Phone ��üŸ���� �迭)
	private Phone[] pArray; 
	
	// ������
	public PhoneBook() {
		// ��ĳ�� �ν��Ͻ� ����
		scanner = new Scanner(System.in);
	}
	
	
	private void read() {
		// �ο����� �޴´�.
		System.out.print("�ο��� >>");
		int n = scanner.nextInt();
		pArray = new Phone[n]; // n���� ������ �迭 ����
		
		// �̸��� ��ȭ��ȣ ����
		for(int i = 0; i <pArray.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ĭ���� �Է�)>>");
			String name = scanner.next();
			String tel = scanner.next();
			pArray[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�.");
	}
	
	// �˻��ϱ����� �޼ҵ�
	private String search(String name) {
		for(int i=0; i<pArray.length;i++) {
			if(pArray[i].getName().equals(name)) 
				return pArray[i].getTel();
			}
			return null;
		}
		
	public void run() {
		read();
		while(true) {
			System.out.print("�˻��� �̸� >>");
			String name = scanner.next();
			if(name.equals("�׸�")) 
				break;
			String tel = search(name);
			if(tel == null)
				System.out.println(name + "��(��) �����ϴ�.");
			else
				System.out.println(name +"�� ��ȣ�� " + tel +"�Դϴ�.");
			}
		System.out.println("���α׷��� �����մϴ�.");
		scanner.close();
	}	
	
	// ����
	public static void main(String[] args) {
		new PhoneBook().run();
	
	}
}

