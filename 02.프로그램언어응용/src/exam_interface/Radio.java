package exam_interface;

public class Radio implements RemoteControl {
	
	private String standard;
	private double radioFrequency;
	private int volume;
	
	public Radio(String standard, double radioFrequency) {
		this.standard = standard;
		this.radioFrequency = radioFrequency;
	}
	
	// ������
	
	@Override
	public void turnOn() {
		System.out.println("radio �ѱ�");
	}
	@Override
	public void turnOff() {
		System.out.println("radio ����");
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
		System.out.println("���� ���ļ� ������ " + standard +" "+ radioFrequency + "MHz �Դϴ�.");
	}

	public String toString() {
		return "���� radio ���� : " + volume;
	}
	
}
