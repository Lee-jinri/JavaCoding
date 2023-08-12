package kh.oop1.day01.exam;

public class ParkinManagement {
	
	// 주차관리 시스템을 만들 때 필요한 것들을 추상화 해보자.
	
	String carNum; 			// 차량번호
	String inTime; 			// 입차일시
	String outTime; 		// 출차일시
	String parkingTime;	 	// 주차시간
	int parkinFee; 			// 주차요금
	int discounts;			// 할인내역
	String carType;			// 차량구분(일반/등록)
	String carPicture;		// 차량사진
	String paymentType;		// 지불방법(현금/카드)
	
	
	// 기능구현 (주차요금정산)
	public void parkingPay(String parkingTime, int discounts) {
		System.out.println("주차요금정산 메소드");
	}
	
	
	
	
}
