package ����;


public class Example {
	public static void main (String[] args) {
		try{
		     int[] arr = new int[-10];     
		     System.out.println("try");
		} catch(NumberFormatException e){
		     System.out.println("���� ���� ����");
		} catch (NegativeArraySizeException e){
		     System.out.println("�迭 ũ�� ���� ����");
		} catch (Exception e){
		     System.out.println("����");
		} finally{
		     System.out.println("ó�� ��");
		}
	}
}
