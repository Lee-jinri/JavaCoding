package basic;

/* ������ ����ϴ� Score Ŭ������ ��������
 * �̸�/ ����/ ����/ ����/ ������ �����Ѵ� (�ʵ�)
 * �ʵ忡 ���� ������ �� �ִ� ���, �������� ��,���,������ ���ϴ� ���
 * ��� �ʵ带 ����� �� �ִ� ����� �����ϵ��� �Ѵ�(�޼���)
 * ����ڿ��� �̸��� ������ �Է¹޾� ������ ��հ� ������ ����ϵ��� �Ѵ�.
 * [���� ���� ���]
 * ==================================
 * �̸� ���� ���� ���� ���� ��� ����
 * ==================================
 * ȫ�浿 90 75 61 226 75.3 C
 * ��ö�� 55 56 46 157 52.3 F
 * ������ 90 90 90 270 90.0 A
 */
public class Score {
	// �ʵ� ����
	public String name;
	public int kor;
	public int eng;
	public int math;
	public int total;
	
	// �޼��� ����
	
	// 1. �ʵ忡 ���� ������ �� �ִ� ���
	public void scoreData(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
	
	// 2. ���� ���ϴ� �޼ҵ� 
	public void getTotal() {
		total = kor + eng + math;
	}
	
	// 3. ����� ���ϴ� �޼ҵ�
	public double getAverage() {
		return (double)total/3;
	}
	
	// 4. ������ ���ϴ� �޼ҵ�
	public char getGrade() {
		char hakjum = '\0';  // null�� �ǹ�
		double avg = getAverage();
	
		if(avg >= 90) {
			hakjum = 'A';
		}else if(avg >= 80) {
			hakjum = 'B';
		}else if(avg >= 70) {
			hakjum = 'C';
		}else if(avg >= 60) {
			hakjum = 'D';
		}else 
			hakjum = 'F';
		return hakjum;
	}
	
	
	public String toString() {
		return String.format("%s\t%d\t%d\t%d\t%d\t%.1f\t%c", name,kor,eng,math,total,getAverage(),getGrade());
	}

}
