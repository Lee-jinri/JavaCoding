package kh.oop1.day01.exam;

public class Pet {
	
	// 캡슐화 (set, get)
	
	// 필드 변수
	private String petType; // 애완동물의 종류
	private String petName; // 펫의 이름
	private int petAge;     // 펫의 나이

	
	// 생성자 : 프로그램이 실행될 때  처음으로 실행되는 메소드
	public Pet() {}
	
	// 매개변수가 있는 생성자
	public Pet(String petType, String petName, int petAge) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
	}
	
	// run클래스에서 Pet에 접근을 할 때 Pet은 private이기 때문에 접근자(get) 설정자(set) 메소드를 만들어줘야함.
	
	// getter
	
	// 펫의 종류에 대한 값을 가져와주는 get
	public String getPetType() {
		return petType;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public int getPetAge() {
		return petAge;
	}
	
	// setter : 값을 변경할 때 petType을 변경하게 됨
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
