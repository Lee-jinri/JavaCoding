package exam_interface_Lendable;

public interface Lendable {
	
	// �޼���� ���� : �����Ѵ�, �ݳ��Ѵ�
	public abstract void checkOut(String borrower, String date); 
	/*public abstract*/ void checkIn();
}
