package 실습2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {

	public void spaceToUpper() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어를 입력하세요.(띄어쓰기 포함) : ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		// 특정 문자로 구분된 문자열을 나눌 때 사용
		StringBuilder sb = new StringBuilder();
		// 스트링 변화가 일어날 것 같으니까 뷜더를 써야겠당~
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			for(int i =0; i<token.length();i++) {
				if(i==0)
					sb.append(token.toUpperCase().charAt(i));
				else 
					sb.append(token.charAt(i));
			}
		}
		System.out.println(sb);
	}

}
