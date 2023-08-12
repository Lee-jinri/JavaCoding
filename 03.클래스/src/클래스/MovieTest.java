package 클래스;

import java.util.Scanner;

public class MovieTest {

	public static void main(String[] args) {
		// 클래스명 참조변수 = new 클래스명();
		// 1
		Movie myMovie = new Movie();
		
		myMovie.name = "이름";
		myMovie.actor = "이뭉이";
		myMovie.date = "2022년 02월 03일";
		myMovie.genre = "호러";
		
		System.out.println(myMovie.toString());

		
		// 2 
		Scanner sc = new Scanner(System.in);
		Movie yourMovie = new Movie();
		
		System.out.println("영화 제목, 출연배우, 개봉일, 장르를 입력하세요 : ");
		
		yourMovie.name = sc.next();
		yourMovie.actor = sc.next();
		yourMovie.date = sc.next();
		yourMovie.genre = sc.next();
		
		
		
		yourMovie.display();
		
		
		
		
		
	}

}
