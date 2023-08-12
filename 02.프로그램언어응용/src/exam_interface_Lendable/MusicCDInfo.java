package exam_interface_Lendable;

import java.util.Arrays;

// 음악 CD클래스
public class MusicCDInfo extends CDinfo {
	private String artist;
	private String[] songTitle;
	
	public MusicCDInfo(String registerNo, String title, String artist, String[] songTitle) {
		super(registerNo, title); // 부모클래스의 생성자 호출
		this.artist = artist;
		this.songTitle = songTitle;
	}
	
	public String songData() {
		String sTitle = "";
		for (String song : songTitle) { // for(자료형 변수명 : 배열명){}
			sTitle += (song + " ");
		}
		/* for(int i =0; i < songTitle.length; i++){
		 * 		sTitle += (songTitle[i] + " ");
		 */
		return sTitle;
	}
	
	public String toString() {
		// return artist + " " + getTitle() + "[ " + songDate() + " ]음반.";
		return artist + " - " + getTitle() + " " + Arrays.toString(songTitle) + " 음반."; 
												// 배열 그냥 songTitle으로 하면 배열의 주소값이 나옴
	}
	
	
	
	
}
