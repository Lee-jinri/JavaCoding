package ����;

public class classExampld {
	class Score{
		
		/* �̸��� �� ������ ������ �̿��ؼ� Ŭ������ �ۼ��غ���.
		 *  �̸� |  ����  |  ����  |  ����  |
		 * ȫ�浿|   90  |  100  |   95  |
		 * ��ö��|   90  |   80  |   95  |
		 */
		
		// �ʵ�
		public String name;   
		public int kor;
		public int eng;
		public int mat;
		
		// �޼ҵ�
		public void printData() {
			System.out.println(name + " " + kor + " " + eng + " " + mat);
		}
	}
	class Car{
		// �ʵ� ����	
		public int speed;  		 // �ӵ�
		public int gear;  		 // ��� �ܼ�
		public String color; 	 // ����
		
		// �޼ҵ� ����
		public void speedUp() {    // �ӵ� ���� �޼ҵ�
			speed += 10; }
		public void speedDown(){   // �ӵ� ���� �޼ҵ�
			speed -= 10; }
		public void printDate(){
			System.out.println("�ӵ� : " + speed + " ��� : "+gear + " ���� : "+ color);
		}
		
		public String toString() {
			return ("�ӵ� : " + speed + " ��� : "+gear + " ���� : "+ color);
		}
	
	
	}
}