package ����;
/* words.txt ���Ͽ��� �� ���ο� �ϳ��� ���� �ܾ ����ִ�. �� ������ �� ���ξ� �о� Vector<String>�� ���κ��� �����Ͽ� �����ϰ�.
 * ���� �ܾ �Է¹޾� �� �ܾ�� �����ϴ� ��� �ܾ ���Ϳ��� ã�� ����ϴ� ���α׷��� �ۼ��϶�. 
 * [���� ����]
 * ������Ʈ ���� ���� words.txt ������ �о����ϴ�...
 * �ܾ� >> lov
 * love
 * lovebird
 * lovelorn
 * �ܾ� >> asfh
 * �߰��� �� ����
 * �ܾ� >> �׸�
 * �����մϴ�.
 * */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class WordSearch {
	private Vector<String> wordVector = new Vector<String>();
	
	// ����Ʈ ������
	public WordSearch() {}

	// words.txt ���� �б�
	private boolean readFile() {
		try {
			// ���� ���� ���� Scanner ����� �� ����
			Scanner fScanner = new Scanner(new FileInputStream("words.txt"));
			while(fScanner.hasNext())
				wordVector.add(fScanner.nextLine()); // �� ���ο� �� �ܾ� ���Ϳ� ������
			fScanner.close();
		}catch(FileNotFoundException e) {
			System.out.println("������Ʈ ���� ���� words.txt ������ �����ϴ�.");
			return false;
		}
		System.out.println("������Ʈ ���� ���� word.txt ������ �о����ϴ�.");
		return true;
	}
	
	// �ܾ� �˻�
	private void processQuery() { 
		Scanner sc = new Scanner(System.in);
		while(true) {
			boolean found = false;
			System.out.print("�ܾ� >>");
			String searchWord = sc.nextLine(); // �˻��� �ܾ� �Է�
			if(searchWord.equals("�׸�")) {
				break; // �˻� ����
			}
			
			// ���Ϳ��� �˻�
			for(int i =0; i<wordVector.size(); i++) {
				String word = wordVector.get(i); // ���� ���� ���ڿ�
				if(word.length() < searchWord.length()) // ������ ���ڿ��� �˻� ���ڿ����� ª�� ���
					continue;
				
				// ���� ���ڿ��� �պκ��� �˻� ���ڿ� ũ�⸸ŭ �߶󳻱�
				String frontPart = word.substring(0, searchWord.length());
				
				if(searchWord.equals(frontPart)) { // �˻� ���ڿ��� �߶� �� �κ� ��
					System.out.println(word);  // ���Ϳ��� �߰��� �ܾ� ���
				}
			}
			if(!found) // �� �ܾ �߰� ���ߴٸ� found�� ���ݱ��� false�̸�
				System.out.println("�߰��� �� ����");
		}
		sc.close();
	
	}
	
	public void run() {
		boolean res = readFile(); // res�� false�̸� �ܾ� ���� �б� ����
		if(res == true) 
			processQuery();
		System.out.println("�����մϴ�.");
	}
	
	public static void main(String[] args) {
	WordSearch ws = new WordSearch();
	ws.run();
	}

}
