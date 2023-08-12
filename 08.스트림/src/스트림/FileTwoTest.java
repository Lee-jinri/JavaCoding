package 스트림;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/* 주어진 2개의 파일(text.txt, result.txt)을 합하여
 * 하나의 파일(writer.txt)로 만드는 프로그램을 작성하세요 */
	
public class FileTwoTest {	
	public static void main(String[] args) {
		
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		Writer fw = null;
		
		// 파일 입력
		try {
			br1 = new BufferedReader(new FileReader("test.txt"));
			br2 = new BufferedReader(new FileReader("result.txt"));
			
			// 파일 출력
			fw = new FileWriter("writer.txt");
			while(true) {						// test를 writer.txt에 입력하는 것
				String line = br1.readLine();	// test = line, reaLine()읽을 데이터 없으면 null 반환
				if(line == null)  				// 읽을 데이터 없으면
					break;						// break
				fw.write(line+"\n"); 			// fw에 한 줄 입력하고 띄어쓰기 반복
			}
			while(true) {						// result를 writer.txt에 입력하는 것
				String line = br2.readLine();
				if(line == null)
					break;
				fw.write(line+"\n");
			}
			fw.flush(); 
			System.out.println("파일 복사 완료");  // 파일 다 입력하면 출력됨.
			
		// 예외처리
		}catch (IOException io) {
			io.printStackTrace();
		}finally {
			try {  // 사용한 것들 닫아줌. 다른 프로그램에서 사용할 수도 있으니까
				if(fw!=null) fw.close();
				if(br2!=null) br2.close();
				if(br1!=null) br1.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
