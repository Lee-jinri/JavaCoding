package 예제;

/* 실행방법
 * Run -> Run Configurations에서 Arguments를 선택
 * Program arguments에 값을 입력하고 Run을 클릭한다.
 */

public class argument {

	public static void main(String[] args) {
		
		
		if (args.length == 0) {
			System.out.println("실행시 사용자명을 입력해주셔야합니다.");
			System.exit(0);
		}
		
		System.out.println("안녕하세요." + args[0] + "님!");
		
		

	}

}
