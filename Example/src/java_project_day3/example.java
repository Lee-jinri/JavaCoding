package java_project_day3;

public class example {
	public static void main(String[] args) {
	
		
		// while���� �̿��Ͽ� 1���� 5���� ����ϴ� �ڵ� �ۼ�
	
		int i = 1;
		while(i <= 5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
	
	// for���� �̿��ؼ� 1���� 10������ ���� �� 3�� ����� ������ ���ϴ� �ڵ� �ۼ�
		
		int result = 0;
		
		for(i = 1 ; i <= 10; i++ ) {
			if (i % 3 == 0)
				result += i;
		}
		
		System.out.println(result);
		
	}
}