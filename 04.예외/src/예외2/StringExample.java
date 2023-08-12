package 예외2;

public class StringExample {

	public static void main(String[] args) {
		// 인스턴스 생성
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a +"의 길이는 " + a.length());  // 문자열의 길이(문자 개수)  3(공백포함)
		System.out.println(a.contains("#"));  // 문자열의 포함 관계 a( C#)는 #이라는 글자를 포함하는지 true  
		
		a = a.concat(b);  // 문자열 연결 (a와 b의 문자열 연결) 
		System.out.println(a);  // ( C#,C++ )

		a = a.trim(); // 문자열 앞 뒤의 공백 제거 (공백없음)C#,C++
		System.out.println(a);
			
		a = a.replace("C#","Java");	// 문자열 대체 (C#을 Java로 바꿈) Java,C++
		System.out.println(a);
		
		String s[] = a.split(",");	// 문자열 분리 (,를 기준으로 문자열을 분리하고 분리된 문자열을 s라는 배열에 0번째,1번째 인덱스로 만듦)
		for (int i = 0; i<s.length; i++)
			System.out.println("분리된 문자열" + i + " :" + s[i]); // (분리된문자열0:Java, 분리된문자열1:C++)
	
		// substring(시작,끝 - 1) 
		// ex) substring(0,4) 0부터 4번 전까지 = 0~3 / 지금은 시작값만 준 것
		a = a.substring(5);	// 인덱스 5부터 끝까지 서브 스트링 리턴, a = JavaC++ 5번인 C++부터 끝까지 리턴
		System.out.println(a); // C++

		char c = a.charAt(2); // 인덱스 2의 문자 리턴 -> a = C++ C++의 두 번째 글자인 + 리턴 
		System.out.println(c); // +
		
		String subject = "JAVA 프로그래밍";
		// 자바 관련 책인지 아닌지를 판별할 수 있도록 조건식 작성해주세요.
		System.out.println(subject.indexOf("JAVA")); // 0, JAVA의 인덱스가 0번부터 시작한다
		if(subject.indexOf("JAVA") != -1) { 	// JAVA의 인덱스가 -1이 아니라면 = JAVA가 subject에 있다면 0 없다면 -1
			System.out.println("자바와 관련된 책입니다.");
		}else {
			System.out.println("자바와 관련없는 책입니다.");
		}
	
		String country = "한국,일본,중국,미국,독일,프랑스";
		
		// 지정된 구분자로 자른 후 문자열 배열로 반환
		String[] list = country.split(","); // ,를 기준으로 잘라서 문자배열에 대입
		
		// 분리하는 구분자, 분리하는 문자열의 개수(전체 문자열 개수는 2개로 한정)
		String[] list2 = country.split(",",2); // 2개로 나눔 -> 첫번째 ,를 기준으로 나눔 한국 / 일본,중국,미국,독일,프랑스
		
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println("=======================");
		for(String item : list2) {
			System.out.println(item);
		}
		System.out.println("=======================");
	
		// 아이디와 도메인을 분리하고 싶어용, split() 메서드를 사용하지 않고, 출력되도록 코드 작성해주세요.
		String email = "purum@rubypaper.co.kr";
		int i = email.indexOf("@");	 	// @가 몇번째 인덱스에 위치하나요? 	
		String id = email.substring(0,i); // id = 0번째 인덱스부터 i까지 추출 (@의 전까지)
		String company = email.substring(i + 1); // company = i+1부터 추출 (@ 뒤부터 끝까지)
		System.out.println(id);			// purum
		System.out.println(company);	// rubypaper.co.kr
	
		// valueOf(기초자료형) - 기초자료형을 문자로 변환한다.  
		int number = 10;
		String value = String.valueOf(number); // 클래스명.valueOf - 문자 10이됨.
		System.out.println(value);
		
	
	}

}
