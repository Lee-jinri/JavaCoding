package API;

import java.util.StringTokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		
		String text = "�ڹ�&����Ŭ,,������,HTML-JAVASCRIPT-JQUERY"; // �����ڰ� �����ؼ� ������ �� ���ڷ� �����ؼ� 7���� ����
		// String[] names = text.split(",");
		String[] names = text.split("&|,|-");
		// �����ڰ� �����ؼ� ������ �� ���ڷ� �����ؼ� �� ���ڿ� ��ȯ = 7���� ����

		System.out.println("�迭�� �� : " + names.length);
		
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println();
		
		// ���1 : �����ִ� ��ū�� Ȯ���ϰ� while������ �ݺ�
		// �̰� �����ڰ� �����ؼ� �پ ����
		// StringTokenizer(��� ���ڿ�, ������) ������
		StringTokenizer st = new StringTokenizer(text, "&,-");
		int countTokens = st.countTokens(); // ��ū�� ������ ��ȯ.
		System.out.println("��ü ��ū �� : " + countTokens);
		
		while (st.hasMoreTokens()) { // ��ū�� �� �����ϴ��� ���θ� true/ false�� ��ȯ.
			String token = st.nextToken();  // ���� ��ū�� ����.
			System.out.println(token);
			
		}
		
		
		
				
	}

}
