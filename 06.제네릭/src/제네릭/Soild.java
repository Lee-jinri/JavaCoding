package ���׸�;

public class Soild {
	class Soild {}  // ��ü
	class Liquid{}  // ��ü
	
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
