package ����;

import java.util.Scanner;

public class array4 {
	public static void main(String[] args) {
		
		// ���� "Java","C++","HTML5","��ǻ�ͱ���","�����ͺ��̽�"
		// ���� 95, 88, 76, 62, 55
		// "����" �Է¹����� �����Ѵ� �������������� ����ϰ� �Ѵ�
		
		// ���� �迭 
		String course[] = { "Java","C++","HTML5","��ǻ�ͱ���","�����ͺ��̽�","����" };
		// ���� �迭
		int score[] = {95, 88, 76, 62, 55};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		
		while(true) { // ���ѹݺ�
			String name = sc.next();
			System.out.println("���� �̸�>>" + name);
			if(name.equals("����")) 
				break;
		int i;
		for(i=0; i<score.length;i++) { //0������ �����ؼ� �������� ��������)
			if(course[i].equals(name)) {
				System.out.println(name+"�� ������ "+score[i]);
				break;
			}
		}
		
		// ������� �߸��� ���
		if(i==score.length) 
			System.out.println("���� �����Դϴ�.");
		}
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
