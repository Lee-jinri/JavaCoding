package kh.oop1.day02.run;

import kh.oop1.day02.exam.BasicVariable;
import kh.oop1.day02.exam.BlockExam;
import kh.oop1.day02.exam.Coffee;
import kh.oop1.day02.exam.FieldExam;
import kh.oop1.day02.exam.ImportExam;

public class Run {

	public static void main(String[] args) {
		Coffee c = new Coffee();
		
		// CoffeMachine cm = new CoffeeMachine();
		// (default) 접근제한자는 다른 패키지에서 접근 불가
	
		// Import
		ImportExam ie = new ImportExam();
		System.out.println(ie.piExam()); // pi의 값 
		
		System.out.println(ie.randomExam(10)); // 0~10의 랜덤한 값
		
		System.out.println(ie.sortExam());
		
		// Field
	
		// 클래스 변수는 사용하려고 하면 클래스명을 써주고 .을 입력 후 클래스 변수, 메소드 사용
		// static을 사용한 메소드도 마찬가지
		System.out.println(FieldExam.var1);  // 0, 초기값 지정 안해줘서 0나옴
		System.out.println(FieldExam.method1());  // static 안의 지역변수
		
		// 멤버변수는 객체를 생성해서 heap메모리 영역에 생성하고 접근해야함
		// 객체를 생성한 후에 변수나 메소드에 접근해야한다.
		FieldExam fe = new FieldExam();	 // 초기화 블럭 지역변수 , 생성자 지역변수
		System.out.println(fe.var2);     // 0
		System.out.println(fe.method()); // 메소드안의 지역변수

		// var3는 private이기 때문에 get,set사용해야 접근 가능
		// var4는 default이기 때문에 get,set사용해야 접근 가능
		
		System.out.println("===============Block================");
		BlockExam be = new BlockExam();
		System.out.println(be.name);
		
		System.out.println("============BasicVariable=============");
		System.out.println("Bool : " + BasicVariable.bool);
		System.out.println("Byte : " + BasicVariable.by);
		System.out.println("Character : " + BasicVariable.ch);
		System.out.println("Double : " + BasicVariable.d);
		System.out.println("Float : " + BasicVariable.f);
		System.out.println("Integer : " + BasicVariable.i);
		System.out.println("Long : " + BasicVariable.l);
		System.out.println("Short : " + BasicVariable.sh);
		System.out.println("String : " + BasicVariable.str);
	}

}
