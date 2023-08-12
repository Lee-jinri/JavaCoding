package exam_interface_phone;

public interface Messenger {
	
	// 정적 + 상수로 표현 = 인터페이스이름.~~으로 접근
	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 104857600;
	
	public abstract String getMessage();
	
	public abstract void setMessage(String msg);
	
	public default void setLogin(boolean login) {
		log();
		if(login) {
			System.out.println("로그인 처리합니다.");
		}else {
			System.out.println("로그아웃 처리합니다.");
		}
	}
	
	public static void getConnection() {
		System.out.println("network에 연결합니다.");
	}
	
	private void log() {
		System.out.println("start job!");
	}
	
	
}
