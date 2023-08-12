package �÷���3;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

/* Ű����� 10���� ���� �̸��� �ΰ� �Է¹ٴ� ��� HashMap�� ������ ��,
 * ���� �̸��� Ű����κ��� �Է� �޾� �� ������ �α��� ����ϴ� ���α׷��� �ۼ�����.
 * 
 * [���� ���� - 2���� ������ �Է�]
 * ���� �̸��� �α��� 10�� �Է��ϼ���. (�� : ���ѹα� 51833175)
 * ���� �̸�, �α� >> ���ѹα� 51833175
 * ���� �̸�, �α� >> ���� 66830229
 * 
 * ���� �̸��� �Է��ϸ� �α��� �˻��� �� �ֽ��ϴ�. ���� �Է��ϸ� �����մϴ�.
 * ���� �̸� >> ���ѹα�
 * ���ѹα��� �α����� 51833175�� �Դϴ�
 * ���� �̸� >> ������ �α����� 66830229�� �Դϴ�.
 * ������ �α�����
 * 
 * ���� �̸�>> ��
 * �����մϴ�.
 */
public class HashMapNation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		DecimalFormat decimalFormat = new DecimalFormat("#,###"); // 1000�ڸ��� �Ǹ� , ������ �Է��ϵ���
		String nation;
		int population = 0;
		
		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���. (��: ���ѹα� 51833175)");
		for(int i=0; i<10; i++) {
			System.out.println("���� �̸�, �α� >>");
			nation = sc.next(); //next�� ������ ����, nextLine�� ������ ����
			population = sc.nextInt();
			nations.put(nation, population);
		}
		
		System.out.println("\n���� �̸��� �Է��ϸ� �α��� �˻��� �� �ֽ��ϴ�. \"��\"�� �Է��ϸ� ����˴ϴ�.");
		nation = null;
		while(true) {
			System.out.print("���� �̸�>> ");
			nation = sc.next();
			if(nation.equals("��"))
				break;
			Integer n = nations.get(nation);
			if(n == null) {
				System.out.println(nation + "���� �����ϴ�.");
			}else {
				String format = decimalFormat.format(n);
				System.out.printf("%s�� �α��� %S\n", nation, format);
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();

	}

}
