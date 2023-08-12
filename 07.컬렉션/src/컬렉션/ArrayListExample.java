package �÷���;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* ��� �ڶ� ���α׷��� ����ϴ� �ɻ��������� ������ �����ϴ� ���α׷��� �ۼ�
 * ������ 0.0���� 10.0���� ����ϰ� 
 * 10���� ������ �Է¹޾� �� �߿��� 
 * �ְ����� (Collections.mas(����Ʈ�� ��������))��
 * �������� (Collections.min(����Ʈ�� ��������))
 * �� ���ܵȴ�. Double Ÿ���� ArrayList�� ����϶�
 * 
 * [������]
 * �ɻ������� ���� : 1
 * �ɻ������� ���� : 2
 * �ɻ������� ���� : 3
 * �ɻ������� ���� : 4
 * �ɻ������� ���� : 5
 * �ɻ������� ���� : 6
 * �ɻ������� ���� : 7
 * �ɻ������� ���� : 8
 * �ɻ������� ���� : 9
 * �ɻ������� ���� : 10
 * 
 * ������ �� : 44.0
 * 
 */

public class ArrayListExample {
	public static void main(String[] args) {

		// �ν��Ͻ� ���� - �ߺ��� ����ϴ� �ڷ��� ArrayList
		ArrayList<Double> list = new ArrayList<Double>();
		// ��ĳ�� �ν��Ͻ� ����
		Scanner scan = new Scanner(System.in);
		
		/* 
		 for(int i = 0; i < 10; i++){
		 System.out.print("�ɻ������� ���� : ");
		 double value = scan.nextDouble();
		 list.add(value); 
		 } */
		
		// �Է� �ܰ�
		int i = 1;
		double value = 0.0;
		while(true) {
			System.out.printf("(%d��°)�ɻ������� ����: ",i);
			value = scan.nextDouble();
			if(value < 0 || value > 10) {
				continue;
			}
			list.add(value);
			i++;
			if(i>10) break;
		}
		
		// ó���ܰ� �� ��´ܰ�
		double max = Collections.max(list); // max(list), ����Ʈ���� ���� ū ���� ��ȯ
		double min = Collections.min(list); // min(list), ����Ʈ���� ���� ���� ���� ��ȯ
		double sum = 0.0;
		double collValue = 0.0;
		
		for(int j = 0; j < 10; j++) {
			collValue = list.get(j);   // get(0) - 0��° ���Ҹ� ������
			if(collValue != min && collValue != max) // ������ ���Ұ� �ּҰ�, �ִ방�� �ٸ��ٸ� 
				sum += collValue;		// ���Ѵ�	
		}
		System.out.printf("������ ��: %.1f", sum);
		
		scan.close();
	}

}
