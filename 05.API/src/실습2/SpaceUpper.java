package �ǽ�2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {

	public void spaceToUpper() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �Է��ϼ���.(���� ����) : ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		// Ư�� ���ڷ� ���е� ���ڿ��� ���� �� ���
		StringBuilder sb = new StringBuilder();
		// ��Ʈ�� ��ȭ�� �Ͼ �� �����ϱ� ����� ��߰ڴ�~
		
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
