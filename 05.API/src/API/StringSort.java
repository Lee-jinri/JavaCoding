package API;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0, i = 0;
		
		System.out.println("���ڿ��� �Է��ϼ��� :");
		String str = input.nextLine();
		StringTokenizer st = new StringTokenizer(str," ,");
		String[] ars = new String[st.countTokens()];
		
		System.out.println("�Է� ���� :");
		while(st.hasMoreTokens()) {
			ars[i] = st.nextToken();
			System.out.println(ars[i]);
			count++;
			i++;
		}
		
		System.out.println("��� " + count + "���� �ܾ �ֽ��ϴ�\n");
		System.out.println("���� ���� : ");
		Arrays.sort(ars);
		for(String word : ars) {
			System.out.println(word);
		}
		input.close();
	}

}
