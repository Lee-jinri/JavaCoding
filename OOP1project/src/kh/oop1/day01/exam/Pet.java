package kh.oop1.day01.exam;

public class Pet {
	
	// ĸ��ȭ (set, get)
	
	// �ʵ� ����
	private String petType; // �ֿϵ����� ����
	private String petName; // ���� �̸�
	private int petAge;     // ���� ����

	
	// ������ : ���α׷��� ����� ��  ó������ ����Ǵ� �޼ҵ�
	public Pet() {}
	
	// �Ű������� �ִ� ������
	public Pet(String petType, String petName, int petAge) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
	}
	
	// runŬ�������� Pet�� ������ �� �� Pet�� private�̱� ������ ������(get) ������(set) �޼ҵ带 ����������.
	
	// getter
	
	// ���� ������ ���� ���� �������ִ� get
	public String getPetType() {
		return petType;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public int getPetAge() {
		return petAge;
	}
	
	// setter : ���� ������ �� petType�� �����ϰ� ��
	public void setPetType(String petType) {
		this.petType = petType;
	}
	
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}





}
