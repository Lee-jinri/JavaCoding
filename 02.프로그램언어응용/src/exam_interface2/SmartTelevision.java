package exam_interface2;

public class SmartTelevision implements RemoteControl, Searchable { // �θ�Ŭ���� 2��
	// ���� Ŭ����
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("SmartTelevision �ѱ�");
	}
	@Override
	public void turnOff() {
		System.out.println("SmartTelevision ����");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
	}
	
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
	
	public String toString() {
		return "���� TV ���� : " + volume;
	}
	
	
	
}
