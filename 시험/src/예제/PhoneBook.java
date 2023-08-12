package 예제;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	// 접근자
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
}

public class PhoneBook {
	private Scanner scanner;
	// 객체 배열 선언(Phone 객체타입의 배열)
	private Phone[] pArray; 
	
	// 생성자
	public PhoneBook() {
		// 스캐너 인스턴스 생성
		scanner = new Scanner(System.in);
	}
	
	
	private void read() {
		// 인원수를 받는다.
		System.out.print("인원수 >>");
		int n = scanner.nextInt();
		pArray = new Phone[n]; // n명을 저장할 배열 선언
		
		// 이름과 전화번호 저장
		for(int i = 0; i <pArray.length; i++) {
			System.out.print("이름과 전화번호(빈칸없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			pArray[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다.");
	}
	
	// 검색하기위한 메소드
	private String search(String name) {
		for(int i=0; i<pArray.length;i++) {
			if(pArray[i].getName().equals(name)) 
				return pArray[i].getTel();
			}
			return null;
		}
		
	public void run() {
		read();
		while(true) {
			System.out.print("검색할 이름 >>");
			String name = scanner.next();
			if(name.equals("그만")) 
				break;
			String tel = search(name);
			if(tel == null)
				System.out.println(name + "는(은) 없습니다.");
			else
				System.out.println(name +"의 번호는 " + tel +"입니다.");
			}
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}	
	
	// 실행
	public static void main(String[] args) {
		new PhoneBook().run();
	
	}
}

