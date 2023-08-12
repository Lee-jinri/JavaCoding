package basic;

// 전달된 값이 소수인지 아닌지를 판단하여 소수면 true를 소수가 아니면 false를 반환하는 메소드 정의
// 1 이상 100 이하의 소수를 전부 출력하는 출력 메소드 main 정의

public class Method3 {
	public static void main(String[] args) {
		
		
		// 출력
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
