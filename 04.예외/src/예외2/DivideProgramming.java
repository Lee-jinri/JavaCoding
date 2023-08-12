package ����2;

// ����� ���� ���� Ŭ����

// class DivideByZeroException extends Exception  { class ����� ���� ����Ŭ���� extends ���� Ŭ������ { }
class DivideByZeroException extends ArithmeticException{ // ����Ŭ������ ��ӹ޾ƿ�.
	private String msg;  // �ʵ�
	
	public DivideByZeroException() {
		// super("0���� ���� �� ����");
	}
	
	public DivideByZeroException(String msg) {
		this.msg = msg;   // ����ڿ��� �޼����� �޾ƿ�
	}
	
	@Override
	public String getMessage() {    // �޼��� ��ȯ�� �� �ְ� �������̵� �� 
		if (msg == null) {			// ���� ���� ���� �����ϱ� 
			return "0���� ���� �� ����.";
		}else {
			return msg;				// ���� �ǰ� ������ ��ȯ
		}
	}
}
	
public class DivideProgramming{			// ����Ŭ����
	public static void main(String[] args) {
		double result;
		try {								// �Ʒ����� ���� ������ ���⼭ ����. ���⼭ ���� ó��
			result = quotient(1, 0);		// 1 / 0 -> ���� ���� (0���� ���� �� ����)
			System.out.println(result);		// ���� ������ ��� ����, ���� getMessage()���� ������ ��  
		}catch (DivideByZeroException e) {
			System.out.println(e.getMessage());		// ���� ������ ���� getMessage()���� ������ �� ���ɴϴ�
			// System.out.println(e.toString());
		}
	}
	
	public static double quotient(int n, int d) throws DivideByZeroException{	// �������� ���� �� �ִ� �޼ҵ�
		if(d == 0) 									// ���ܻ�Ȳ	// 0�� �Ǹ� ���� �� ������ if�� ���
			throw new DivideByZeroException("0���� ���� �� ����."); // ���� ��ü ����
		return (double) n /d;
	}
}