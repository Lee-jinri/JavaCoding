package Example01;
/* 전화번호 관리 프로그램 (2단계)
 * 사용자에게 데이터를 입력받아서 PhoneInfo클래스의 인스턴스를 생성한다
 * 사용자가 종료를 선택할 때까지 반복한다
 * 사용자에게 입력받을 데이터 (이름, 전화번호, 생년월일)
 * 입력받은 데이터로 PhoneInfo의 인스턴스 생성 -> 생성된 인스턴스의 showPhoneInfo메소드 호출
 * 
 * 
 */
import java.util.Scanner;


public class PhoneBookVer2 {
	static Scanner sc = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.println("선택 : ");
	}
	
	public static void readData() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		
		System.out.println("생년월일 : ");
		String birthday = sc.nextLine();
		
		if (birthday.equals(""))
			birthday = null;
		
		PhoneInfo info = new PhoneInfo(name, phone, birthday);
		System.out.println("\n입력된 정보 출력");
		info.showInfo();
	}

	public static void main(String[] args) {
			int choice;
			
			while(true) {
				showMenu();
				choice = sc.nextInt();
				sc.nextLine();
				
				switch (choice) {
				case 1 :
					readData();
					break;
				case 2 : 
					System.out.println("프로그램을 종료합니다.");
					return;
				}
			}
		

	}

}
