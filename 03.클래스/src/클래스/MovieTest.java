package Ŭ����;

import java.util.Scanner;

public class MovieTest {

	public static void main(String[] args) {
		// Ŭ������ �������� = new Ŭ������();
		// 1
		Movie myMovie = new Movie();
		
		myMovie.name = "�̸�";
		myMovie.actor = "�̹���";
		myMovie.date = "2022�� 02�� 03��";
		myMovie.genre = "ȣ��";
		
		System.out.println(myMovie.toString());

		
		// 2 
		Scanner sc = new Scanner(System.in);
		Movie yourMovie = new Movie();
		
		System.out.println("��ȭ ����, �⿬���, ������, �帣�� �Է��ϼ��� : ");
		
		yourMovie.name = sc.next();
		yourMovie.actor = sc.next();
		yourMovie.date = sc.next();
		yourMovie.genre = sc.next();
		
		
		
		yourMovie.display();
		
		
		
		
		
	}

}
