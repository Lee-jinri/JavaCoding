package �÷���3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
	// ���θ޼ҵ�
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=2; i <= 10; i++)
			list.add(i);
		
		// ����Ʈ�� ������ �������� ���´�.
		Collections.shuffle(list);
		System.out.println(list.toString());
	}

}
