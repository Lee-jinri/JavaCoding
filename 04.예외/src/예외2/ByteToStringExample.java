package 예외2;

import java.util.Arrays;

public class ByteToStringExample {

	public static void main(String[] args) {
		
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		// Hello Java (유니코드)
		String str1 = new String(bytes);  // 바이트 -> 문자
		System.out.println(str1.toString());  // toString 생략가능
		//str값을 문자로 반환하여 출력해라

		// Java
		String str2 = new String(bytes, 6 , 4); // 바이트 -> 문자 /6번째 부터 4개를 문자로 변환
		System.out.println(str2); // toString 생략됨.
		
		byte[] byteArray = str2.getBytes(); // 문자 -> 바이트[]
		System.out.println(Arrays.toString(byteArray)); // 바이트 배열을 반환
		
		char[] value = { 'H','e','l','l','o'};
		String str = new String(value);  // 생성자 사용, char[]->String 객체
		System.out.println("배열을 이용한 문자열 객체 생성 : "+str);
	}

}
