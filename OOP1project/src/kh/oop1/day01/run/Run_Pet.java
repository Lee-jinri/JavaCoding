package kh.oop1.day01.run;

import kh.oop1.day01.exam.Pet;

public class Run_Pet {

	public static void main(String[] args) {

		Pet p = new Pet();

		// set���� ���� ���� �����Ѵ�
		p.setPetType("����");
		p.setPetName("����");
		p.setPetAge(5);

		// get���� ��������� �����Ѵ�
		// p.getPetName()
		System.out.println(p.getPetName() + "\n" + p.getPetType() + "\n" + p.getPetAge());

	}

}
