package basic;

public class Repetitive {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 100;
		int big;    // 큰수
		int diff;   // 절댓값

		if(num1 > num2)
			big = num1;
		else
			big = num2;
		
		if(num1 > num2)
			diff = num1 - num2;
		else
			diff = num2 - num1;
		
		System.out.println("큰 수 : " + big);
		System.out.println("절댓값 : " + diff);

	

	// 5단 구구단을 출력한다
	for(int i = 1; i < 10; i++) {
		System.out.println("5 * " + i + " = " + (5*i));
	}
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
