package kh.oop1.day02.exam;

public class BlockExam {
	
	/* Ŭ���� ���� �ʱ�ȭ ����
	 * JVM �⺻�� -> ����� �ʱⰪ -> Ŭ���� �ʱ�ȭ ��� �ʱⰪ
	 * 
	 * �ν��Ͻ� ���� �ʱ�ȭ ����
	 * JVM �⺻�� -> ����� �ʱⰪ -> �ν��Ͻ� �ʱ�ȭ ��� �ʱⰪ -> �����ڸ� ���� �ʱⰪ 
	 * - �ν��Ͻ� ����� �����ں��� ���� �ʱ�ȭ ��!
	 */
	// Ŭ���� ���� ���α׷��� ����� �� �ʱ�ȭ
	public static String name = "ȫ�浿";
	
	public BlockExam() {
		System.out.println("������ ����");
	}
	
	int age = 19;
	
	// Ŭ���� ��� : �ʱ⿡ �� �� �� ����� �� ���
	static{
		System.out.println("static block ����");
		name = "�ڱ浿";
		
	}
	
	// �ν��Ͻ� ���, �̸��� ���� �޼ҵ�
	// �ʱⰪ�� �����Ѵٰų� ����ó���� �ؾ��� �� ���
	// ������ �������� ���� ����
	// ������ ������ ���� �ٲ���Ѵٸ� ���⼭ �ٲ�
	{
		System.out.println(age);
		System.out.println("�ν��Ͻ� ���1");
		this.age=22;
		System.out.println(age);
	}
	// �ν��Ͻ� ����� ������ ����� �� �ִ�.
	{
		System.out.println("�ν��Ͻ� ���2");
	}
	
	/*
	 * Ŭ���� ����
	 * 
	 */
}
