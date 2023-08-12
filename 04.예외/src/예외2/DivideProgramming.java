package 예외2;

// 사용자 정의 예외 클래스

// class DivideByZeroException extends Exception  { class 사용자 정의 예외클래스 extends 예외 클래스명 { }
class DivideByZeroException extends ArithmeticException{ // 예외클래스를 상속받아옴.
	private String msg;  // 필드
	
	public DivideByZeroException() {
		// super("0으로 나눌 수 없음");
	}
	
	public DivideByZeroException(String msg) {
		this.msg = msg;   // 사용자에게 메세지를 받아옴
	}
	
	@Override
	public String getMessage() {    // 메세지 반환할 수 있게 오버라이딩 함 
		if (msg == null) {			// 값이 없을 수도 있으니까 
			return "0으로 나눌 수 없음.";
		}else {
			return msg;				// 값이 옳게 들어오면 반환
		}
	}
}
	
public class DivideProgramming{			// 실행클래스
	public static void main(String[] args) {
		double result;
		try {								// 아래에서 예외 던진거 여기서 받음. 여기서 예외 처리
			result = quotient(1, 0);		// 1 / 0 -> 문제 있음 (0으로 나눌 수 없다)
			System.out.println(result);		// 문제 없으면 결과 나옴, 위에 getMessage()에서 설정한 값  
		}catch (DivideByZeroException e) {
			System.out.println(e.getMessage());		// 문제 있으면 위에 getMessage()에서 설정한 값 나옵니당
			// System.out.println(e.toString());
		}
	}
	
	public static double quotient(int n, int d) throws DivideByZeroException{	// 나눗셈을 구할 수 있는 메소드
		if(d == 0) 									// 예외상황	// 0이 되면 나눌 수 없으니 if를 사용
			throw new DivideByZeroException("0으로 나눌 수 없다."); // 예외 객체 생성
		return (double) n /d;
	}
}