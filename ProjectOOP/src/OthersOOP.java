import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		
		
		// Ŭ���� (System, Math, FileWriter)
		// : ������ �޼ҵ带 �׷����� ���� ����ִ� ��
		
		// �ν��Ͻ� : f1, f2
		
	
		
		/* math��� Ŭ������ pi = 3.14... 
		 * floor = �Ҽ�������
		 * ceil = �Ҽ��� �ø��ϴ� *����*�� ����ִ� ��
		 */
		
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		// �� �ƶ��� ���� ���� ����� ���� Ŭ������ �״�� ����ϴ� ���̾ƴ϶�
		// new�� Ŭ������ �����ؼ� ����Ѵ�.
		
		// ���Ͽ� ������ ����� �� ����ϴ� Ŭ������ ������
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write("Java");
		f1.close();
		// hello�� java�� ��ϵ� data.txt ������ �������
		
		// f1�� f2�� �ٸ�
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write("Java");
		f2.close();
	}

}
