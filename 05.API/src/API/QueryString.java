package API;

import java.net.MulticastSocket;
import java.util.Scanner;
import java.util.StringTokenizer;

/* 
 * ������ ���α׷��� ���� ����� ����̴�. �����ϰ� �ۼ��ϵ��� �ڹ� ���α׷��� �ϼ��϶�.
 * 
 * [������]
 * ���ڸ� �Է����ּ��� : name=ȫ�浿&id=javauser&email=java1234@naver.com
 * name ȫ�浿
 * id javauser
 * email java1234@naver.com
 */

public class QueryString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���");
		String query = sc.nextLine();
		// name=ȫ�浿&id=javauser&email=java1234@naver.com
		
		StringTokenizer st = new StringTokenizer(query,"&"); // &���� ���ڿ� �и�
		StringTokenizer subSt = null;
		
		while (st.hasMoreTokens()){
			String token = st.nextToken();	// name=ȫ�浿
			subSt = new StringTokenizer(token, "="); // ���� ���ڿ��� =���� �и�
		
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
