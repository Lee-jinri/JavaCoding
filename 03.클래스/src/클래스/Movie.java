package 클래스;

public class Movie {

	// 필드 정의
	
	public String name;
	public String actor;
	public String date;
	public String genre;
	
	public void movieData(String name, String actor, String date, String genre){
		this.name = name;
		this.actor = actor;
		this.date = date;
		this.genre = genre;
		}
	
	public void display() {
		System.out.println("영화 이름: " +name+ "\n출연 배우: " +actor+ "\n개봉일: " 
	+date+ "\n장르: " +genre);
	}

	public String toString() {
		return String.format("영화 이름: %s\n출연배우: %s\n개봉일: %s\n장르: %s\n ",
							   name, actor, date, genre);
		
	}
}
