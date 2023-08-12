package 예제;

public class ContinueExample {
	public static void main(String[] args) {
		
		/* 문자열 " no news is good news"를 대상으로
		 * 반복하며 문자 'n'이 나타나는 횟수를 카운팅한다.
		 * 만약 현재의 문자가 'n'이 아니면 continue문에 의하여 루프의 나머지 부분을 생략하고 다음 문자를 처리한다.
		 * 참고 문장의 길이는 문자열 변수명.length()로 얻을 수 있으며
		 * 문자열 변수명.charAt(0)을 사용하면 문자열 변수명에 저장된 문자열의 첫번째 문자 하나(0)를 반환한다
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
