package ����2;

public class exam_user_define_exception {
/* ����ڷκ��� ����, ����, ���� ������ �Է¹޾Ƽ� ����� ����ϴ� ���α׷��� �ۼ��Ͽ� ����.(AvgProgramming)
 * ���� ����ڰ� ������ �Է��ϸ� NegativeNumberException(����� ���� ���� Ŭ����)�� �߻��Ѵ�.
 * �� ���ܸ� catch ������� ��Ƽ� ó���ϴ� �ڵ嵵 �߰��϶�.
 * ���� sum()�̶�� ������ ���� ��ȯ�޵��� �޼��带 �����Ͽ� ����.
 */

class NumberException extends Exception{
	private int kor, eng, math;
	
	public NumberException(int kor, eng, math) {
		this.kor = kor;   // ����ڿ��� �޼����� �޾ƿ�
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public int getScore() {
		if (kor < 0 || eng < 0|| math < 0)
			return "����� �Է��ϼ���.";
		else {
			sum = kor + eng + math;
		}			
	}
}
public class AvgProgramming{
	public static void main(String[] args) {
		int sum;
		
		try {
			
		}
		
		
		
	}
}
