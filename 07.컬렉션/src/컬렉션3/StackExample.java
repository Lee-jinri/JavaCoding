package �÷���3;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// push() �޼ҵ� : Stack�� ������ �߰�
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// pop() �޼ҵ� : Stack�� ������ ��ȯ.
		while (!coinBox.isEmpty()) { // ���ιڽ��� ������� �ʴٸ�
			Coin coin = coinBox.pop(); // Ŭ���������� ���� = ���ιڽ����� ���� ��
			System.out.println("������ ����(pop) : " + coin.getValue() + "��");  // ���ιڽ����� ���� ���� ��
			// ���� �������� ���� �� ���� ��������. �������鼭 ���� ���� ��.
		}
		System.out.println(coinBox.isEmpty()); // true, ���ιڽ��� ����ִ�
		
		
	
	}

}
