import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOExeption {
		// String[] 연관된 문자열을 그루핑하는 문자열 배열
		// args 인자값을 넣어주는 프로그램?이라고나 할까...?
		
//		printTwoTimes("a","-");
//		printTwoTimes("a","*");
//		printTwoTimes("a","&");
//		printTwoTimes("b","!");
	
		
		System.out.println(twoTimes("a", "-"));
		// twoTimes 메소드에 인자값을 넣어주고 출력하는 것
		FileWriter fw = new FileWriter("out.txt"); // out.txt에 저장됨
		fw.write(twoTimes("a","*"));
		fw.close();
//		Email.send("egoing@a.com","two times a", twoTimes("a","&"));
		// 이메일을 보냅니다. 실제로 동작되는 코드는 아님
		
}
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
	}
	
	// 출력하는 메소드
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