package exam_interface_Lendable;

public class BookCDMS {

	public static void main(String[] args) {
		SeparateVolume sv = new SeparateVolume("863441","¾ö¸¶¸¦ ºÎÅ¹ÇØ","½Å°æ¼÷");
		sv.checkOut("È«±æµ¿", "20220125");
		sv.checkIn();

		AppCDinfo app = new AppCDinfo("2005-7001", "Redahat Fedora");
		app.checkOut("¹ÚÈñÁø", "20220125");
		app.checkIn();
	
//		String[] songTitle = {"°í¹é","Ã»Ãá","³» »ç¶÷"};
//		MusicCDInfo music = new MusicCDInfo("1","µ¿Çà","±èµ¿·ü",songTitle);
		MusicCDInfo music = new MusicCDInfo("1","µ¿Çà","±èµ¿·ü", new String[] {"°í¹é","Ã»Ãá","³» »ç¶÷"});
		 System.out.println(music.toString());
	}

}
