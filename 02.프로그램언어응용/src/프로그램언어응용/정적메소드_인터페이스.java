package ���α׷��������;

/* [���� �޼ҵ� ����]
 * public static ����Ÿ�� �޼����(�Ű�����,...){
 * 	...
 * }
 * 
 * static���� ����� �޼���� ���α׷� ���� �� �޸𸮿� ��� �غ� �Ϸ�ǹǷ� �ν��Ͻ� ������ ������� �ٷ� ����� �� �ִ�.
 * �������̽��� static �޼��带 �����ϴ� ������ 
 * �ش� �������̽��� �����ϰ� �ִ� ��� ��ü���� ���� ����ϴ� ������ ����� �����ϴµ� �ִ�.
 * 
 * interface TestA {
 * 		public static int getValue(){
 * 			return 123;
 * 		}
 *}
 * interface TestB {
 * 		public static int getValue(){
 * 			return 456;
 * 		}
 * }
 * 
 * class TestD implements TestA, TestB{
 * }
 * public class interfaceTest{
 * 		public static void main(String[] args){
 * 			 �̰Ŷ�
 * 			sysout(TestD.getValue());
 * 			�̰Ŵ� �ٸ� ��� �ٸ���...
 * 			sysout(TestA.getValue());
 * 			sysout(TestB.getValue());
 * 		}
 * }
 * 
 * 
 * private �޼ҵ� ����
 * -�ڹ� 9���� �߰��� �������̽��� ���ο� ���
 * private ����Ÿ�� �޼����(�Ű�����,...){
 * 		...
 * }
 * ���� �����ڸ� private���� �����Ѵٴ� �ǹ̴� �ܺο��� ������ �� ������ ���� ������ �����ϴ� ��
 * private �޼���� ������ �������̽��� ����� default �޼��忡���� ����� �������� ������ �����ϴ� �޼����̴�.
 * 
 * ex)
 * private void log(){
 * 		sysout("start log");
 * }
 * public default void setLogin(boolean login){
 * 		log();
 * }
 * 
 * ���� �������̽��� ������ static�޼��忡 private �޼��带 ����Ϸ��� static�� �����ؾ��Ѵ�.
 * ex)
 * private void log(){
 * 		sysout("start log");
 * }
 * public default void setLogin(boolean login){
 * 		log();
 * }
 * ���� �������̽��� ������ static�޼��忡�� private �޼��带 ����Ϸ��� static�� �����ؾ� �Ѵ�.
 * 
 * [�������̽��� Ȱ��]
 * �ϳ��� Ŭ������ ���� �ϳ��� Ŭ������ ��� ���� �� �ִ�.
 * ������ Ŭ������ ��Ӱ� ���ÿ� ���� ���� �������̽��� ������ �� �ִ�.
 * ���� �������̽��� �����ϱ� ���ؼ��� Ŭ���� ���ǽÿ� 
 * Ű���� implements ������ �޸�(,)�� �и��� �������̽� �̸��� ������ �ȴ�
 * 
 * class �ڽ�Ŭ���� extends �θ�Ŭ���� implements �������̽���1, �������̽���2 {...}
 * class Sub extends Super implements Interface1, Interface2 {
 * 		...
 * }
 * �θ�Ŭ������ ��ӹް� �������̽� 2���� ������ �� �ִ� Ŭ����. 
 * 
 * ex)
 * <�θ� Ŭ����>
 * class Shape{  // ������ ����� Ŭ����
 * 		protected int x,y;
 * }
 * 
 * <�������̽�>
 * interface Drawable { // ������ �� �ְ� ����� �������̽�
 * 		public abstract void draw();
 * }
 * 
 * <�θ�Ŭ������ ��ӹް� �������̽��� ������ �� �ִ� Ŭ����> �簢�� = ������
 * public class Rectangle extends Shape implements Drawable { // �簢���� ����� Ŭ����
 * 		int width, height;  
 * 		public void draw() {   // ������
 * 			sysout("�簢�� �׸���");
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
