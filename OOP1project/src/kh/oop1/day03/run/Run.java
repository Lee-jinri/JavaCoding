package kh.oop1.day03.run;

import kh.oop1.day03.exam.ThisConstructor;

public class Run {

	public static void main(String[] args) {
		ThisConstructor ts= new ThisConstructor("��ü", 1000, 1);
		System.out.println("å �̸� : "+ts.getBookName() + ", å ���� : "+ts.getBookprice()+
				", ���ǻ� : "+ts.getbookpublisher() + ", å ���̵� : "+ ts.getBookid());
		
		// �Ű����� �ϳ��ΰ� ���� ȣ���.
		
		// part1 4-1 (�޼ҵ�)�����
	}

}
