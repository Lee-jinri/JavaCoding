package �÷���3;

import java.util.HashSet;
import java.util.Set;

/* 2, �ζǹ�ȣ 6�ڸ��� ����ϵ��� �ڵ� �ۼ�
   �ߺ� �� �� */
public class LotteExample {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		System.out.println(lotto.toString());

	}

}
class Lotto{
	Set<Integer> set = new HashSet<Integer>();
	
	public Lotto() {
		int d;
		for(int i = 0; i < 6; i++) {
			do {
				d = (int) (Math.random() * 45.0) +1;
			}while(set.contains(d));
			set.add(d);
		}
	}
	
	@Override
	public String toString() {
		return "Lotto ��ȣ " + set.toString();
	}
}
