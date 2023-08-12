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
		// (default) ���������ڴ� �ٸ� ��Ű������ ���� �Ұ�
	
		// Import
		ImportExam ie = new ImportExam();
		System.out.println(ie.piExam()); // pi�� �� 
		
		System.out.println(ie.randomExam(10)); // 0~10�� ������ ��
		
		System.out.println(ie.sortExam());
		
		// Field
	
		// Ŭ���� ������ ����Ϸ��� �ϸ� Ŭ�������� ���ְ� .�� �Է� �� Ŭ���� ����, �޼ҵ� ���
		// static�� ����� �޼ҵ嵵 ��������
		System.out.println(FieldExam.var1);  // 0, �ʱⰪ ���� �����༭ 0����
		System.out.println(FieldExam.method1());  // static ���� ��������
		
		// ��������� ��ü�� �����ؼ� heap�޸� ������ �����ϰ� �����ؾ���
		// ��ü�� ������ �Ŀ� ������ �޼ҵ忡 �����ؾ��Ѵ�.
		FieldExam fe = new FieldExam();	 // �ʱ�ȭ �� �������� , ������ ��������
		System.out.println(fe.var2);     // 0
		System.out.println(fe.method()); // �޼ҵ���� ��������

		// var3�� private�̱� ������ get,set����ؾ� ���� ����
		// var4�� default�̱� ������ get,set����ؾ� ���� ����
		
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
