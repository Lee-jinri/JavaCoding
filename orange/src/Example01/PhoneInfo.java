package Example01;

/* PhoneInfo 클래스에는 데이터들의 문자열 형태로 저장 가능 해야하며, 저장된 데이터의 출력이 가능하도록 메소드 정의한다
 * - 이름 name String
 * - 전화번호 phoneNumber String
 * - 생년월일 birthday String
 * 
 * 단 생년월일 정보는 저장할수도, 저장하지 않을수도 있게 생성자를 정의한다.
 * 
 * [실행 예시]
 * name : 임미경
 * phone : 010-2345-6573
 * birth : 1975.03.28
 * 
 * name : 김현수
 * phone : 010-6435-1249
 */

public class PhoneInfo {

	private String name;
	private String phoneNumber;
	private String birthday;
	
	// 생성자 1 : 생년월일을 저장하지 않는다.
	public PhoneInfo(String name, String phoneNumber) {
		this(name, phoneNumber, null);
	}
	
	// 생성자 2 : 생년월일을 저장한다.
	public PhoneInfo(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	// Getter와 Setter를 사용하여 값을 설정하고 접근하게 한다.
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNumber(){
		return name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void getBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	// 출력할 수 있게 하는 메소드
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);
		
		if (birthday != null) {
			System.out.println("birth : " + birthday);
		}
		
		System.out.println();
	}
	
}
