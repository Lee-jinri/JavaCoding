package ����;

import java.util.Scanner;

public class arrayexample {
	public static void main(String[] args) { 

	int[] numbers = new int[3];
	numbers[0] = 10; // �迭�� �� ����
	numbers[1] = 20;
	numbers[2] = 30;
	
	System.out.println("numbers[0] = " + numbers[0]);
	System.out.println("numbers[1] = " + numbers[1]);
	System.out.println("numbers[2] = " + numbers[2]);
	System.out.println();
	
	double[] arrayDouble = new double[2];
	for (int i = 0; i < 2; i++) {
		System.out.println("arrayDouble["+i+"] = " + arrayDouble[i]);
	}
	System.out.println();
	
	String[] arrayString = new String[3];
	arrayString[0] = "java";
	arrayString[1] = "oracle";
	arrayString[2] = "spring";
	
	for (int i = 0; i < 3; i++) {
		System.out.println("arrayString[" + i + "] = " + arrayString[i]);
	}
	System.out.println();
	
	// ����ڿ��� 5���� ������ �Է¹ް� ���� ����ϼ��� (�迭�̿�)
	
	// �迭 ���� 			�迭����
	int[] nums = new int[5];
	Scanner sc = new Scanner(System.in);
	
	System.out.println("===�迭�� �� �Է�===");
	for (int i = 0; i < 5 ; i++) {
		System.out.println((i+1)+"��° ���� �Է� : ");
		nums[i] = sc.nextInt();
	}
	
	System.out.println("===�迭�� �� ���");
	for(int j = 0; j<5; j++) {
		System.out.println("nums["+j+"] = " + nums[j]);
	}
	
	System.out.println("===�迭�� �� ���===");
	for (int value : nums) {
		System.out.println(value + " ");
	}
	sc.close();
	
	}
}
