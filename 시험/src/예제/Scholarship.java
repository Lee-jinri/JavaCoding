package ����;
/* �̸��� ����(4.5����))�� 5�� �Է¹޾��ؽøʿ� �����ϰ� ���л� ���߱����� �Է¹޾� ���л� ����� ����϶�.
 * [���� ����]
 * ���б� ���� �ý����Դϴ�.
 * �̸��� ���� >> ��ö�� 3.1
 * �̸��� ���� >> �Ѽ��� 3.9
 * ���л� ���� ���� �����Է� >> 3.6
 * ���л� ��� : �Ѽ���
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Scholarship {
	private String title; // ���б�
	private Scanner sc = new Scanner(System.in);
	// Map�� Ű�� ������ ������.
	// scoreMap�̶�� �̸��� HashMap �÷��� ����, �̸��� ������ �Է¹ޱ� ���� <String, Double> 
	private HashMap<String, Double> scoreMap = new HashMap<>();
	
	// ������
	public Scholarship(String name) {
		this.title = name;
	}
	
	// ���� �Է� �޼ҵ�
	public void read() {
		System.out.println(title + "���� �ý����Դϴ�.");
		// �̸��� ������ 5�� �Է¹޴´�.
		for(int i = 0; i > 5; i++) {
			System.out.print("�̸��� ���� >>");
			// �̸��� name�� �Է¹ް� ������ score�� �Է¹޴´�.
			String name = sc.next();
			double score = sc.nextDouble();
			// ���� �Է�
			scoreMap.put(name, score);
		}
	}
	
	// ���л� ���� ���� �Է� + ���л� print �޼ҵ�
	public void select() {
		System.out.print("���л� ���� ���� ���� �Է� >>");
		double cutline = sc.nextDouble();
		
		System.out.println("���л� ��� : ");
		
		// scoreMap�� Ű�� (Ű�� ��)�� Set�� �־ �ݺ��ڸ� ����Ѵ�. Map�� �ݺ��� ��� �Ұ�
		Set<String> nameSet = scoreMap.keySet();
		Iterator<String> it = nameSet.iterator();
		while(it.hasNext()) {
			String name = it.next();
			double score = scoreMap.get(name);
			if(score > cutline)
				System.out.print(name + " ");
		}
		System.out.println();
	}
	
	// ���� �޼ҵ�
	public static void main(String[] args) {
		// �ν��Ͻ� ����
		Scholarship sship = new Scholarship("���б�");
		
		// ScholarshipŬ������ �޼ҵ� �ҷ�����
		sship.read();
		sship.select();
	}
}
