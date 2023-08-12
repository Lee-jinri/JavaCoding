package exam_interface;

public class Radio implements RemoteControl {
	
	private String standard;
	private double radioFrequency;
	private int volume;
	
	public Radio(String standard, double radioFrequency) {
		this.standard = standard;
		this.radioFrequency = radioFrequency;
	}
	
	// 재정의
	
	@Override
	public void turnOn() {
		System.out.println("radio 켜기");
	}
	@Override
	public void turnOff() {
		System.out.println("radio 끄기");
	}
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
	}
	
	public void printRF() {
		System.out.println("현재 주파수 선택은 " + standard +" "+ radioFrequency + "MHz 입니다.");
	}

	public String toString() {
		return "현재 radio 볼륨 : " + volume;
	}
	
}
