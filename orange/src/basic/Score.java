package basic;

/* 성적을 출력하는 Score 클래스를 정의하자
 * 이름/ 국어/ 영어/ 수학/ 총점을 저장한다 (필드)
 * 필드에 값을 설정할 수 있는 기능, 점수들의 합,평균,학점을 구하는 기능
 * 모든 필드를 출력할 수 있는 기능을 포함하도록 한다(메서드)
 * 사용자에게 이름과 점수를 입력받아 나머지 평균과 학점을 출력하도록 한다.
 * [최종 실행 결과]
 * ==================================
 * 이름 국어 영어 수학 총점 평균 학점
 * ==================================
 * 홍길동 90 75 61 226 75.3 C
 * 김철수 55 56 46 157 52.3 F
 * 이진희 90 90 90 270 90.0 A
 */
public class Score {
	// 필드 선언
	public String name;
	public int kor;
	public int eng;
	public int math;
	public int total;
	
	// 메서드 정의
	
	// 1. 필드에 값을 설정할 수 있는 기능
	public void scoreData(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
	
	// 2. 합을 구하는 메소드 
	public void getTotal() {
		total = kor + eng + math;
	}
	
	// 3. 평균을 구하는 메소드
	public double getAverage() {
		return (double)total/3;
	}
	
	// 4. 학점을 구하는 메소드
	public char getGrade() {
		char hakjum = '\0';  // null을 의미
		double avg = getAverage();
	
		if(avg >= 90) {
			hakjum = 'A';
		}else if(avg >= 80) {
			hakjum = 'B';
		}else if(avg >= 70) {
			hakjum = 'C';
		}else if(avg >= 60) {
			hakjum = 'D';
		}else 
			hakjum = 'F';
		return hakjum;
	}
	
	
	public String toString() {
		return String.format("%s\t%d\t%d\t%d\t%d\t%.1f\t%c", name,kor,eng,math,total,getAverage(),getGrade());
	}

}
