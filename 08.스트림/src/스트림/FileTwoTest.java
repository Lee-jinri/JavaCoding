package ��Ʈ��;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/* �־��� 2���� ����(text.txt, result.txt)�� ���Ͽ�
 * �ϳ��� ����(writer.txt)�� ����� ���α׷��� �ۼ��ϼ��� */
	
public class FileTwoTest {	
	public static void main(String[] args) {
		
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		Writer fw = null;
		
		// ���� �Է�
		try {
			br1 = new BufferedReader(new FileReader("test.txt"));
			br2 = new BufferedReader(new FileReader("result.txt"));
			
			// ���� ���
			fw = new FileWriter("writer.txt");
			while(true) {						// test�� writer.txt�� �Է��ϴ� ��
				String line = br1.readLine();	// test = line, reaLine()���� ������ ������ null ��ȯ
				if(line == null)  				// ���� ������ ������
					break;						// break
				fw.write(line+"\n"); 			// fw�� �� �� �Է��ϰ� ���� �ݺ�
			}
			while(true) {						// result�� writer.txt�� �Է��ϴ� ��
				String line = br2.readLine();
				if(line == null)
					break;
				fw.write(line+"\n");
			}
			fw.flush(); 
			System.out.println("���� ���� �Ϸ�");  // ���� �� �Է��ϸ� ��µ�.
			
		// ����ó��
		}catch (IOException io) {
			io.printStackTrace();
		}finally {
			try {  // ����� �͵� �ݾ���. �ٸ� ���α׷����� ����� ���� �����ϱ�
				if(fw!=null) fw.close();
				if(br2!=null) br2.close();
				if(br1!=null) br1.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
