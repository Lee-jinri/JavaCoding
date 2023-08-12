package API;

import java.net.MulticastSocket;
import java.util.Scanner;
import java.util.StringTokenizer;

/* 
 * 다음은 프로그램의 실행 방법과 결과이다. 동일하게 작성하도록 자바 프로그램을 완성하라.
 * 
 * [실행결과]
 * 문자를 입력해주세요 : name=홍길동&id=javauser&email=java1234@naver.com
 * name 홍길동
 * id javauser
 * email java1234@naver.com
 */

public class QueryString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력해주세요");
		String query = sc.nextLine();
		// name=홍길동&id=javauser&email=java1234@naver.com
		
		StringTokenizer st = new StringTokenizer(query,"&"); // &으로 문자열 분리
		StringTokenizer subSt = null;
		
		while (st.hasMoreTokens()){
			String token = st.nextToken();	// name=홍길동
			subSt = new StringTokenizer(token, "="); // 서브 문자열은 =으로 분리
		
			/* int m = subSt.countTokens();
			 * for(int j = 0;j < m; j++){
			 * 	System.out.print(subSt.nextToken() + "\t');
			 */
			
			while (subSt.hasMoreTokens()) {
				System.out.println(subSt.nextToken() + '\t');
			}
			System.out.println();
		}
		sc.close();
		
		
		
	}

}
