package ����;

public class ContinueExample {
	public static void main(String[] args) {
		
		/* ���ڿ� " no news is good news"�� �������
		 * �ݺ��ϸ� ���� 'n'�� ��Ÿ���� Ƚ���� ī�����Ѵ�.
		 * ���� ������ ���ڰ� 'n'�� �ƴϸ� continue���� ���Ͽ� ������ ������ �κ��� �����ϰ� ���� ���ڸ� ó���Ѵ�.
		 * ���� ������ ���̴� ���ڿ� ������.length()�� ���� �� ������
		 * ���ڿ� ������.charAt(0)�� ����ϸ� ���ڿ� ������ ����� ���ڿ��� ù��° ���� �ϳ�(0)�� ��ȯ�Ѵ�
		 */
		
		String n = "no news is good news";
		int count = 0;
		
		for (int i = 0; i < n.length(); i++) {
			if(n.charAt(i) == 'n') {
				count++;
			}else if(n.charAt(i) != 'n'){
				continue;
			}
			
		}System.out.printf("%2d",count);
		
		
		
		
		
		
		
		
		
		
	}
}
