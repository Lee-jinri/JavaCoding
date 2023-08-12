package ����;

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
			// ��õ� ������ IP�ּҰ� ������ ����.
			client = new Socket(serverIP,port);
			// client = new Socket("192.168.77.35",port); �����ϸ� ������ �����
			if(client.isConnected()) {
				System.out.println(" ������ ����� ");
			}
			
			System.out.println(" ���� �ּ� " + client.getInetAddress());
			System.out.println(" ���� ��Ʈ " + client.getPort());
			System.out.println(" ���� ��Ʈ " + client.getLocalPort());
			System.out.println(" ���� �ּ� " + client.getLocalAddress());
		
			dis = new DataInputStream(client.getInputStream());
			System.out.println(" [�����κ��� ���޹��� ���ڿ�] ");
			System.out.println(dis.readUTF());
		
			dos = new DataOutputStream(client.getOutputStream());
			dos.writeUTF("��ü�� ���� �η��� �ް���ġ�� ���� �ڱ� �ڽſ� ���� ���� ����� ���̴�."
					+ "������� ����ϸ鼭 ������ ���ư��� �����̵� �س� �� �ְ� �󸶸�ŭ�̵� �̷� �� �ִ�.");
			dos.close();
			}catch(Exception e) {
				e.printStackTrace();
		}
	}

}
