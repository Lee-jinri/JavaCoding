package kh.oop1.day01.run;

import kh.oop1.day01.exam.Pet;

public class Run_Pet2 {
	public static void main(String[] args) {

		// �ν��Ͻ�ȭ (��ü�� ����)
		Pet p1 = new Pet("����", "����", 5);
		Pet p2 = new Pet("Ǫ��", "Ǫ��", 2);
		Pet p3 = new Pet("������", "�屺��", 8);

		System.out.println("�� ���� : " + p1.getPetType() + ", �� �̸� : " + p1.getPetName() + ", �� ���� : " + p1.getPetAge());
		System.out.println("�� ���� : " + p2.getPetType() + ", �� �̸� : " + p2.getPetName() + ", �� ���� : " + p2.getPetAge());
		System.out.println("�� ���� : " + p3.getPetType() + ", �� �̸� : " + p3.getPetName() + ", �� ���� : " + p3.getPetAge());

	}

}
