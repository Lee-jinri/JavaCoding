import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOExeption {
		// String[] ������ ���ڿ��� �׷����ϴ� ���ڿ� �迭
		// args ���ڰ��� �־��ִ� ���α׷�?�̶�� �ұ�...?
		
//		printTwoTimes("a","-");
//		printTwoTimes("a","*");
//		printTwoTimes("a","&");
//		printTwoTimes("b","!");
	
		
		System.out.println(twoTimes("a", "-"));
		// twoTimes �޼ҵ忡 ���ڰ��� �־��ְ� ����ϴ� ��
		FileWriter fw = new FileWriter("out.txt"); // out.txt�� �����
		fw.write(twoTimes("a","*"));
		fw.close();
//		Email.send("egoing@a.com","two times a", twoTimes("a","&"));
		// �̸����� �����ϴ�. ������ ���۵Ǵ� �ڵ�� �ƴ�
		
}
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
	}
	
	// ����ϴ� �޼ҵ�
//	public static void printTwoTimes(String text, String delimiter) {
//		System.out.println(delimiter);
//		System.out.println(text);
//		System.out.println(text);
//	}
	
	
	public static void writeFileTwoTimes(String text, String delimiter) throws IOException{
		FileWriter fw = new FileWriter("output.txt");
		fw.write(delimiter+"\n");
		fw.write(text+"\n");
		fw.write(text+"\n");
		fw.close();
	}
}