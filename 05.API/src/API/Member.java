package API;

@SuppressWarnings("rawtypes")
public class Member implements Comparable {
	// Member Ŭ������ �̸�/�ּ�/���̸� �ʵ�� ������ �ִ�. ���̼����� �����ϰ����Ѵ�.
	
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
		// �� ��ü�� �ٸ� ��ü���� ũ�� 1, ������ 0 , ������ -1�� ��ȯ�Ѵ�.
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