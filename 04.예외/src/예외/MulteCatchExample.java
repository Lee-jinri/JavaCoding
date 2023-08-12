package 예외;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MulteCatchExample {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// 여러개의 catch를 사용할 때는 하위클래스부터 사용합니당
		try {
			int[] i = new int[2];
			System.out.println("정수를 입력해주세요.");
			i[2] = scan.nextInt();			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 번호를 벗어납니다.");
		} catch (InputMismatchException e) {
			System.out.println("정수가 아닙니다.");
		} catch (Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
