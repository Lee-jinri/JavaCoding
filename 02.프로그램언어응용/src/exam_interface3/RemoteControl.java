// new - interface
package exam_interface3;

public interface RemoteControl {
	
	// ��� max, min ���� �Ұ�
	public static final int MAX_VOLUME = 32;  // �ִ� ����
	/*public static final �̰� ���� ����*/ int MIN_VOLUME = 0;	// �ּ� ����
	
	// �߻� �޼���
	public abstract void turnOn();	// ��ǰ�� ������ Ų��
	
	public abstract void turnOff();	// ��ǰ�� ������ ����
	
	/*public abstract void �̰� ���� ����*/ 
	void setVolume(int volume);   // ������ �����ϱ� ���� �޼ҵ�
	
	// ����Ʈ �޼���
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}

	// ���� �޼ҵ�
	public static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}








}
