package basic;

import java.util.Scanner;

public class ScoreTest {
	public static Scanner input = new Scanner(System.in);
	
	// �����͸� �Է¹ޱ� ���� �޼ҵ� Score score = s1
	// �Ű����� : Ŭ������ �������� = �ּҰ�
	public static void inputData(Score score) {
		// �ʵ忡 ���� ����
		System.out.println("�̸� �Է� : ");
		score.name = input.nextLine();

		System.out.println("���� ���� �Է� : ");
		score.kor = input.nextInt();
		
		System.out.println("���� ���� �Է� : ");
		score.eng = input.nextInt();
		
		System.out.println("���� ���� �Է� : ");
		score.math = input.nextInt();
		input.nextLine();
	}
	
	public static void main(String[] args) {
		
		// �ν��Ͻ� ����
		Score s1 = new Score();
		
		inputData(s1);
		s1.getTotal();
		
		Score s2 = new Score();
		
		s2.scoreData("��ö��", 55, 56, 46);
		s2.getTotal();
		
		Score s3 = new Score();
		s3.scoreData("������", 90, 90, 90);
		s3.getTotal();
		
		System.out.println("========================================================");
		String[] subject = {"�̸�","����","����","����","����","���","����"};
		for (int i = 0; i<subject.length; i++) {
			System.out.printf("%s\t", subject[i]);
		}
		
		System.out.println("\n=====================================================");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		
		

	}

}
