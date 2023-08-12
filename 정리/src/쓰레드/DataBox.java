package 쓰레드;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThreadr가 소비한 데이터 : " + returnValue);
		data = null;
		notify();
		return returnValue;
	
	}
	// synchronized : 메서드 동기화
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		this.data = data;
		System.out.println("ProducetThread가 생성한 데이터 : " + data);
		notify();
	}
}
