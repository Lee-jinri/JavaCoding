package Example01;
/* ��ȭ��ȣ ���� ���α׷� (2�ܰ�)
 * ����ڿ��� �����͸� �Է¹޾Ƽ� PhoneInfoŬ������ �ν��Ͻ��� �����Ѵ�
 * ����ڰ� ���Ḧ ������ ������ �ݺ��Ѵ�
 * ����ڿ��� �Է¹��� ������ (�̸�, ��ȭ��ȣ, �������)
 * �Է¹��� �����ͷ� PhoneInfo�� �ν��Ͻ� ���� -> ������ �ν��Ͻ��� showPhoneInfo�޼ҵ� ȣ��
 * 
 * 
 */
import java.util.Scanner;


public class PhoneBookVer2 {
	static Scanner sc = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("�����ϼ���");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ���α׷� ����");
		System.out.println("���� : ");
	}
	
	public static void readData() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("��ȭ��ȣ : ");
		String phone = sc.nextLine();
		
		System.out.println("������� : ");
		String birthday = sc.nextLine();
		
		if (birthday.equals(""))
			birthday = null;
		
		PhoneInfo info = new PhoneInfo(name, phone, birthday);
		System.out.println("\n�Էµ� ���� ���");
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
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}
			}
		

	}

}
