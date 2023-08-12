package 컬렉션;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//printArray(list2);
		System.out.println();
		
		// 여러 영화정보를 저장하도록 인스턴스 생성
		// Movie 클래스는 영화제목(mTitle), 평점(mGrade), 감동(mDiretor), 개봉일(anYear) 등의 필드를 가진다.
		// 인터페이스명<타입 인자> 참조변수 = new 구현클래스 생성자<타입 인자>();
		List<Movie> list3 = new ArrayList<Movie>();
		list3.add(new Movie("배트면","8.78","맷 리브스","2022 개봉"));
		list3.add(new Movie("다크 나이트 라이즈","9.02","론 하워드","2022 재개봉"));
		
		Movie m = new Movie();
		m.setmTitle("어메이징 그레이스");
		m.setmGrade("8.62");
		m.setmDirector("시드니 폴락, 말란 엘리어트");
		list3.add(m);
		
		// 원소의 개수로 인덱스 접근
		for (Movie value : list3) {
			System.out.println(value.toString());
		}
		System.out.println();
		
		// 반복자
		Iterator<Movie> it = list3.iterator();
		while(it.hasNext()) {
			// Movie me = it.next();
			// system.out.println(me.toString());
			
			System.out.println(it.next().toString());
		}
	}

}
