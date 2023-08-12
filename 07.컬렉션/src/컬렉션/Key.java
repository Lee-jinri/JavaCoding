package �÷���;

public class Key {
	private int number;
	
	// �ν��Ͻ��� ������� �� �ʵ� �ʱ�ȭ
	public Key(int number) {
		this.number = number;
	}
	
	// �������
	// equals�� Object�� ������ �ؾ� �ּҰ��� �ƴ϶� ���ڰ����� ������ �ٸ��� �Ǵ��� �Ѵ�
	@Override
	public boolean equals(Object obj) { // �θ�Ŭ���� �������� = ����Ŭ������ �ּҰ� -> ��ĳ����
		if(obj instanceof Key) {
			Key compareKey = (Key) obj; // (����Ŭ����)�θ�Ŭ����Ÿ�� �������� -> �ٿ�ĳ����
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return number;
	}
	
	// �������
	
	
	@Override
	public String toString() {
		return "number : " + number;
	}
}
