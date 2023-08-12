package 예제;

import java.util.Scanner;

public class dlatl {

	public static void main(String[] args) {
		
		/* 
		 * [배열]
		 * -참조변수
		 * -변수명으로 접근 -> 주소값을 참조
		 * -같은 타입의 데이터여야 함
		 * 
		 * 참조변수의 ==,!= 연산
		 * -동일한 객체의 주소값을 비교
		 * String name = new String("홍길동")
		 * String name2 = new String("홍길동")
		 * name과 name2는 같지않음
		 * 주소가 달라서 문자비교 메소드를 써야함
		 * 
		 * null(널)
		 * - 참조하는 객체가 없을 때
		 * 참조타입에만 사용
		 * 
		 * [배열의 선언과 사용]
		 * - 같은 타입의 데이터를 연속된 공간에 저장
		 * 	(여러 변수를 하나의 이름으로)
		 * - 각 데이터는 인덱스로 접근(0부터 시작) 
		 *  ex) num[0]
		 *  
		 *  인덱스
		 *       배열이름          [인덱스]
		 * (배열 저장공간의 주소) (데이터의 위치)
		 *  
		 * 배열의 장점
		 * -중복된 변수 선언 줄일 수 있따
		 * -반복문을 이용해 쉬운 처리
		 * 
		 * [배열 생성]
		 * new 데이터타입[개수];
		 * ex)new int[5];
		 * int타입 데이터가 들어갈 공간 5개 만듦
		 * 
		 * [배열 선언]
		 * 데이터 타입[] 변수명;
		 * 데이터 타입 변수명[];
		 * 
		 * [배열 선언과 동시에 생성]
		 * 데이터타입[] 변수명 = new 데이터 타입[개수];
		 * ex) int[] numbers = new int[5];
		 * 
		 * [배열 초기화]
		 * - 인덱스로 접근하여 하나하나 초기화
		 * - 데이터 타입 [] 배열명 = new 데이터타입[](값1, 값2, 값3..);
		 * 
		 * 배열의 길이.length
		 * int[] arr = {10, 20, 30, 40, 50}';
		 * for (int i = 0; i<arr.length; i++){
		 * 		system.out.print(arr[i]);
		 * }
		 * 
		 * 확장for문
		 * for(데이터 타입 변수 : 배열명){
		 * 		실행문
		 * }
		 * int[] numbers = {10,20,30}
		 * for(int num:numbers){
		 * 		sysout.print(num);
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		

		int[] numbers = new int[3];
		numbers[0] = 10; // 배열에 값 대입
		numbers[1] = 20;
		numbers[2] = 30;
		
		System.out.println("numbers[0] = " + numbers[0]);
		System.out.println("numbers[1] = " + numbers[1]);
		System.out.println("numbers[2] = " + numbers[2]);
		System.out.println();
		
		double[] arrayDouble = new double[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("arrayDouble["+i+"] = " + arrayDouble[i]);
		}
		System.out.println();
		
		String[] arrayString = new String[3];
		arrayString[0] = "java";
		arrayString[1] = "oracle";
		arrayString[2] = "spring";
		
		for (int i = 0; i < 3; i++) {
			System.out.println("arrayString[" + i + "] = " + arrayString[i]);
		}
		System.out.println();
		
		// 사용자에게 5개의 정수를 입력받고 값을 출력하세요 (배열이용)
		
		// 배열 선언 			배열새엉
		int[] nums = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===배열의 값 입력===");
		for (int i = 0; i < 5 ; i++) {
			System.out.println((i+1)+"번째 정수 입력 : ");
			nums[i] = sc.nextInt();
		}
		
		System.out.println("===배열의 값 출력");
		for(int j = 0; j<5; j++) {
			System.out.println("nums["+j+"] = " + nums[j]);
		}
		
		System.out.println("===배열의 값 출력===");
		for (int value : nums) {
			System.out.println(value + " ");
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
