package Ŭ����;

public class Movie {

	// �ʵ� ����
	
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
		System.out.println("��ȭ �̸�: " +name+ "\n�⿬ ���: " +actor+ "\n������: " 
	+date+ "\n�帣: " +genre);
	}

	public String toString() {
		return String.format("��ȭ �̸�: %s\n�⿬���: %s\n������: %s\n�帣: %s\n ",
							   name, actor, date, genre);
		
	}
}
