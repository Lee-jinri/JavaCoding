package API;

import java.util.StringTokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		
		String text = "자바&오라클,,리눅스,HTML-JAVASCRIPT-JQUERY"; // 구분자가 연속해서 붙으면 빈 문자로 간주해서 7개가 나옴
		// String[] names = text.split(",");
		String[] names = text.split("&|,|-");
		// 구분자가 연속해서 붙으면 빈 문자로 간주해서 빈 문자열 반환 = 7개가 나옴

		System.out.println("배열의 수 : " + names.length);
		
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println();
		
		// 방법1 : 남아있는 토큰을 확인하고 while문으로 반복
		// 이건 구분자가 연속해서 붙어도 ㄱㅊ
		// StringTokenizer(대상 문자열, 구분자) 생성자
		StringTokenizer st = new StringTokenizer(text, "&,-");
		int countTokens = st.countTokens(); // 토큰의 개수를 반환.
		System.out.println("전체 토큰 수 : " + countTokens);
		
		while (st.hasMoreTokens()) { // 토큰이 더 존재하는지 여부를 true/ false로 반환.
			String token = st.nextToken();  // 다음 토큰을 리턴.
			System.out.println(token);
			
		}
		
		
		
				
	}

}
