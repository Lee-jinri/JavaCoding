package ����2;

public class StringTest2 {

	public static void main(String[] args) {
		String ssn = "660606-1234561";
		/* ������ ���ϴ� �޼��� ���� �� ȣ��. */
		System.out.println("����� ���� : %s\n" + getGender(ssn));

		/* ���� fileName�� ����� ���ϸ�(��: test.txt)���� Ȯ���� üũ�Ͽ� �̹��� ����(gif/jpg/png/jpeg)
		 * �� ������ Ȯ���ڸ� ���� ������ ��� " �̹��� ���ϸ� ��ϰ����մϴ�"��� �޽����� ����ϵ��� �ۼ��� ������.
		 * ���� Ȯ���ڸ� üũ�ϴ� �޼��� ȣ��(fileExtcheck())*/
		 
		String fileName = "test.txt";
		System.out.println("���ϸ� : "+ fileName);
		// �޼��� ȣ��� ����.
	}
	
	public static String getGender(String ssn) {
		String g = ssn.substring(7,8); // 7��° ���� 8-1����(7��°����) = 1
		String gender = null;
		
		if(g.equals("1") || g.equals("3")){
			gender = "����";
		}else if(g.equals("2") || g.equals("4")) {
			gender = "����";
		}
		return gender;
	}
		

}
