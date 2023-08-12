package 컬렉션;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest2 {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.addElement("서울");
		vector.addElement("도쿄");
		vector.addElement("뉴욕");
	
		// elements()메서드는 Enumeration 인터페이스로 구현된 클래스의 주소값 반환
		Enumeration<String> en = vector.elements();
		
		while (en.hasMoreElements()) {
			String city = en.nextElement();
			System.out.println(city);
		}
		
		System.out.println("============================");
		
		Enumeration<String> en2 = vector.elements();
		Iterator<String> iter = en2.asIterator();
		while (iter.hasNext()){
			System.out.println(iter.next());
		}
	
	
	
	
	
	
	}

}
