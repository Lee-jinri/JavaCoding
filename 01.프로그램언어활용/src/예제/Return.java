package ����;

public class Return {

	public static String num(int i) {
		
		// return; 
		// �޼ҵ��� ��°��� ��ȯ�Ѵ�
		
		if (i == 0) {
			return "zero";
		}else if (i == 1) {
			return "one";
		}else if (i == 2) {
			return "two";
		}
		return "none";
		
	}
	public static void main(String[] args) {
		System.out.println(num(1));
	}

}
