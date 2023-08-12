package kh.oop1.day01.run;

import kh.oop1.day01.exam.Pet;

public class Run_Pet {

	public static void main(String[] args) {

		Pet p = new Pet();

		// set으로 변수 값을 설정한다
		p.setPetType("시츄");
		p.setPetName("뭉이");
		p.setPetAge(5);

		// get으로 멤버변수에 접근한다
		// p.getPetName()
		System.out.println(p.getPetName() + "\n" + p.getPetType() + "\n" + p.getPetAge());

	}

}
