package 예제;

public class charArrayExample {
	public static void main(String[] args) {
		
		char letter = 'A'; // A 유니코드 값 65
		char[] alphabet = new char[26]; // 배열선언과 생성 
		// 알파벳이라는 이름의 char배열에 26개의 공간을 만든다
		
		for (int i = 0 ; i < alphabet.length; i++) {
			alphabet[i] = (char) (letter + i);
		} 
		// 0부터 알파벳의 개수 (26개)까지 i를 1씩 추가하며
		// alphabet의 i번째 배열이 letter의 유니코드 가 된다 
		
		System.out.println("대문자 출력 : ");
		for (char c : alphabet) {
			System.out.printf("%2c", c); //print(c + " ")
		}
		System.out.println();
		
		char[] ch = new char[26];
		
		for (int i = 0, code = 65; i < 26; i++, code++) {
		}
		
		System.out.println("대문자 출력 : ");
		for (char c : ch) {
			System.out.printf("%2c",c);
		}
		System.out.println();
		
		System.out.println("소문자 출력 : ");
		for ( int i = 0 ; i < ch.length; i++) {
			System.out.printf("%2c",ch[i] + 32);
			
		}
		
	}
}
