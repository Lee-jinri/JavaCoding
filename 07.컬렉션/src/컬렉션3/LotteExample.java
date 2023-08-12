package 컬렉션3;

import java.util.HashSet;
import java.util.Set;

/* 2, 로또번호 6자리를 출력하도록 코드 작성
   중복 안 됨 */
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
		return "Lotto 번호 " + set.toString();
	}
}
