package exam_interface_Lendable;

public interface Lendable {
	
	// 메서드로 설정 : 대출한다, 반납한다
	public abstract void checkOut(String borrower, String date); 
	/*public abstract*/ void checkIn();
}
