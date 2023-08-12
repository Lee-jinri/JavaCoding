package exam_interface3;

import exam_interface3.RemoteControl;

public interface AdvancedRemoteControl extends RemoteControl {
	
	// 이미 존재하는 인터페이스를 구현, 확장
	public void volumeUp();
	public void volumeDown();

}
