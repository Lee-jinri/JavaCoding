package ����;

public class charArrayExample {
	public static void main(String[] args) {
		
		char letter = 'A'; // A �����ڵ� �� 65
		char[] alphabet = new char[26]; // �迭����� ���� 
		// ���ĺ��̶�� �̸��� char�迭�� 26���� ������ �����
		
		for (int i = 0 ; i < alphabet.length; i++) {
			alphabet[i] = (char) (letter + i);
		} 
		// 0���� ���ĺ��� ���� (26��)���� i�� 1�� �߰��ϸ�
		// alphabet�� i��° �迭�� letter�� �����ڵ� �� �ȴ� 
		
		System.out.println("�빮�� ��� : ");
		for (char c : alphabet) {
			System.out.printf("%2c", c); //print(c + " ")
		}
		System.out.println();
		
		char[] ch = new char[26];
		
		for (int i = 0, code = 65; i < 26; i++, code++) {
		}
		
		System.out.println("�빮�� ��� : ");
		for (char c : ch) {
			System.out.printf("%2c",c);
		}
		System.out.println();
		
		System.out.println("�ҹ��� ��� : ");
		for ( int i = 0 ; i < ch.length; i++) {
			System.out.printf("%2c",ch[i] + 32);
			
		}
		
	}
}
