
public class InputMethod {

	public static void main(String[] args) {
		
		printTwoTimes("a","-"); // 인자, argument	
		printTwoTimes("b","+");

	}
	
	public static void printTwoTimes(String text, String delimiter)  { // 매개변수, parameter
		
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
