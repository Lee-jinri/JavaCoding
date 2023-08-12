package ÄÃ·º¼Ç2;

public class Member implements Comparable<Member>{
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(this.name) && (member.age == age);
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age; // "È«±æµ¿" -> 123+30  "È«±æµ¿" -> 123+30
	}
	
	@Override
	public String toString() {
		return String.format("member = (name: %s, age : %d) " , name,age);
	}
	
	@Override
	public int compareTo(Member o) {
		if (this.age > o.age)
			return 1;
		else if (this.age == o.age)
			return 0;
		else
			return -1;
		// return this.name.compareTo(o.name);
	}

	
}
