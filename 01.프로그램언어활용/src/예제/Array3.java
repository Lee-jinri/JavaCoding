package 예제;

public class Array3 {
	public static void main(String[] args) {
	// 일차원 배열에 대입된 점수에 해당하는 막대 그래프를 다음과 같이 출력하시오.
	// [실행 결과]
	// 90점 : ■ ■ ■ ■ ■ ■ ■ ■ ■ 
	// 20점 : ■ ■
	// 50점 : ■ ■ ■ ■ ■ 
	// 70점 : ■ ■ ■ ■ ■ ■ ■
	// 65점 : ■ ■ ■ ■ ■ ■
	// 90점 : ■ ■ ■ ■ ■ ■ ■ ■ ■
	// 100점: ■ ■ ■ ■ ■ ■ ■ ■ ■ ■
	// 43점 : ■ ■ ■ ■
	// 55점 : ■ ■ ■ ■ ■
	// 87점 : ■ ■ ■ ■ ■ ■ ■ ■

//		int array[] = {90, 20, 50, 70 ,65, 90, 100, 43, 55, 87};
//		String a = "■";
//		
//		for (int i = 0; i < array.length; i++) {
//			array[i] = array[i] / 10;
//			System.out.println(array[i]); ???
//		}
		
		
		int jumsu[] = {90, 20, 50, 70 ,65, 90, 100, 43, 55, 87};
		int count[] = new int[10];
		
		for(int i = 0; i < count.length; i++) {
			count[i] = jumsu[i] / 10; // 10의 자리 추출			
		}

		for (int i = 0; i < jumsu.length; i++) {
			System.out.printf("%4d점 : ",jumsu[i]);
			for (int j = 0; j < count[i]; j++) {
				System.out.print("■ ");
			}
			System.out.printf("\n");
		}












	}

}
