package 스트림;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample1 {
	public static void main(String[] args) {
		
		// outputStream 인스턴스 생성
		OutputStream os = null;
		
		// NotFount..예외 발생할 수 있음.(Output에서는 폴더가 존재하지 않을 때) 반드시 예외처리
		try {
			os = new FileOutputStream("C:/Temp/test.txt");
//			// 메소드 1. 바이트 배열로
//			byte[] data = "Java".getBytes();
//			for(int i =0; i < data.length; i++) {
//				os.write(data[i]);
//			}
			
			// 메소드 2 : 바이트 배열을 인자값으로 가짐 	
		  /*byte[] data = "Hello! Java".getBytes();
			os.write(data); // write(바이트배열) */
			
			// 메소드 3 : write 배열의 값 중에서 첫 번째 인덱스부터 2개의 길이만큼만 저장 
		 /*	byte[] data = "HelloWorld! Java".getBytes();
			os.write(data,1,2); */
			
			// 메소드 4 :
		    byte[] data = "Got doesn't require us to succeed.\nhe only requires that you try.".getBytes();
		    os.write(data);  	
						
			System.out.println("파일 생성되었습니다.");
			
		} catch(FileNotFoundException fnf) {
			System.out.println("저장할 폴더가 없습니다.");
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			try {
				if(os != null) { // 인스턴스 생성이 정상적으로 이루어지면 os는 null이 아니라 주솟값을 가지게됨.
					os.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
			
			
		
		
	}

}
