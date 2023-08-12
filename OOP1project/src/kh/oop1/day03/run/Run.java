package kh.oop1.day03.run;

import kh.oop1.day03.exam.ThisConstructor;

public class Run {

	public static void main(String[] args) {
		ThisConstructor ts= new ThisConstructor("객체", 1000, 1);
		System.out.println("책 이름 : "+ts.getBookName() + ", 책 가격 : "+ts.getBookprice()+
				", 출판사 : "+ts.getbookpublisher() + ", 책 아이디 : "+ ts.getBookid());
		
		// 매개변수 하나인게 먼저 호출됨.
		
		// part1 4-1 (메소드)보면됨
	}

}
