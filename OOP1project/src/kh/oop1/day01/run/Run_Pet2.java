package kh.oop1.day01.run;

import kh.oop1.day01.exam.Pet;

public class Run_Pet2 {
	public static void main(String[] args) {

		// ÀÎ½ºÅÏ½ºÈ­ (°´Ã¼¸¦ ¸¸µê)
		Pet p1 = new Pet("½ÃÃò", "¹¶ÀÌ", 5);
		Pet p2 = new Pet("Çªµé", "Çª´Ï", 2);
		Pet p3 = new Pet("Áøµ¾°³", "Àå±ºÀÌ", 8);

		System.out.println("Æê Á¾·ù : " + p1.getPetType() + ", Æê ÀÌ¸§ : " + p1.getPetName() + ", Æê ³ªÀÌ : " + p1.getPetAge());
		System.out.println("Æê Á¾·ù : " + p2.getPetType() + ", Æê ÀÌ¸§ : " + p2.getPetName() + ", Æê ³ªÀÌ : " + p2.getPetAge());
		System.out.println("Æê Á¾·ù : " + p3.getPetType() + ", Æê ÀÌ¸§ : " + p3.getPetName() + ", Æê ³ªÀÌ : " + p3.getPetAge());

	}

}
