package 스트림;

import java.io.Serializable;

/*이름(name)과 나이(age)를 필드로 가진 Person 클래스를 생성한다. 생성자, 설정자, 접근자 등을 생성하고 사용자로 하여금 데이터를 입력받아 
 * 인스턴스를 생성한다. 그 데이터를 person.dat 파일에 저장한다.
 * person.dat 파일에 Person 데이터를 저장 : output메서드 생성
 * person.dat 파일에서 데이터로 읽어서 Person 복원하여 출력 : Input 메서드 생성
 * 
 */

// 시리얼 버전 아이디를 임포트 하지 않으면 오류가 난다. 
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person ]name=" + name + ", age=" + age +"]";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
