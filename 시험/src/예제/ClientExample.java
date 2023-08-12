package ����;

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
			socket = new Socket("localhost", 9999); // Ŭ���̾�Ʈ ���� ����, ������ �ٷ� ����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // �����Է½�Ʈ��
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));// ���� ��½�Ʈ��
			
			String outputMessage = "�츮�� �� �� �ֱ� ���� ������ϴ� �ϵ��� �츮�� �ϸ鼭 ����.";
			out.write(outputMessage + "\n"); // Ű���忡�� ���� ���ڿ� ����
			out.flush();
			
			String inputMessage = in.readLine();
			System.out.println("[ �����κ��� ���޹��� ������ ");
			System.out.println(inputMessage); // �����κ��� ���� �޽����� ȭ�鿡 ���
	
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(socket != null) socket.close(); // Ŭ���̾�Ʈ ���� �ݱ�
			} catch (IOException e) {
				System.out.println("������ ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
		
	}
}

}
