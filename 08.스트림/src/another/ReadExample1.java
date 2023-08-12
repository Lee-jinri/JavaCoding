package another;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) {
		InputStream is = null;  // �߻� Ŭ���� �������� = null;
		
		try {
			is = new FileInputStream("C:/Temp/test.txt"); // �������� = new ����Ŭ���� ������()
			System.out.println("[�о���� ����]");
			
		// �޼ҵ� 1
			int readByte;
			while(true) {
				readByte = is.read(); // text.txt�� �� ����Ʈ �� �д´�.
				if(readByte == -1)break; // �� �̻� ���� ���ڰ� ���� �� -1�� ��ȯ�Ѵ�. -1�� �Ǿ��� �� �ݺ��� ���߰ڽ��ϴ�.
				System.out.println((char)readByte);
			}
			
			
		// �޼ҵ� 2 : byte�� �迭�� �����ϰ� ���ڿ��� ��ȯ�Ͽ� �д´�.	
//			int readByteNo;
//			byte[] readBytes = new byte[4];
//			
//			String data = "";
//			while(true) {
//				readByteNo = is.read(readBytes);
//			    System.out.println("���� ����Ʈ �� : " + readByteNo);
//				if (readByteNo == -1) break;
//				data += new String(readBytes, 0, readByteNo);
//			}
//			System.out.println(data);
			
		// �޼ҵ� 3 : 
//			int readByteNo;
//			byte[] readBytes = new byte[10];
//			// read ����Ʈ �迭�� ������ ���� ���� 5�̰� �迭�� ���� ��ġ�� 2��°����
//			readByteNo = is.read(readBytes, 2, 5);
//			System.out.println("���� ����Ʈ �� : " + readByteNo);
//			
//			for(int i = 0; i < readBytes.length; i++) {
//				System.out.println((char)readBytes[i]);
//			}
			
			
		}catch(IOException io) { // FileBotFoundException�� IOException�� ����Ŭ�����̴�.
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
