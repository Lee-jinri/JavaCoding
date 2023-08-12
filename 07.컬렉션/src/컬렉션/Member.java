package �÷���;

public class Member {
	private String name;
	private int age;

	// �ν��Ͻ��� ������� �� �ʵ� �ʱ�ȭ
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
// equals�� Object�� ������ �ؾ� �ּҰ��� �ƴ϶� ���ڰ����� ������ �ٸ��� �Ǵ��� �Ѵ�
// ���̰� ������ ���� ��ü�� �Ǵ�
//	@Override
//	public boolean equals(Object obj) { // �θ�Ŭ���� �������� = ����Ŭ������ �ּҰ� -> ��ĳ����
//		if(obj instanceof Member) {
//			Member member = (Member) obj; // (����Ŭ����)�θ�Ŭ����Ÿ�� �������� -> �ٿ�ĳ����
//			if(this.age == member.age) {  // �ּҰ��� ���Ͽ� ������ �ٸ��� �Ǵ��Ѵ�
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		return age;
//	}
	
	
	
// �ּҰ��� �ƴ϶� ���� ���ڸ� ���Ͽ� ������ �����ϵ��� �޼ҵ� ������
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member member = (Member)obj;
//			if(name.equals(member.name))  // String�� �ּҰ��� �� �ٸ��⶧���� String ���� �� equals~~
//				return true;
//		}
//		return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		return name.hashCode();
//	}
	
	
	// �̸��� ���̰� ������ �ѹ��� Ȯ���ϵ��� �޼ҵ� ������
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age); // �̸��� ���� �� �� ������ true
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	
	// ��� �޼ҵ� ������
	@Override
	public String toString() {
		return String.format("member - (�̸�:%s,����:%s)",name,age );
	}
}

