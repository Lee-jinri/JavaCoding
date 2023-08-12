package basic;

public class RemoveVar {

	// substring(0, 6) 인덱스 번호 0번부터 6번까지 반환, substring(7) 7번부터 끝까지 반환
	public static void main(String[] args) {
		String str = "990925-1012999";
		System.out.println(str.substring(0, 6) + str.substring(7));
		
	// toString()메소드는 문자열을 반환한다. delete메소드는 문자열을 삭제한다 (index6번부터, 인덱스 7번까지)	
		StringBuilder str2 = new StringBuilder("990925-1012999");
		System.out.println(str2.toString());
		str2.delete(6, 7);
		System.out.println(str2.toString());
		
	// replace메소드는 (시작인덱스, 끝인덱스, 바꿀문자) 시작 인덱스부터 끝 인덱스사이의 문자를 바꿀 문자로 변환해서 반환한다.	
		StringBuilder str3 = new StringBuilder("990925-1012999");
		str3.replace(6, 7, " ");
		System.out.println(str3.toString());
		
		

	}

}
