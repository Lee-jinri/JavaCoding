
public class MyOOP {

	
	public static void main(String[] args) {
		
		// delimiter - 변수
		// printA, printB - 메소드
		// 나의 클래스와 나의 인스턴스를 만들어봐~
		
		delimiter = "----";
		printA(); 
		printA();
		printB();
		printB();
		
		delimiter = "****";
		printA(); 
		printA();
		printB();
		printB();
	
	}
	
	public static String delimiter = "";
	public static void printA() {
		System.out.println(delimiter);
		System.out.println("A"); 
		System.out.println("A");
	}
	
	public static void printB() {
		System.out.println(delimiter);
		System.out.println("B"); 
		System.out.println("B");
	}

	
}
