package ��Ʈ��;

import java.io.Serializable;

/*�̸�(name)�� ����(age)�� �ʵ�� ���� Person Ŭ������ �����Ѵ�. ������, ������, ������ ���� �����ϰ� ����ڷ� �Ͽ��� �����͸� �Է¹޾� 
 * �ν��Ͻ��� �����Ѵ�. �� �����͸� person.dat ���Ͽ� �����Ѵ�.
 * person.dat ���Ͽ� Person �����͸� ���� : output�޼��� ����
 * person.dat ���Ͽ��� �����ͷ� �о Person �����Ͽ� ��� : Input �޼��� ����
 * 
 */

// �ø��� ���� ���̵� ����Ʈ ���� ������ ������ ����. 
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
