package java_project_day3;

public class example {
	public static void main(String[] args) {
	
		
		// while문을 이용하여 1부터 5까지 출력하는 코드 작성
	
		int i = 1;
		while(i <= 5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
	
	// for문을 이용해서 1부터 10까지의 정수 중 3의 배수의 총합을 구하는 코드 작성
		
		int result = 0;
		
		for(i = 1 ; i <= 10; i++ ) {
			if (i % 3 == 0)
				result += i;
		}
		
		System.out.println(result);
		
	}
}