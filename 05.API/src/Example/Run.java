package Example;

public class Run {

	public static void main(String[] args) {
		StringController sc = new StringController(); 
		
			// 1. String���� �����ϱ�
//			sc.strMethod1();
			
			// 2. String ���� ��ǥ�� �޼ҵ��
//			sc.strMethod2();

			// 3. StringBuilder�� �����ϱ�
//			sc.sbMethod();
			
			// 4. StringBuilder�� �ּҰ�, �޼ҵ� Ȯ���ϱ�
//			sc.sbMethod1();
			
			// 5. StringTokenizer
//			sc.stMethod();
			
		Phone p1 = new Phone("KH Note 9", 800);
		Phone p2 = new Phone("KH hal 10", 600);
		Phone p3 = new Phone("KH Note 9", 800);
		
		// 6. equals, hashCode
		
//		System.out.println(p1.equals(p2));
//		System.out.println(p1.equals(p3)); 
		// equals�� ���� �������� �񱳸� �ϰ� �ʹٸ� equals �޼ҵ带 �������̵��ؼ� ����ؾ��Ѵ�.
		
		// �ּ� ��
//		System.out.println(System.identityHashCode(p1)); // 1392838282
//		System.out.println(System.identityHashCode(p3)); // 523429237 
		
		// hashCode �޼ҵ带 ���� ������ �ؽ��ڵ尡 ������ �������̵� �� ��
//		System.out.println(p1.hashCode()); // 587860179
//		System.out.println(p3.hashCode()); // 587860179

		// toString : �׳� p1�̶�� �ᵵ toString�� �ڵ����� ��ȯ��
//		System.out.println(p1.toString());
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
		
		// clone()
//		System.out.println("==============clone==============");
//		p2 = p1.clone();        // p2�� p1�� ��ü�� new�����ڸ� ���� ���� ������ ��ü�� ��.
//		System.out.println(p1);
//		System.out.println(p2); // p1�� p2�� ���� ���� ��ü�� ���Ե�.

	
		WrapperController wc = new WrapperController();
		// 1. Boxing, UnBoxing
//		wc.wrapMethod();
		
		// 2. String -> �⺻�ڷ���(����, Primitive Number)
		wc.strToPrim();
		
		// 3. �⺻�ڷ���(����, Primitive Number) -> String
		wc.PrimToStr();
		
	
	
	
	
	
	
	
	
	
	}

}
