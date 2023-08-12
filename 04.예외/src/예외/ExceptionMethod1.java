package ����;

import java.io.IOException;

public class ExceptionMethod1 {

	public static void main(String[] args) {
		System.out.println(readString());

	}
	
	public static String readString() {
		byte[] buf = new byte[100];   // byteŸ���� buf��� �迭 = 100��
		System.out.print("���ڿ��� �Է��ϼ���");
		int readCount = 0;
		try {
			readCount = System.in.read(buf);  // ��: 2byte,  java: 4byte = ����δ� �ѱ��ڰ� 1����Ʈ
			System.out.println(readCount);    // �ڹ� �Է��ϸ� 6 ����, ���ͱ��� �� ���ڷ� �ν� 
		}catch (IOException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
		//		   String(����Ʈ�迭, ��ġ����, ���̼�) : byte�迭�� ���� ���ڿ��� �ٲٴ� ������
		return new String(buf, 0, readCount - 2);  //  
	}

}
