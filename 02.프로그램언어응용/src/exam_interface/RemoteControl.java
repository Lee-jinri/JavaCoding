// new - interface
package exam_interface;

public interface RemoteControl {
	
	// ��� max, min ���� �Ұ�
	public static final int MAX_VOLUME = 32;  // �ִ� ����
	/*public static final �̰� ���� ����*/ int MIN_VOLUME = 0;	// �ּ� ����
	
	// �߻� �޼���
	public abstract void turnOn();	// ��ǰ�� ������ Ų��
	
	public abstract void turnOff();	// ��ǰ�� ������ ����
	
	/*public abstract void �̰� ���� ����*/ 
	void setVolume(int volume);   // ������ �����ϱ� ���� �޼ҵ�
	
}
