package exam_inner_class;

// �ܺ�Ŭ����, ����Ŭ����
class OuterClass {
	private String famous;
	public OuterClass() {
		famous = "�� �� �ִٴ� ������ ������ ó������ �׷� �ɷ��� �������� �ᱹ���� �� �� �ִ� �ɷ��� ���� �ȴ�.- ����";
	}
	
	class InnerClass{
		private String wise;
		public InnerClass() {
			wise = "�����̶�� ���� �������� �������̶�� ��ġ�� �ʿ��ϴ�. -�� ���̽�";
		}
		public void innerMethod() {
			System.out.println("1."+wise);
			System.out.println("2."+famous);
		}
	}
}

public class OuterClassTest{
	public static void main(String args[]) {
		// �ܺ�Ŭ������ �ν��Ͻ��� ���������
		OuterClass outer = new OuterClass();
		// �ܺ� Ŭ������.���� Ŭ������ ���������� = �ܺ� Ŭ������ ��ü��.new ����Ŭ���� ������;
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.innerMethod();
	}
}