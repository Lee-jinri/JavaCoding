package 예외2;

public class StringTest2 {

	public static void main(String[] args) {
		String ssn = "660606-1234561";
		/* 성별을 구하는 메서드 선언 및 호출. */
		System.out.println("당신의 성별 : %s\n" + getGender(ssn));

		/* 변수 fileName에 저장된 파일명(예: test.txt)에서 확장자 체크하여 이미지 파일(gif/jpg/png/jpeg)
		 * 외 나머지 확장자를 가진 파일인 경우 " 이미지 파일만 등록가능합니다"라는 메시지를 출력하도록 작성해 보세요.
		 * 파일 확장자를 체크하는 메서드 호출(fileExtcheck())*/
		 
		String fileName = "test.txt";
		System.out.println("파일명 : "+ fileName);
		// 메서드 호출로 제어.
	}
	
	public static String getGender(String ssn) {
		String g = ssn.substring(7,8); // 7번째 부터 8-1까지(7번째까지) = 1
		String gender = null;
		
		if(g.equals("1") || g.equals("3")){
			gender = "남자";
		}else if(g.equals("2") || g.equals("4")) {
			gender = "여자";
		}
		return gender;
	}
		

}
