import java.util.Scanner;

public class exam_while {

	public static void main(String[] args) {
		
		// �ۼ������� ������ �����δ� �ۼ��ؾ��ϴ� �κ�
		exam_while w = new exam_while();
		w.count();
	}
	
		public void count() {
			Scanner sc = new Scanner(System.in);
			
			while(true){  // false -> true
				System.out.println("���ڿ��� �Է����ּ���");
				String str = sc.nextLine();
				if(str.equals("exit")) {  // str == "exit" -> str.equals("exit")
					break;
				}else {
					System.out.println(str.length()+"�����Դϴ�.");
				}
				System.out.println("���α׷��� �����մϴ�.");
			}
		
		
		
		
		}

	}


