package API;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] array = { 9, 4, 5, 6, 2, 1 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	
		String[] subject = { "�ڹ�", "����Ŭ", "������" };
		Arrays.sort(subject);
		printArray(subject);
		
		System.out.println();
		
		// Member Ŭ������ �̸�/�ּ�/���̸� �ʵ�� ������ �ִ�. ���̼����� �����ϰ����Ѵ�.
		Member m1 = new Member("ȫ�浿", "����� ������ ���嵿", 50);
		Member m2 = new Member("��ö��", "����� ������ ���ﵿ",35);
		Member m3 = new Member("������", "����� ������ �Ｚ��", 20);
		Member[] members = { m1, m2, m3 };
		Arrays.sort(members); // Arrays Ŭ������ sort() �޼���� Ȯ��.
		printArray(members);
		// System.out.println(Arrays.toString(members));
		
		
	}
	// �迭�� ���� ����ϱ� ���� �޼��� ����
	private static void printArray(Object[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if(i < array.length-1) {
				System.out.println(", ");
			}
		}
	}

}
