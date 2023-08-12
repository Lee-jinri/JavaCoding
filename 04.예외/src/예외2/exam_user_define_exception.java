package 예외2;

public class exam_user_define_exception {
/* 사용자로부터 국어, 영어, 수학 점수를 입력받아서 평균을 계산하는 프로그램을 작성하여 보자.(AvgProgramming)
 * 만약 사용자가 음수를 입력하면 NegativeNumberException(사용자 정의 예외 클래스)을 발생한다.
 * 이 예외를 catch 블록으로 잡아서 처리하는 코드도 추가하라.
 * 또한 sum()이라는 점수의 합을 반환받도록 메서드를 정의하여 보자.
 */

class NumberException extends Exception{
	private int kor, eng, math;
	
	public NumberException(int kor, eng, math) {
		this.kor = kor;   // 사용자에게 메세지를 받아옴
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public int getScore() {
		if (kor < 0 || eng < 0|| math < 0)
			return "양수를 입력하세요.";
		else {
			sum = kor + eng + math;
		}			
	}
}
public class AvgProgramming{
	public static void main(String[] args) {
		int sum;
		
		try {
			
		}
		
		
		
	}
}
