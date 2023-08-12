package Example01;

public class PhoneBookVersion1 {

	public static void main(String[] args) {
		
		PhoneInfo Book = new PhoneInfo("임미경" ,"010-2345-6573", "1975.03.28");
		PhoneInfo Book2 = new PhoneInfo("김현수","010-6435-1249");
		
		Book.showInfo();
		Book2.showInfo();
				

	}

}
