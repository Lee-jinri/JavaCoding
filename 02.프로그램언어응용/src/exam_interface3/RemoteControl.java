// new - interface
package exam_interface3;

public interface RemoteControl {
	
	// 상수 max, min 변경 불가
	public static final int MAX_VOLUME = 32;  // 최대 볼륨
	/*public static final 이거 생략 가능*/ int MIN_VOLUME = 0;	// 최소 볼륨
	
	// 추상 메서드
	public abstract void turnOn();	// 제품의 전원을 킨다
	
	public abstract void turnOff();	// 제품의 전원을 끈다
	
	/*public abstract void 이거 생략 가능*/ 
	void setVolume(int volume);   // 볼룸을 조절하기 위한 메소드
	
	// 디폴트 메서드
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}

	// 정적 메소드
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}








}
