package ����;

public class mathRandom {
	public static void main(String[] args) {
		
		double data = Math.random();
		System.out.println(data);
		
		System.out.println((int)(data * 10));
		System.out.println((int)(data * 10) + 1);
		
		int num = ((int)Math.random() * 6) + 1;
		System.out.println("�ֻ��� : " + num);
		System.out.println();
		
		// 5���� ������ ������ �� �ִ� �迭 ����. 1 ~ 10 ������ ���Ǽ��氡 ����� �� �ֵ��� ����. �� ���� ����ϴ� ���α׷�
		
		int arr[] = new int [5]; 
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ((int)Math.random() * 10) + 1;
		}
		
		// ��¹�� 1
		for (int i = 1; i < arr.length; i++ ) 
			System.out.print(arr[i] + " ");
			
		// ��¹�� 2 (�����ϱ�******)
		for (int value : arr)
			System.out.print(value + " ");
		
		System.out.println();
		
		/* ī�带 �����ϰ� �����Ͽ� ȭ�鿡 ����ϴ� �ڵ带 �ۼ�����
		 * {"Clubs","Diamonds","Hearts","Spades"} ��
		 * {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"}��
		 * ������ �ִ� ���ڿ� �迭�� �����ϰ� �� �������κ��� �����ϰ� �ϳ��� ī�带 �����ϴ� �ڵ带 �ۼ�
		 * ���� ��� : Hearts�� Jack
		 */
		
		String type[] = {"Clubs","Diamonds","Hearts","Spades"};
		String card[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		int i = (int) (Math.random() * type.length);
		int j = (int) (Math.random() * card.length);
		
		System.out.println(type[i] + "�� " + card[j]);
		
		
		
		
		
		
				
	
			
			
			
	
 		
		
		
		
		
		
		
		
		
		
	}

}
