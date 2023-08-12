package 예외;

import java.io.IOException;

public class ExceptionMethod1 {

	public static void main(String[] args) {
		System.out.println(readString());

	}
	
	public static String readString() {
		byte[] buf = new byte[100];   // byte타입의 buf라는 배열 = 100개
		System.out.print("문자열을 입력하세요");
		int readCount = 0;
		try {
			readCount = System.in.read(buf);  // 자: 2byte,  java: 4byte = 영어로는 한글자가 1바이트
			System.out.println(readCount);    // 자바 입력하면 6 나옴, 엔터까지 한 글자로 인식 
		}catch (IOException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
		//		   String(바이트배열, 위치정보, 길이수) : byte배열의 값을 문자열로 바꾸는 생성자
		return new String(buf, 0, readCount - 2);  //  
	}

}
