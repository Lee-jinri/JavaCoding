package ��Ʈ��;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*"test.txt" ���Ͽ� "���� ������ ������ �� ���� �������� ������ �ƴ϶� ������ ������ �ٽ� �Ͼ�� ���� �ִ�."��� ���� �����ϰ�
 * -> ���� ��� ��Ʈ��
 * �� ������ ������ �о� �ܼ�(ȭ��)�� ����ϵ��� �ڵ��ϼ���.
 * -> ���� �Է� ��Ʈ��*/

public class FileReaderTest {
	public static void main(String[] args) {
		
		// ��� ��Ʈ��
		FileReader in = null;
		// �Է½�Ʈ�� : ���۴� �� �پ� ���� �� ����
		BufferedReader reader = null;
		
		FileWriter out = null;
		String s = "���� ������ ������ �� ���� �������� ������ �ƴ϶� ������ ������ �ٽ� �Ͼ�� ���� �ִ�.";
		try {
			out = new FileWriter("test.txt"); // ���� ��� ��Ʈ��(���α׷�->������)
			out.write(s); // ���ڿ��� write()�� �߰�����
			out.append('_'); // ���� ���� ���� �߰�
			out.flush();  // ������ ���� ??
			
			in = new FileReader("test.txt"); // ���� �Է� ��Ʈ��(������->���α׷�)
//			int c;
//			while((c = in.read()) != -1) {
//				System.out.println((char)c);
			
			
			reader = new BufferedReader(in);
			String str = null;
			while((str= reader.readLine())!=null) { // readLine() : ���Ϸκ��� �� ���ξ� �о� ��ȭ�ϴ� �޼ҵ�
				System.out.println(str);
			}
			
			
		}catch (FileNotFoundException fnf) {
			System.out.println("��θ��� �ٽ� Ȯ�����ּ���.");
			fnf.printStackTrace();
		}catch (IOException io) {
			System.out.println("������ ���Ͽ� text.txt ������ ���� ���߽��ϴ�.");
			io.printStackTrace();
		}catch (Exception e) {
			System.out.println("�ٽ� Ȯ�����ּ���.");
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
				System.out.println("�������� ����.");
			}
		}

	}
		
}
