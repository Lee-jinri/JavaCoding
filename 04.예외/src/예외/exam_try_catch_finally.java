package 예외;

public class exam_try_catch_finally {

	public static void main(String[] args) {
		
		// 예외처리 
		// try 
		// 	{예외가 발생할 수 있는 코드 
		// } catch(예외종류 참조변수) 
		// {예외를 처리하는 코드
		// } finally {이 코드는 try가 끝나면 무조건 실행된다
		// } 
		
		// 선언부분이 오류나는 거 아니니까 바깥에~~~
		int x = 1;
		int y = 0;
		
		try {
			int result = x / y;
			System.out.println("result :"+result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());  // 예외가 가지고 있는 message 얻기
			e.printStackTrace();                 // 예외발생 경로를 추적
		} // finally 블록 필요없어서 생략 
		System.out.println("프로그램은 계속 진행됩니다.");
		
		

	}

}
