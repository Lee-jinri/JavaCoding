package 예제;

public class SchoolCafeteriaExample {

	public static void main(String[] args) {
		
		// 학생 급식 만족도 조사 (20명)
		// 1은 불만족, 2는 보통, 3은 만족
		
		int[] assessment = {1, 2, 1, 2, 3, 1, 2, 2, 3, 1, 3, 3, 1, 1, 1, 2, 3, 1, 3, 2};
		int a=0,b=0,c=0;
		
		for (int i = 0; i < assessment.length; i++) {
			if(assessment[i] == 1) {
				a++;
			}else if(assessment[i] == 2) {
				b++;	
			}else if(assessment[i] == 3) {
				c++;
			}
		}System.out.printf("불만족 : %d 보통 :%d 만족 : %d",a,b,c);
	
	}
}
