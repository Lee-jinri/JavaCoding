package basic;

// ���޵� ���� �Ҽ����� �ƴ����� �Ǵ��Ͽ� �Ҽ��� true�� �Ҽ��� �ƴϸ� false�� ��ȯ�ϴ� �޼ҵ� ����
// 1 �̻� 100 ������ �Ҽ��� ���� ����ϴ� ��� �޼ҵ� main ����

public class Method3 {
	public static void main(String[] args) {
		
		
		// ���
		for(int i = 1; i <= 100; i++) {
			if(isPrimeNumber(i))
				System.out.println(i);
		 }

	}

    public static boolean isPrimeNumber(int num) {
        if(num == 1)
            return false;
        
        for(int i = 2; i < num; i++) {
            if(num % i == 0)
                return false;
        }
        
        return true;
    }

}
