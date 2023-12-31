package 예외2;

import java.util.InputMismatchException;
import java.util.Scanner;

// 사용자 정의 예외 클래스

@SuppressWarnings("serial")
class NegativeNumberException extends Exception{
	public NegativeNumberException(){
		super ("음수는 입력할 수 없음.");
	}
}

public class AvgProgram {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] arg) {
		int tot = 0;
		try {
			tot = sum();
			System.out.println("평균은 "+ (tot/3.0) +"입니다.");
		}catch(NegativeNumberException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException i) {
			System.out.println("입력값이 잘못되었습니다.");
		}catch(Exception et){
			System.out.println("예외 발생");
		}
	}
	public static int sum() throws NegativeNumberException{
		int score, tot=0;
		String[] subject= {"국어","영어","수학"};
		
		for(int i = 0; 1 < 3; i++){
				System.out.println(subject[i]+" 입력 : ");
				score = scan.nextInt();
				if(score < 0) // 예외상황
					throw new NegativeNumberException(); // 예외객체생성
				tot += score;
		}
		
	}
}
