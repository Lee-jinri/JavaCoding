package 예제;

import java.util.Scanner;

class Day {
	private String work; // 하루의 할 일
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work == null)
			System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}

class MonthSchedule{

	private int nDays;
	private Day [] days; //Day 객체 배열
	private Scanner scanner;
	
	public void monthSchedule(int nDays) {
		this.nDays = nDays;
		this.days = new Day[nDays];
		for(int i=0; i<days.length; i++) {
			days[i] = new Day();
		}
		scanner = new Scanner(System.in);
	}
	
	private void input() {
		System.out.print("날짜(1~31) : ");
		int day = scanner.nextInt();
		System.out.print("할 일(빈칸X) : ");
		String work = scanner.next();
		day--;
		
		if(day < 0 || day > nDays) {
			System.out.println("날짜를 잘못입력하셨습니다.");
			return;
		}
		days[day].set(work);
	}
	
	private void view() {
		System.out.print("날짜(1~31) : ");
		int day = scanner.nextInt();
		day--;
		if(day < 0 || day > nDays) { //0~29만 유효
			System.out.println("날짜를 잘못입력하셨습니다.");
			return;
		}
		System.out.println((day+1) + "일의 할 일은");
		days[day].show();
	}
	
	private void finish() {
		scanner.close();
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		System.out.println("이번 달 스케쥴 관리 프로그램.");
		
		while(true) {
			System.out.println("할 일(입력:1, 보기:2, 끝내기:3 >>");
			int menu = scanner.nextInt();
			switch(menu) {
			case 1: input(); break;
			case 2: view(); break;
			case 3: finish(); return;
			default :
				System.out.println("잘못입력하셨습니다.");
			}
			System.out.println();
		}
		}
			
		public static void main(String[] args) {
			MonthSchedule march = new MonthSchedule(); // 3월달의 할 일
			march.run();
		}
		

	}