
public class InputMethod {

	public static void main(String[] args) {
		
		printTwoTimes("a","-"); // ����, argument	
		printTwoTimes("b","+");

	}
	
	public static void printTwoTimes(String text, String delimiter)  { // �Ű�����, parameter
		
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
