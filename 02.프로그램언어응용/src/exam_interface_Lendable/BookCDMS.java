package exam_interface_Lendable;

public class BookCDMS {

	public static void main(String[] args) {
		SeparateVolume sv = new SeparateVolume("863441","������ ��Ź��","�Ű��");
		sv.checkOut("ȫ�浿", "20220125");
		sv.checkIn();

		AppCDinfo app = new AppCDinfo("2005-7001", "Redahat Fedora");
		app.checkOut("������", "20220125");
		app.checkIn();
	
//		String[] songTitle = {"���","û��","�� ���"};
//		MusicCDInfo music = new MusicCDInfo("1","����","�赿��",songTitle);
		MusicCDInfo music = new MusicCDInfo("1","����","�赿��", new String[] {"���","û��","�� ���"});
		 System.out.println(music.toString());
	}

}
