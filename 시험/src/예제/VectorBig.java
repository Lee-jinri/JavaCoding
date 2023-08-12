package ����;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import java.util.Iterator;

/* Scanner Ŭ������ -1�� �Էµ� ������ ���� ������ �Է¹޾� ���Ϳ� �����ϰ� ���͸� �˻��Ͽ� ���� ū ���� ����ϴ� ���α׷��� �ۼ��϶�. 
 *[���� ����]
 * ���� (-1�� �Էµ� ������) >> 6 7 2 1 5 -1 9 (-1������ ���� �ǹ̾���)
 * ���� ū ���� 7 */

public class VectorBig {
	
	// Ŭ���� �޼ҵ�
	// �� ó���� ���� ���� ū ���� �ʱ�ȭ
	public static void PrintBig(Vector<Integer> v) {
		int big = v.get(0);
		for(int i =0; i <v.size(); i++) {
			if(big < v.get(i))
				big = v.get(i);
		}
		System.out.println("���� ū ���� " + big);
	}
	
	public static void main(String[] args) {
		// �÷��� ����, �������� ���� �� ���� ������ Integer�� ����
		Vector<Integer> v = new Vector<>();
		Scanner sc = new Scanner (System.in);
		
		System.out.print("����(-1�� ����) >>");
		while(true) {
			int n = sc.nextInt();
			if(n == -1) 
				break;
			v.add(n);
		}
		
		if(v.size() == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
			sc.close();
			return;
		}
		
		// Ŭ���� �޼ҵ� ȣ���� Ŭ�����̸�.�޼ҵ��̸� 
		// ������ ���� Ŭ������ Ŭ���� �̸� ����~~
		PrintBig(v); // ���� v�� ���� �� ���� ū �� ���
		sc.close();
	}
}

