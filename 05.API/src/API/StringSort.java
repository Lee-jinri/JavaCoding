package API;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0, i = 0;
		
		System.out.println("문자열을 입력하세요 :");
		String str = input.nextLine();
		StringTokenizer st = new StringTokenizer(str," ,");
		String[] ars = new String[st.countTokens()];
		
		System.out.println("입력 문자 :");
		while(st.hasMoreTokens()) {
			ars[i] = st.nextToken();
			System.out.println(ars[i]);
			count++;
			i++;
		}
		
		System.out.println("모두 " + count + "개의 단어가 있습니다\n");
		System.out.println("정렬 문자 : ");
		Arrays.sort(ars);
		for(String word : ars) {
			System.out.println(word);
		}
		input.close();
	}

}
