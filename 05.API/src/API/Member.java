package API;

@SuppressWarnings("rawtypes")
public class Member implements Comparable {
	// Member 클래스는 이름/주소/나이를 필드로 가지고 있다. 나이순으로 정렬하고자한다.
	
	private String name;
	private String address;
	private int age;
	
	public Member(String name,String addrees, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object obj) {
		Member m = (Member)obj;
		// 이 객체가 다른 객체보다 크면 1, 같으면 0 , 적으면 -1을 반환한다.
		if (this.age > m.age)
			return 1;
		else if (this.age < m.age)
			return -1;
		else
			return 0;
		// return name.compareTo(m.name);
	}
	
	@Override
	public String toString() {
		return String.format("name=%s address=%s age=%d\n", name, address, age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}