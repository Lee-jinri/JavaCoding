package 제네릭;

public class ArrayData {
	// 리턴타입 T
	public static <T extends Comparable<T>> T getMin(T[] a) {
		if(a== null || a.length ==0)
			return null;
		T largest = a[0];
		for (int i = 1; i < a.length; i++) {
			if(largest.compareTo(a[i]) > 0) // compareTo메서드 사용하려면 Comparable 인터페이스 extends받아야됨
				largest = a[i];
		}
		return largest;
	}
	
	public static void main(String[] args) {
		Integer[] i = { 10, 35, 98, 80 };
		int value = getMin(i);  // getMin가장 작은 값 리턴
		System.out.println(value);
		
		String[] s = {"JAVA","C+","SPRING","ORACLE"};
		String data = getMin(s); // getMin 가장 적은 문자 리턴
		System.out.println(data);
		
	}

}
