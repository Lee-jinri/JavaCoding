package java_project_day3;

public class Example3 {

	public static void main(String[] args) {
	
//		���ڿ� "no news is good news"�� ������� �ݺ��ϸ� ����'n'�� ��Ÿ���� Ƚ���� ī�����Ѵ�.
//		���� ������ ���ڰ� 'n'�� �ƴϸ� continue���� ���Ͽ� ������ ������ �κ��� �����ϰ� ���� ���ڸ� ó���Ѵ�.(����)
//		������ ���̴� ���ڿ� ������.length()�� ���� ���ִ�
//		���ڿ� ������.charAt()�� ����ϸ� ���ڿ������� ����� ���ڿ��� ù��° ���� �ϳ�(0)�� ��ȯ�Ѵ�.

		
		String a = "no news is good news";
		int count = 0;
		
		for (int i = 0; i < a.length(); i++) { 
			if (a.charAt(i) == 'n') {
				count++;
			}else if(a.charAt(i) != 'n') {
				continue;
		}
			
		}System.out.println("n�� ���� : " + count);
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
