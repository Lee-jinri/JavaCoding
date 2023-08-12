package 예제;

public class classExampld {
	class Score{
		
		/* 이름과 세 과목의 점수를 이용해서 클래스를 작성해보자.
		 *  이름 |  국어  |  영어  |  수학  |
		 * 홍길동|   90  |  100  |   95  |
		 * 김철수|   90  |   80  |   95  |
		 */
		
		// 필드
		public String name;   
		public int kor;
		public int eng;
		public int mat;
		
		// 메소드
		public void printData() {
			System.out.println(name + " " + kor + " " + eng + " " + mat);
		}
	}
	class Car{
		// 필드 정의	
		public int speed;  		 // 속도
		public int gear;  		 // 기어 단수
		public String color; 	 // 색상
		
		// 메소드 정의
		public void speedUp() {    // 속도 증가 메소드
			speed += 10; }
		public void speedDown(){   // 속도 감소 메소드
			speed -= 10; }
		public void printDate(){
			System.out.println("속도 : " + speed + " 기어 : "+gear + " 색상 : "+ color);
		}
		
		public String toString() {
			return ("속도 : " + speed + " 기어 : "+gear + " 색상 : "+ color);
		}
	
	
	}
}