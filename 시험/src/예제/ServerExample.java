package ����;

import java.io.BufferedReader;
import java.io.BufferedWriter;

/*TCP ������ ����Ͽ� Ŭ���̾�Ʈ�� ����(9999)�� �����Ͽ� �����͸� �ְ� ���������Ѵ�.
 * ������ Ŭ���̾�Ʈ���� "���� �츮�� ������ ���� �䱸���� �ʴ´�. �츮�� ����� ���� �䱸�� ���̴�."��� �����͸� �����Ͽ� 
 * Ŭ���̾�Ʈ�� �����κ��� ���޹��� �����͸� ����ϸ� �ǰ� Ŭ���̾�Ʈ�� �ٽ� �������� 
 * "�츮�� �� �� �ֱ� ���� ������ϴ� �ϵ���, �츮�� �ϸ鼭 ����."
 * ��µ����͸� �����Ͽ� ������ ���޹޾� ����ϸ� �ȴ�.
 * SeverExampleŬ������ ClientExampleŬ���� ����*/

/*TCP ������ Ŭ���̾�Ʈ
 * Ŭ���̾�Ʈ�� ��û�ϸ� ������ �����Ѵ�.
 * Ŭ���̾�Ʈ�� ������ ����Ϸ��� ������ �ּ�(IP�ּ�)�� �˾ƾ��Ѵ�.
 * ���� ����, ����
 */
class ServerExample {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocker llistener = null;
		Socker socker = null;
		
		try {
			listener = new SeverSocker(9999); // ���� ���� ����
			System.out.println("������ ��ٸ��� �ֽ��ϴ�.");
			
			socker = listener.accept(); // Ŭ���̾�Ʈ�� ���� ���� ��û
		}
	}
	
}