package �÷���;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<Movie> list = new Vector<Movie>();
		list.addElement(new Movie("��Ʈ��","�١١١١� 0", "�� ���꽺","2022.03.01"));
		list.addElement(new Movie("���� �༮�� : �� ����","�ڡڡڡڡ� 8.44","�տ�ȣ","2019.09.11"));
		list.addElement(new Movie("����Ƹ�","�١١١١� 0", "�� �Ͽ���", "2018.12.19"));
		
		printData(list);
	}

	// �ν��Ͻ� ������ �� �ְ� ����
	private static void printData(Vector<Movie> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.elementAt(i));
		}
		
		/* Iterator<Movie> e = list.iterator();
		 * while (e.hasNext()){
		 * 		System.out.println(e.next());
		 * }
		 */
			
	}
}
