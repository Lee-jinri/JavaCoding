package �÷���;

/* ��ȭ Ŭ������ �����Ѵ�.
 * Movie Ŭ������ ��ȭ����(mTitle), ����(mGrade), ����(mDirector), ������(anYear)����
 * �ʵ带 ������. ��ȭ�� ��� ������ ����Ѵ�.
 */

public class Movie {

	private String mTitle; // ��ȭ����
	private String mGrade;
	private String mDirector;
	private String anYear;
	
	public Movie() {} // ������ 1
	
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
		return String.format("[��ȭ���� : %s, ��ȭ���� %s, ������ : %s , ���� : %s]",
				mTitle,mDirector,anYear,mGrade);
	}
	
}
