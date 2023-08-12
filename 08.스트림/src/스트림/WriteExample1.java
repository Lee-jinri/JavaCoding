package ��Ʈ��;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample1 {
	public static void main(String[] args) {
		
		// outputStream �ν��Ͻ� ����
		OutputStream os = null;
		
		// NotFount..���� �߻��� �� ����.(Output������ ������ �������� ���� ��) �ݵ�� ����ó��
		try {
			os = new FileOutputStream("C:/Temp/test.txt");
//			// �޼ҵ� 1. ����Ʈ �迭��
//			byte[] data = "Java".getBytes();
//			for(int i =0; i < data.length; i++) {
//				os.write(data[i]);
//			}
			
			// �޼ҵ� 2 : ����Ʈ �迭�� ���ڰ����� ���� 	
		  /*byte[] data = "Hello! Java".getBytes();
			os.write(data); // write(����Ʈ�迭) */
			
			// �޼ҵ� 3 : write �迭�� �� �߿��� ù ��° �ε������� 2���� ���̸�ŭ�� ���� 
		 /*	byte[] data = "HelloWorld! Java".getBytes();
			os.write(data,1,2); */
			
			// �޼ҵ� 4 :
		    byte[] data = "Got doesn't require us to succeed.\nhe only requires that you try.".getBytes();
		    os.write(data);  	
						
			System.out.println("���� �����Ǿ����ϴ�.");
			
		} catch(FileNotFoundException fnf) {
			System.out.println("������ ������ �����ϴ�.");
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			try {
				if(os != null) { // �ν��Ͻ� ������ ���������� �̷������ os�� null�� �ƴ϶� �ּڰ��� �����Ե�.
					os.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
			
			
		
		
	}

}
