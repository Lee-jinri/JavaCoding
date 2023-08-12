package 예제;

public class mathRandom {
	public static void main(String[] args) {
		
		double data = Math.random();
		System.out.println(data);
		
		System.out.println((int)(data * 10));
		System.out.println((int)(data * 10) + 1);
		
		int num = ((int)Math.random() * 6) + 1;
		System.out.println("주사위 : " + num);
		System.out.println();
		
		// 5개의 정수를 저장할 수 있는 배열 생성. 1 ~ 10 사이의 임의숫잦가 저장될 수 있도록 설정. 그 값을 출력하는 프로그램
		
		int arr[] = new int [5]; 
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ((int)Math.random() * 10) + 1;
		}
		
		// 출력방법 1
		for (int i = 1; i < arr.length; i++ ) 
			System.out.print(arr[i] + " ");
			
		// 출력방법 2 (연습하기******)
		for (int value : arr)
			System.out.print(value + " ");
		
		System.out.println();
		
		/* 카드를 랜덤하게 선택하여 화면에 출력하는 코드를 작성하자
		 * {"Clubs","Diamonds","Hearts","Spades"} 와
		 * {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"}를
		 * 가지고 있는 문자열 배열을 생성하고 위 내용으로부터 랜덤하게 하나의 카드를 선택하는 코드를 작성
		 * 실행 결과 : Hearts의 Jack
		 */
		
		String type[] = {"Clubs","Diamonds","Hearts","Spades"};
		String card[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		int i = (int) (Math.random() * type.length);
		int j = (int) (Math.random() * card.length);
		
		System.out.println(type[i] + "의 " + card[j]);
		
		
		
		
		
		
				
	
			
			
			
	
 		
		
		
		
		
		
		
		
		
		
	}

}
