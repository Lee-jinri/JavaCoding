package Example;

import java.util.StringTokenizer;

public class StringController {

	public void strMethod1() {
		// 1. 문자열을 리터럴(변하지 않는 값)로 생성
		String str = "리터럴 문자열";
		String str1 = "리터럴 문자열";
		String str2 = "다른 리터럴 문자열";   // 알고싶은 API에 커서를 올리고 shift + f2누르면 api설명 창이 뜬다
		
		// 2. 문자열을 생성자를 통해 생성
		String strObj = new String("생성자 문자열");
		String strObj1 = new String("생성자 문자열");
		
		System.out.println("=== 리터럴 방식 문자열 ===");
		System.out.println(System.identityHashCode(str));  // 681842940
		System.out.println(System.identityHashCode(str1)); // 681842940 -> 같은 문자는 주소값이 같다.(String pool 몰라도됨)
		System.out.println(System.identityHashCode(str2)); // 1392838282
		str1 = "또다른 리터럴 문자열";
		System.out.println(System.identityHashCode(str1)); // 523429237 -> 변경하면 새로운 주소값을 참조하게됨
		
		System.out.println("=== 생성자 방식 문자열 ===");
		System.out.println(System.identityHashCode(strObj));  // 664740647
		System.out.println(System.identityHashCode(strObj1)); // 804564176 ->생성자 방식은 같은 문자열도 다른 주소값
	
	}

	public void strMethod2() {
// 					문자열의 메소드
		String str = "문자열"; // 인덱스 0,1,2
		
	// charAt (문자열에서 문자 하나 골라내기)
		System.out.println(str.charAt(0));  // 문
		
	// concat (문자열 합치기)	
		System.out.println(str.concat(" 합치기")); // 문자열 합치기
	
	// contains (문자열 포함 여부)
		System.out.println(str.contains("자열")); // boolean으로 반환, true
	
	// equals (비교)
		System.out.println(str.equals("문자열")); // boolean으로 반환, true
	
	// length (문자열의 길이)
		System.out.println(str.length()); // int로 반환, 3
		
	// split (문자열 구분(특수기호)해서 String 배열로 만들어줌)
		String str1 = "API,String,살펴보기";
		String[] strArr = str1.split(","); // 배열로 반환
		
		// for문으로 확인
		for(int i=0; i<strArr.length;i++) {
			if(i != strArr.length - 1)
				System.out.print(strArr[i] + ","); // API String 살펴보기 
			else
				System.out.println(strArr[i]);
		}
	
		// for~each문 - 자료형 참조형 : 변수명 / 변수 하나하나를 지정한 자료형과 참조형으로 반환
		for(String arr : strArr) {
			System.out.print(arr + ","); // API,String,살펴보기,
		}
		System.out.println();
		
	// toUpperCase (대문자로 바꿔주는 메소드)
		String str2 = "string";
		System.out.println(str2.toUpperCase());
	
	// substring (잘라내기)
//		String str1 = "API,String,살펴보기";
		System.out.println(str1.substring(5,8)); // start index ~ end index -1 까지  tri
		
	// trim (공백 제거)
		String str3 = "       abc          ";
		System.out.println(str2.trim());   // string
	}
	
	public void sbMethod() {
		
	//	StringBuilder sb = new StringBuilder("스트링빌더"); // 5개의 문자열 생성
		StringBuffer sb = new StringBuffer("스트링버퍼"); // 큰 차이가 없다 (동기화를 안 하는 것 빼곤)
		
	// capacity() : 문자열의 공간	
		System.out.println(sb.capacity()); // 21
		
	// length() : 문자열의 길이
		System.out.println(sb.length());   // 5
		
		// 문자열의 공간을 지정해줄 수 있음 (12)
		StringBuilder sb1 = new StringBuilder(12);
		System.out.println(sb1.capacity()); // 12
	}

	public void sbMethod1() {
		StringBuilder sbd = new StringBuilder("안녕! ");
		System.out.println("sbd 기존 : " + sbd + ", 주소 : " + sbd.hashCode()); // 681842940
		System.out.println(System.identityHashCode(sbd));
		// hashCode메소드를 쓰는 거랑 똑같음 해쉬코드가 더 쉬우니까 해쉬코드 쓰삼
		
		// append : 기존 문자열에 문자열을 뒤에 추가
		sbd.append("난 StringBuilder야");
		System.out.println("sbd 추가 : " + sbd + ", 주소 : " + sbd.hashCode()); // 681842940
		// 문자열이 추가되었지만 주소값은 변하지 않음
		
		// 메소드 체이닝
		StringBuilder sb = new StringBuilder("난 ");
		sb.append("굶고 있어").append("~!");
		System.out.println(sb); // 난 굶고 있어~!
		System.out.println(sb.capacity()); // StringBuilder의 크기 >> 18 원래 16인데 난과 띄어쓰기 2글자를 입력했기때문에 2 늘어남
		System.out.println(sb.length()); // 길이 9
		
		// insert : 기존 문자열의 원하는 부분에 문자열 삽입
		sb.insert(2, "다이어트 하느라 ");
		System.out.println(sb);
		
		// delete : 저장된 문자열 부분 삭제
		sb.delete(0, 8); // end -1번까지
		System.out.println(sb);
		
		// reverse : 저장된 문자열 거꾸로
		sb.reverse();
		System.out.println(sb);
	}


	public void stMethod() {
		String str = "김용승, 20, 서울, 남";
		StringTokenizer st = new StringTokenizer(str, ","); // str을 ,로 구분해서 토큰을 만듦
		
		while(st.hasMoreTokens()) { // hasMoreTokens() : 다음 토큰이 있니? true/false
//			String str1 = st.nextToken(); // 토큰을 담으면 토큰이 사라져버림 -> 계속 사용할거면 다른 문자열에 토큰을 저장해야함
			System.out.println(st.nextToken()); 
//			System.out.println(str1);
		}
	}








}
