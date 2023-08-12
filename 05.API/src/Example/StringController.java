package Example;

import java.util.StringTokenizer;

public class StringController {

	public void strMethod1() {
		// 1. ���ڿ��� ���ͷ�(������ �ʴ� ��)�� ����
		String str = "���ͷ� ���ڿ�";
		String str1 = "���ͷ� ���ڿ�";
		String str2 = "�ٸ� ���ͷ� ���ڿ�";   // �˰���� API�� Ŀ���� �ø��� shift + f2������ api���� â�� ���
		
		// 2. ���ڿ��� �����ڸ� ���� ����
		String strObj = new String("������ ���ڿ�");
		String strObj1 = new String("������ ���ڿ�");
		
		System.out.println("=== ���ͷ� ��� ���ڿ� ===");
		System.out.println(System.identityHashCode(str));  // 681842940
		System.out.println(System.identityHashCode(str1)); // 681842940 -> ���� ���ڴ� �ּҰ��� ����.(String pool ���󵵵�)
		System.out.println(System.identityHashCode(str2)); // 1392838282
		str1 = "�Ǵٸ� ���ͷ� ���ڿ�";
		System.out.println(System.identityHashCode(str1)); // 523429237 -> �����ϸ� ���ο� �ּҰ��� �����ϰԵ�
		
		System.out.println("=== ������ ��� ���ڿ� ===");
		System.out.println(System.identityHashCode(strObj));  // 664740647
		System.out.println(System.identityHashCode(strObj1)); // 804564176 ->������ ����� ���� ���ڿ��� �ٸ� �ּҰ�
	
	}

	public void strMethod2() {
// 					���ڿ��� �޼ҵ�
		String str = "���ڿ�"; // �ε��� 0,1,2
		
	// charAt (���ڿ����� ���� �ϳ� ��󳻱�)
		System.out.println(str.charAt(0));  // ��
		
	// concat (���ڿ� ��ġ��)	
		System.out.println(str.concat(" ��ġ��")); // ���ڿ� ��ġ��
	
	// contains (���ڿ� ���� ����)
		System.out.println(str.contains("�ڿ�")); // boolean���� ��ȯ, true
	
	// equals (��)
		System.out.println(str.equals("���ڿ�")); // boolean���� ��ȯ, true
	
	// length (���ڿ��� ����)
		System.out.println(str.length()); // int�� ��ȯ, 3
		
	// split (���ڿ� ����(Ư����ȣ)�ؼ� String �迭�� �������)
		String str1 = "API,String,���캸��";
		String[] strArr = str1.split(","); // �迭�� ��ȯ
		
		// for������ Ȯ��
		for(int i=0; i<strArr.length;i++) {
			if(i != strArr.length - 1)
				System.out.print(strArr[i] + ","); // API String ���캸�� 
			else
				System.out.println(strArr[i]);
		}
	
		// for~each�� - �ڷ��� ������ : ������ / ���� �ϳ��ϳ��� ������ �ڷ����� ���������� ��ȯ
		for(String arr : strArr) {
			System.out.print(arr + ","); // API,String,���캸��,
		}
		System.out.println();
		
	// toUpperCase (�빮�ڷ� �ٲ��ִ� �޼ҵ�)
		String str2 = "string";
		System.out.println(str2.toUpperCase());
	
	// substring (�߶󳻱�)
//		String str1 = "API,String,���캸��";
		System.out.println(str1.substring(5,8)); // start index ~ end index -1 ����  tri
		
	// trim (���� ����)
		String str3 = "       abc          ";
		System.out.println(str2.trim());   // string
	}
	
	public void sbMethod() {
		
	//	StringBuilder sb = new StringBuilder("��Ʈ������"); // 5���� ���ڿ� ����
		StringBuffer sb = new StringBuffer("��Ʈ������"); // ū ���̰� ���� (����ȭ�� �� �ϴ� �� ����)
		
	// capacity() : ���ڿ��� ����	
		System.out.println(sb.capacity()); // 21
		
	// length() : ���ڿ��� ����
		System.out.println(sb.length());   // 5
		
		// ���ڿ��� ������ �������� �� ���� (12)
		StringBuilder sb1 = new StringBuilder(12);
		System.out.println(sb1.capacity()); // 12
	}

	public void sbMethod1() {
		StringBuilder sbd = new StringBuilder("�ȳ�! ");
		System.out.println("sbd ���� : " + sbd + ", �ּ� : " + sbd.hashCode()); // 681842940
		System.out.println(System.identityHashCode(sbd));
		// hashCode�޼ҵ带 ���� �Ŷ� �Ȱ��� �ؽ��ڵ尡 �� ����ϱ� �ؽ��ڵ� ����
		
		// append : ���� ���ڿ��� ���ڿ��� �ڿ� �߰�
		sbd.append("�� StringBuilder��");
		System.out.println("sbd �߰� : " + sbd + ", �ּ� : " + sbd.hashCode()); // 681842940
		// ���ڿ��� �߰��Ǿ����� �ּҰ��� ������ ����
		
		// �޼ҵ� ü�̴�
		StringBuilder sb = new StringBuilder("�� ");
		sb.append("���� �־�").append("~!");
		System.out.println(sb); // �� ���� �־�~!
		System.out.println(sb.capacity()); // StringBuilder�� ũ�� >> 18 ���� 16�ε� ���� ���� 2���ڸ� �Է��߱⶧���� 2 �þ
		System.out.println(sb.length()); // ���� 9
		
		// insert : ���� ���ڿ��� ���ϴ� �κп� ���ڿ� ����
		sb.insert(2, "���̾�Ʈ �ϴ��� ");
		System.out.println(sb);
		
		// delete : ����� ���ڿ� �κ� ����
		sb.delete(0, 8); // end -1������
		System.out.println(sb);
		
		// reverse : ����� ���ڿ� �Ųٷ�
		sb.reverse();
		System.out.println(sb);
	}


	public void stMethod() {
		String str = "����, 20, ����, ��";
		StringTokenizer st = new StringTokenizer(str, ","); // str�� ,�� �����ؼ� ��ū�� ����
		
		while(st.hasMoreTokens()) { // hasMoreTokens() : ���� ��ū�� �ִ�? true/false
//			String str1 = st.nextToken(); // ��ū�� ������ ��ū�� ��������� -> ��� ����ҰŸ� �ٸ� ���ڿ��� ��ū�� �����ؾ���
			System.out.println(st.nextToken()); 
//			System.out.println(str1);
		}
	}








}
