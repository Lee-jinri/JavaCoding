package exam_interface;

public class Television implements RemoteControl {	// �����ϰڴ�- �������̽���
	
	// �ʵ� ����
	private int volume;
	private int channel;
	
	// ������
	@Override
	public void turnOn() {
		// ������ TV�� ������ �ѱ� ���� �ڵ� �ۼ�.
		System.out.println("TV �ѱ�");
	}
	@Override
	public void turnOff() {
		// ������ TV�� ������ ���� ���� �ڵ� �ۼ�.
		System.out.println("TV ����");
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
		System.out.println("���� ä�� ������ " + channel + "�� �Դϴ�.");
	}

	public String toString() {
		return "���� TV ���� : " + volume;
	}

}

