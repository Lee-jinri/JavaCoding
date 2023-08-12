package ����;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MulteCatchExample {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// �������� catch�� ����� ���� ����Ŭ�������� ����մϴ�
		try {
			int[] i = new int[2];
			System.out.println("������ �Է����ּ���.");
			i[2] = scan.nextInt();			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε��� ��ȣ�� ����ϴ�.");
		} catch (InputMismatchException e) {
			System.out.println("������ �ƴմϴ�.");
		} catch (Exception e) {
			System.out.println("���࿡ ������ �ֽ��ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}

	}

}
