package exam_interface_Lendable;

public class ex {
	// 이걸 uml이라고 한다.
	// -는 public(X) private(O)
	// 네모는 클래스 이름
	// 클래스 필드 메서드를 만들자
	
//	[이름] 대출가능 인터페이스(Lendable)								[이름] CD클래스 (CDInfo)	  
//	[기능] 1, 대출한다(checkOut(String borrowe, String date))		[데이터] 관리번호(registerNo)
//		  2, 반납한다(chekIn())											 타이틀 (title)
//		  ^									^					^				^
//		  │									│					│				│	
//		  │ 								│					│				│
//		  │									│					│				│
//		  │									│					│				│
//	[이름]단행본 클래스(SeparateVolume)		[이름]부록CD 클래스(AppCDinfo)			[이름]음악 CD 클래스(MusicCDinfo)
//	[데이터]								[데이터]								[데이터]
//	청구번호(requestNo)					관리번호(registerNo)					관리번호(resgisterNo)
//	제목(bookTitle)						타이틀(title)							타이틀(title)
//	저자(writer)							대출인(borrower)						아티스트(artist)
//	대출인(borrower)						대출일(checkOutDate)					곡명[](songTitle)
//	대출일(checkOutDate)					대출상태(state)
//	대출상태(state)
//	[기능]								[기능]
//	대출한다								대출한다
//	반납한다								반납한다
//
//
//
//	책이름(저자) 이(가) 대출되었습니다,
//	대출인 : 홍길동
//	대출일 : 20210801
//
//	책이름 이(가) 반납되었습니다.
//	
//	CD이름 CD가 대출되었습니다.
//	대출인 : 박박박
//	대출일 : 20210810
//	
//	Cd이름 CD가 반납되었습니다.









}
