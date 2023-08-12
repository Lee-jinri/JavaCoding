package 컬렉션3;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// push() 메소드 : Stack에 데이터 추가
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// pop() 메소드 : Stack에 데이터 반환.
		while (!coinBox.isEmpty()) { // 코인박스가 비어있지 않다면
			Coin coin = coinBox.pop(); // 클래스코인의 코인 = 코인박스에서 꺼낸 것
			System.out.println("꺼내온 동전(pop) : " + coin.getValue() + "원");  // 코인박스에서 꺼낸 것의 값
			// 가장 마지막에 넣은 값 부터 꺼내진다. 꺼내지면서 값이 삭제 됨.
		}
		System.out.println(coinBox.isEmpty()); // true, 코인박스가 비어있다
		
		
	
	}

}
