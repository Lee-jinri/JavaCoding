import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		
		
		// 클래스 (System, Math, FileWriter)
		// : 변수와 메소드를 그루핑한 것을 담고있는 것
		
		// 인스턴스 : f1, f2
		
	
		
		/* math라는 클래스에 pi = 3.14... 
		 * floor = 소수점내림
		 * ceil = 소수점 올림하는 *변수*가 들어있는 것
		 */
		
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		// 긴 맥락을 가진 것을 사용할 때는 클래스를 그대로 사용하는 것이아니라
		// new로 클래스를 복제해서 사용한다.
		
		// 파일에 정보를 기록할 때 사용하는 클래스의 복제본
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write("Java");
		f1.close();
		// hello와 java가 기록된 data.txt 파일이 만들어짐
		
		// f1과 f2는 다른
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write("Java");
		f2.close();
	}

}
