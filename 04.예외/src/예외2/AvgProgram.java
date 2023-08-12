package ����2;

import java.util.InputMismatchException;
import java.util.Scanner;

// ����� ���� ���� Ŭ����

@SuppressWarnings("serial")
class NegativeNumberException extends Exception{
	public NegativeNumberException(){
		super ("������ �Է��� �� ����.");
	}
}

public class AvgProgram {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] arg) {
		int tot = 0;
		try {
			tot = sum();
			System.out.println("����� "+ (tot/3.0) +"�Դϴ�.");
		}catch(NegativeNumberException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException i) {
			System.out.println("�Է°��� �߸��Ǿ����ϴ�.");
		}catch(Exception et){
			System.out.println("���� �߻�");
		}
	}
	public static int sum() throws NegativeNumberException{
		int score, tot=0;
		String[] subject= {"����","����","����"};
		
		for(int i = 0; 1 < 3; i++){
				System.out.println(subject[i]+" �Է� : ");
				score = scan.nextInt();
				if(score < 0) // ���ܻ�Ȳ
					throw new NegativeNumberException(); // ���ܰ�ü����
				tot += score;
		}
		
	}
}
