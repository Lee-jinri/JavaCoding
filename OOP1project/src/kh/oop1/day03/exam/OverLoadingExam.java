package kh.oop1.day03.exam;

public class OverLoadingExam {
	
	// �����ε��� ����
	// 1. �޼Ҵ��� �̸��� �����ؾ��Ѵ�.
	// 2. �Ű������� Ÿ��, ����, ��ġ�� �޶���Ѵ�.
	
	// ����
	int intI;
	int intII;
	String strS;
	
	// �޼ҵ� ����
	public void method() {
		
	}
	// ������ �̸�, �Ű������� �ٸ�
	public void method(int intI) {
		
	}
//	������ Ÿ���� ���� ������ �����ε� X
//	public void method(int intII) {
//		
//	}
	// �Ű������� Ÿ���� �޶���Ѵ�.
	public void method(String strS) {
		
	}
	// �Ű������� ������ �޶���Ѵ�.
	public void method(int intI, String strS) {
		
	}
	// �Ű������� ��ġ�� �޶� �ٸ� �޼ҵ�� �ν�
	public void method(String strS, int intI) {
	}
}