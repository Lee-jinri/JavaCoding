package 제네릭;

public class Soild {
	class Soild {}  // 고체
	class Liquid{}  // 액체
	
	class Book extends Soild{}
	class PncilCase extends Soild{}
	class Notebook extends Soild{}
	
	class Water extends Liquid{}
	class Coffee extends Liquid{}

}
class Nag <T extends Soild>{
	private T thing;
	public void Bag(T thing) {
		this.thing = thing;
	}
}
