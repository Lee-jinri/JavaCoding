package another;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) {
		InputStream is = null;  // 추상 클래스 참조변수 = null;
		
		try {
			is = new FileInputStream("C:/Temp/test.txt"); // 참조변수 = new 서브클래스 생성자()
			System.out.println("[읽어들인 문자]");
			
		// 메소드 1
			int readByte;
			while(true) {
				readByte = is.read(); // text.txt를 한 바이트 씩 읽는다.
				if(readByte == -1)break; // 더 이상 읽을 문자가 없을 때 -1을 반환한다. -1이 되었을 때 반복을 멈추겠습니다.
				System.out.println((char)readByte);
			}
			
			
		// 메소드 2 : byte를 배열에 저장하고 문자열로 변환하여 읽는다.	
//			int readByteNo;
//			byte[] readBytes = new byte[4];
//			
//			String data = "";
//			while(true) {
//				readByteNo = is.read(readBytes);
//			    System.out.println("읽은 바이트 수 : " + readByteNo);
//				if (readByteNo == -1) break;
//				data += new String(readBytes, 0, readByteNo);
//			}
//			System.out.println(data);
			
		// 메소드 3 : 
//			int readByteNo;
//			byte[] readBytes = new byte[10];
//			// read 바이트 배열에 저장할 길이 수는 5이고 배열의 저장 위치는 2번째부터
//			readByteNo = is.read(readBytes, 2, 5);
//			System.out.println("리턴 바이트 수 : " + readByteNo);
//			
//			for(int i = 0; i < readBytes.length; i++) {
//				System.out.println((char)readBytes[i]);
//			}
			
			
		}catch(IOException io) { // FileBotFoundException은 IOException의 서브클래스이다.
			io.printStackTrace();
		}finally {
			try {
				if(is !=null) is.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
