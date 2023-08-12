package Example01;

/* PhoneInfo Ŭ�������� �����͵��� ���ڿ� ���·� ���� ���� �ؾ��ϸ�, ����� �������� ����� �����ϵ��� �޼ҵ� �����Ѵ�
 * - �̸� name String
 * - ��ȭ��ȣ phoneNumber String
 * - ������� birthday String
 * 
 * �� ������� ������ �����Ҽ���, �������� �������� �ְ� �����ڸ� �����Ѵ�.
 * 
 * [���� ����]
 * name : �ӹ̰�
 * phone : 010-2345-6573
 * birth : 1975.03.28
 * 
 * name : ������
 * phone : 010-6435-1249
 */

public class PhoneInfo {

	private String name;
	private String phoneNumber;
	private String birthday;
	
	// ������ 1 : ��������� �������� �ʴ´�.
	public PhoneInfo(String name, String phoneNumber) {
		this(name, phoneNumber, null);
	}
	
	// ������ 2 : ��������� �����Ѵ�.
	public PhoneInfo(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	// Getter�� Setter�� ����Ͽ� ���� �����ϰ� �����ϰ� �Ѵ�.
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
	
	// ����� �� �ְ� �ϴ� �޼ҵ�
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);
		
		if (birthday != null) {
			System.out.println("birth : " + birthday);
		}
		
		System.out.println();
	}
	
}
