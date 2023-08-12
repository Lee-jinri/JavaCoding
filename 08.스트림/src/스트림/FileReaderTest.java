package 스트림;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*"test.txt" 파일에 "가장 위대한 영광은 한 번도 실패하지 않음이 아니라 실패할 때마다 다시 일어서는 데에 있다."라는 글을 저장하고
 * -> 문자 출력 스트림
 * 이 파일의 내용을 읽어 콘솔(화면)에 출력하도록 코딩하세요.
 * -> 문자 입력 스트림*/

public class FileReaderTest {
	public static void main(String[] args) {
		
		// 출력 스트림
		FileReader in = null;
		// 입력스트림 : 버퍼는 한 줄씩 읽을 수 있음
		BufferedReader reader = null;
		
		FileWriter out = null;
		String s = "가장 위대한 영광은 한 번도 실패하지 않음이 아니라 실패할 때마다 다시 일어서는 데에 있다.";
		try {
			out = new FileWriter("test.txt"); // 문자 출력 스트림(프로그램->데이터)
			out.write(s); // 문자열은 write()로 추가가능
			out.append('_'); // 파일 끝에 문자 추가
			out.flush();  // 강제로 비우기 ??
			
			in = new FileReader("test.txt"); // 문자 입력 스트림(데이터->프로그램)
//			int c;
//			while((c = in.read()) != -1) {
//				System.out.println((char)c);
			
			
			reader = new BufferedReader(in);
			String str = null;
			while((str= reader.readLine())!=null) { // readLine() : 파일로부터 한 라인씩 읽어 반화하는 메소드
				System.out.println(str);
			}
			
			
		}catch (FileNotFoundException fnf) {
			System.out.println("경로명을 다시 확인해주세요.");
			fnf.printStackTrace();
		}catch (IOException io) {
			System.out.println("오류로 인하여 text.txt 파일을 읽지 못했습니다.");
			io.printStackTrace();
		}catch (Exception e) {
			System.out.println("다시 확인해주세요.");
			e.printStackTrace();
		}finally {
			try {
				if (out != null)
					out.close();
				if(reader != null)
					reader.close();
				if(in != null)
					in.close();
			}catch(Exception ex) {
				System.out.println("연결해제 오류.");
			}
		}

	}
		
}
