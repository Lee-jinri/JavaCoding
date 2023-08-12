
public class OutputMethod {

	public static String a() {
		// return 값 뒤에 있는 값이 메소드의 실행결과가 된다
		// 메소드를 종료시키는 역할도 한다.
		return "a";
	}
	
	public static int one () {
		return 1;
	}
	
			   // void - return 값이 없는 메소드를 만들 때 사용
	public static void main(String[] args) {
		
		System.out.println(a());
		System.out.println(one());

	}


	

}
