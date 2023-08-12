package 예제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		
		try {
			socket = new Socket("localhost", 9999); // 클라이언트 소켓 생성, 서버와 바로 연결
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 소켓입력스트림
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));// 소켓 출력스트림
			
			String outputMessage = "우리가 할 수 있기 전에 배워야하는 일들을 우리는 하면서 배운다.";
			out.write(outputMessage + "\n"); // 키보드에서 읽은 문자열 전송
			out.flush();
			
			String inputMessage = in.readLine();
			System.out.println("[ 서버로부터 전달받은 데이터 ");
			System.out.println(inputMessage); // 서버로부터 받은 메시지를 화면에 출력
	
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(socket != null) socket.close(); // 클라이언트 소켓 닫기
			} catch (IOException e) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
		
	}
}

}
