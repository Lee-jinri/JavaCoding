package exam_interface;

public class Television implements RemoteControl {	// 구현하겠다- 인터페이스명
	
	// 필드 생성
	private int volume;
	private int channel;
	
	// 재정의
	@Override
	public void turnOn() {
		// 실제로 TV의 전원을 켜기 위한 코드 작성.
		System.out.println("TV 켜기");
	}
	@Override
	public void turnOff() {
		// 실제로 TV의 전원을 끄기 위한 코드 작성.
		System.out.println("TV 끄기");
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
	
	public void printChanner() {
		System.out.println("현재 채널 선택은 " + channel + "번 입니다.");
	}

	public String toString() {
		return "현재 TV 볼륨 : " + volume;
	}

}

