package ����2;

import java.util.Arrays;

public class ByteToStringExample {

	public static void main(String[] args) {
		
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		// Hello Java (�����ڵ�)
		String str1 = new String(bytes);  // ����Ʈ -> ����
		System.out.println(str1.toString());  // toString ��������
		//str���� ���ڷ� ��ȯ�Ͽ� ����ض�

		// Java
		String str2 = new String(bytes, 6 , 4); // ����Ʈ -> ���� /6��° ���� 4���� ���ڷ� ��ȯ
		System.out.println(str2); // toString ������.
		
		byte[] byteArray = str2.getBytes(); // ���� -> ����Ʈ[]
		System.out.println(Arrays.toString(byteArray)); // ����Ʈ �迭�� ��ȯ
		
		char[] value = { 'H','e','l','l','o'};
		String str = new String(value);  // ������ ���, char[]->String ��ü
		System.out.println("�迭�� �̿��� ���ڿ� ��ü ���� : "+str);
	}

}
