package basic;

public class RemoveVar {

	// substring(0, 6) �ε��� ��ȣ 0������ 6������ ��ȯ, substring(7) 7������ ������ ��ȯ
	public static void main(String[] args) {
		String str = "990925-1012999";
		System.out.println(str.substring(0, 6) + str.substring(7));
		
	// toString()�޼ҵ�� ���ڿ��� ��ȯ�Ѵ�. delete�޼ҵ�� ���ڿ��� �����Ѵ� (index6������, �ε��� 7������)	
		StringBuilder str2 = new StringBuilder("990925-1012999");
		System.out.println(str2.toString());
		str2.delete(6, 7);
		System.out.println(str2.toString());
		
	// replace�޼ҵ�� (�����ε���, ���ε���, �ٲܹ���) ���� �ε������� �� �ε��������� ���ڸ� �ٲ� ���ڷ� ��ȯ�ؼ� ��ȯ�Ѵ�.	
		StringBuilder str3 = new StringBuilder("990925-1012999");
		str3.replace(6, 7, " ");
		System.out.println(str3.toString());
		
		

	}

}
