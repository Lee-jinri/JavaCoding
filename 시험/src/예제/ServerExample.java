package 예제;

import java.io.BufferedReader;
import java.io.BufferedWriter;

/*TCP 소켓을 사용하여 클라이언트와 서버(9999)를 연동하여 데이터를 주고 받으려고한다.
 * 서버는 클라이언트에게 "신은 우리가 성공할 것을 요구하지 않는다. 우리가 노력할 것을 요구할 뿐이다."라는 데이터를 전송하여 
 * 클라이언트는 서버로부터 전달받은 데이터를 출력하면 되고 클라이언트는 다시 서버에게 
 * "우리가 할 수 있기 전에 배워야하는 일들을, 우리는 하면서 배운다."
 * 라는데이터를 전송하여 서버는 전달받아 출력하면 된다.
 * SeverExample클래스와 ClientExample클래스 생성*/

/*TCP 서버랑 클라이언트
 * 클라이언트가 요청하면 서버가 응답한다.
 * 클라이언트와 서버가 통신하려면 서버의 주소(IP주소)를 알아야한다.
 * 서버 소켓, 소켓
 */
class ServerExample {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocker llistener = null;
		Socker socker = null;
		
		try {
			listener = new SeverSocker(9999); // 서버 소켓 생성
			System.out.println("연결을 기다리고 있습니다.");
			
			socker = listener.accept(); // 클라이언트로 부터 연결 요청
		}
	}
	
}