import java.util.Scanner;

public class exam_while {

	public static void main(String[] args) {
		
		// 작성돼있진 않지만 실제로는 작성해야하는 부분
		exam_while w = new exam_while();
		w.count();
	}
	
		public void count() {
			Scanner sc = new Scanner(System.in);
			
			while(true){  // false -> true
				System.out.println("문자열을 입력해주세요");
				String str = sc.nextLine();
				if(str.equals("exit")) {  // str == "exit" -> str.equals("exit")
					break;
				}else {
					System.out.println(str.length()+"글자입니다.");
				}
				System.out.println("프로그램을 종료합니다.");
			}
		
		
		
		
		}

	}


