package kh.oop1.day03.exam;

public class ConstructorExam {
	// �ʵ� ��� ����
	private int no;
	private String name;
	
	// ������ ǥ����
	// 1. �⺻������ : [����������] Ŭ������(){}
	// �ۼ����� �ʾƵ� �ڵ����� ������.
	// 2. �Ű������� �ִ� ������ : ��ü ���� �� ���޹��� ������ ��ü�� �ʱ�ȭ �ϱ� ���� ���
	// ��ӿ��� ��� �� �ݵ�� �⺻�����ڸ� �ʼ��� ��������, �����ε� �̿��Ͽ� �ۼ�
	// [����������] Ŭ������(�Ű�����){(this).�ʵ庯�� = �Ű�����;}
	
	// �⺻������
	public ConstructorExam() {
		
	}
	
	// �Ű������� �ִ� ������
	public ConstructorExam(int no, String name) {
		this.no = no; 
		this.name = name;
		
	}
	
}
