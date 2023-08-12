package ���׸�;

public class ArrayData {
	// ����Ÿ�� T
	public static <T extends Comparable<T>> T getMin(T[] a) {
		if(a== null || a.length ==0)
			return null;
		T largest = a[0];
		for (int i = 1; i < a.length; i++) {
			if(largest.compareTo(a[i]) > 0) // compareTo�޼��� ����Ϸ��� Comparable �������̽� extends�޾ƾߵ�
				largest = a[i];
		}
		return largest;
	}
	
	public static void main(String[] args) {
		Integer[] i = { 10, 35, 98, 80 };
		int value = getMin(i);  // getMin���� ���� �� ����
		System.out.println(value);
		
		String[] s = {"JAVA","C+","SPRING","ORACLE"};
		String data = getMin(s); // getMin ���� ���� ���� ����
		System.out.println(data);
		
	}

}
