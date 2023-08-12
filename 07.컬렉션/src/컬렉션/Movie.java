package 컬렉션;

/* 영화 클래스를 정의한다.
 * Movie 클래스는 영화제목(mTitle), 평점(mGrade), 감독(mDirector), 개봉일(anYear)등의
 * 필드를 가진다. 영화의 모든 정보를 출력한다.
 */

public class Movie {

	private String mTitle; // 영화제목
	private String mGrade;
	private String mDirector;
	private String anYear;
	
	public Movie() {} // 생성자 1
	
	public Movie(String mTitle, String mGrade, String mDirector, String anYear) {
		// super();
		this.mTitle = mTitle;
		this.mGrade = mGrade;
		this.mDirector = mDirector;
		this.anYear = anYear;
	}
	
	public String getmTitle() {
		return mTitle;
	}
	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}
	
	public String getmGrade() {
		return mGrade;
	}
	public void setmGrade(String mGrade) {
		this.mGrade = mGrade;
	}
	
	
	public String getmDirector() {
		return mDirector;
	}
	public void setmDirector(String mDirector) {
		this.mDirector = mDirector;
	}
	
	
	public String anYear() {
		return anYear;
	}
	public void setanYear(String anYear) {
		this.anYear = anYear;
	}
	
	public String toString() {
		return String.format("[영화제목 : %s, 영화감동 %s, 개봉일 : %s , 평점 : %s]",
				mTitle,mDirector,anYear,mGrade);
	}
	
}
