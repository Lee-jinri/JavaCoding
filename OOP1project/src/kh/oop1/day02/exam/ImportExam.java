package kh.oop1.day02.exam;

import java.util.Arrays;
import java.util.Random;

public class ImportExam {

	// java.lang import���� �ʾƵ� ��� ����
	public double piExam() {
		double d = Math.PI;
		return d;
	}
	
	// java.util Random class
	public int randomExam(int ran) {
		Random r = new Random();
		int i = r.nextInt(ran);
		return i;
	}
	
	// java.util Arrays class sort �޼ҵ�
	public String sortExam() {
		int[] arr = {1,8,3,2,6,7,0};
		Arrays.sort(arr);
		return Arrays.toString(arr);  // �迭�� ��Ʈ������ ��ȯ
	}
	
	
	
}
