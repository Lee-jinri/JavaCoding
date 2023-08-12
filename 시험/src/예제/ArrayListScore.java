package 예제;
/* Scanner 클래스를 사용하여 6개 학점 ('A','B','C',D','F')를 문자로 입력받아 ArrayList에 저장하고, ArrayList를 검색하여
 * 학점을 점수 (A=4.0, B=3.0, C=2.8, D=1.0, F=0)로 변환하여 평규능ㄹ 출력하는 프로그램을 작성하라.
 * [실행 예시]
 * 6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> A C A B F D
 * 2.33 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScore {
	public static void main(String[] args) {
		ArrayList<Character> a = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >>");
		for(int i=0; i<6; i++) {
			String s = sc.next();
			if(s.length() > 1) {
				System.out.println("Not character");
				sc.close();
				return;
			}
			char ch = s.charAt(0);
			if((ch >= 'A' && ch <= 'D' || ch == 'F'))
				a.add(ch);
			else {
				System.out.println("엥?");
				sc.close();
				return;
			}
		}
		
		double score=0.0;
		for(int i = 0; i<a.size(); i++) {
			char ch = a.get(i);
			switch(ch) {
			case 'A' : score += 4.0; break;
			case 'B' : score += 3.0; break;
			case 'C' : score += 2.8; break;
			case 'D' : score += 1.0; break;
			case 'F' : score += 0.0; break;
			}
		}
		
		System.out.printf("%.2f",(score/a.size()));
		sc.close();
	}

}
