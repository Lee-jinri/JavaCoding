package 컬렉션;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<Movie> list = new Vector<Movie>();
		list.addElement(new Movie("배트맨","☆☆☆☆☆ 0", "맷 리브스","2022.03.01"));
		list.addElement(new Movie("나쁜 녀석들 : 더 무비","★★★★☆ 8.44","손용호","2019.09.11"));
		list.addElement(new Movie("아쿠아맨","☆☆☆☆☆ 0", "론 하워드", "2018.12.19"));
		
		printData(list);
	}

	// 인스턴스 생성할 수 있게 정적
	private static void printData(Vector<Movie> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.elementAt(i));
		}
		
		/* Iterator<Movie> e = list.iterator();
		 * while (e.hasNext()){
		 * 		System.out.println(e.next());
		 * }
		 */
			
	}
}
