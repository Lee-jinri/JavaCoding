package 예제;

public class Return {

	public static String num(int i) {
		
		// return; 
		// 메소드의 출력값을 반환한다
		
		if (i == 0) {
			return "zero";
		}else if (i == 1) {
			return "one";
		}else if (i == 2) {
			return "two";
		}
		return "none";
		
	}
	public static void main(String[] args) {
		System.out.println(num(1));
	}

}
