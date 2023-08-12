package 예제;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) {

		Socket client = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		int port = 8888;
		String serverIP;
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			// 명시된 서버의 IP주소가 사용되지 않음.
			client = new Socket(serverIP,port);
			// client = new Socket("192.168.77.35",port); 수정하면 서버와 연결됨
			if(client.isConnected()) {
				System.out.println(" 서버와 연결됨 ");
			}
			
			System.out.println(" 서버 주소 " + client.getInetAddress());
			System.out.println(" 서버 포트 " + client.getPort());
			System.out.println(" 나의 포트 " + client.getLocalPort());
			System.out.println(" 나의 주소 " + client.getLocalAddress());
		
			dis = new DataInputStream(client.getInputStream());
			System.out.println(" [서버로부터 전달받은 문자열] ");
			System.out.println(dis.readUTF());
		
			dos = new DataOutputStream(client.getOutputStream());
			dos.writeUTF("실체가 없는 두려움에 뒷걸음치는 것은 자기 자신에 대해 가장 비겁한 짓이다."
					+ "더디더라도 노력하면서 앞으로 나아가면 무엇이든 해낼 수 있고 얼마만큼이든 이룰 수 있다.");
			dos.close();
			}catch(Exception e) {
				e.printStackTrace();
		}
	}

}
