package basic;

public class Man {
	
	// 인스턴스 변수
	String name;
	
	// 생성자
	public Man(String name) {
		this.name = name; 
	}
	
	// 메소드
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
	
	/* BusinessMan이 Man을 상속받으면 name을 초기화해줘야한다.
	 * 
	 * 
	 */
}
