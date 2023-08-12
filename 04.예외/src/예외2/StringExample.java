package ����2;

public class StringExample {

	public static void main(String[] args) {
		// �ν��Ͻ� ����
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a +"�� ���̴� " + a.length());  // ���ڿ��� ����(���� ����)  3(��������)
		System.out.println(a.contains("#"));  // ���ڿ��� ���� ���� a( C#)�� #�̶�� ���ڸ� �����ϴ��� true  
		
		a = a.concat(b);  // ���ڿ� ���� (a�� b�� ���ڿ� ����) 
		System.out.println(a);  // ( C#,C++ )

		a = a.trim(); // ���ڿ� �� ���� ���� ���� (�������)C#,C++
		System.out.println(a);
			
		a = a.replace("C#","Java");	// ���ڿ� ��ü (C#�� Java�� �ٲ�) Java,C++
		System.out.println(a);
		
		String s[] = a.split(",");	// ���ڿ� �и� (,�� �������� ���ڿ��� �и��ϰ� �и��� ���ڿ��� s��� �迭�� 0��°,1��° �ε����� ����)
		for (int i = 0; i<s.length; i++)
			System.out.println("�и��� ���ڿ�" + i + " :" + s[i]); // (�и��ȹ��ڿ�0:Java, �и��ȹ��ڿ�1:C++)
	
		// substring(����,�� - 1) 
		// ex) substring(0,4) 0���� 4�� ������ = 0~3 / ������ ���۰��� �� ��
		a = a.substring(5);	// �ε��� 5���� ������ ���� ��Ʈ�� ����, a = JavaC++ 5���� C++���� ������ ����
		System.out.println(a); // C++

		char c = a.charAt(2); // �ε��� 2�� ���� ���� -> a = C++ C++�� �� ��° ������ + ���� 
		System.out.println(c); // +
		
		String subject = "JAVA ���α׷���";
		// �ڹ� ���� å���� �ƴ����� �Ǻ��� �� �ֵ��� ���ǽ� �ۼ����ּ���.
		System.out.println(subject.indexOf("JAVA")); // 0, JAVA�� �ε����� 0������ �����Ѵ�
		if(subject.indexOf("JAVA") != -1) { 	// JAVA�� �ε����� -1�� �ƴ϶�� = JAVA�� subject�� �ִٸ� 0 ���ٸ� -1
			System.out.println("�ڹٿ� ���õ� å�Դϴ�.");
		}else {
			System.out.println("�ڹٿ� ���þ��� å�Դϴ�.");
		}
	
		String country = "�ѱ�,�Ϻ�,�߱�,�̱�,����,������";
		
		// ������ �����ڷ� �ڸ� �� ���ڿ� �迭�� ��ȯ
		String[] list = country.split(","); // ,�� �������� �߶� ���ڹ迭�� ����
		
		// �и��ϴ� ������, �и��ϴ� ���ڿ��� ����(��ü ���ڿ� ������ 2���� ����)
		String[] list2 = country.split(",",2); // 2���� ���� -> ù��° ,�� �������� ���� �ѱ� / �Ϻ�,�߱�,�̱�,����,������
		
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println("=======================");
		for(String item : list2) {
			System.out.println(item);
		}
		System.out.println("=======================");
	
		// ���̵�� �������� �и��ϰ� �;��, split() �޼��带 ������� �ʰ�, ��µǵ��� �ڵ� �ۼ����ּ���.
		String email = "purum@rubypaper.co.kr";
		int i = email.indexOf("@");	 	// @�� ���° �ε����� ��ġ�ϳ���? 	
		String id = email.substring(0,i); // id = 0��° �ε������� i���� ���� (@�� ������)
		String company = email.substring(i + 1); // company = i+1���� ���� (@ �ں��� ������)
		System.out.println(id);			// purum
		System.out.println(company);	// rubypaper.co.kr
	
		// valueOf(�����ڷ���) - �����ڷ����� ���ڷ� ��ȯ�Ѵ�.  
		int number = 10;
		String value = String.valueOf(number); // Ŭ������.valueOf - ���� 10�̵�.
		System.out.println(value);
		
	
	}

}
