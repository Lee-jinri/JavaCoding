package Example;

import java.util.Objects;

public class Phone implements Cloneable {
	private String model; // �𵨸�
	private int price; // ���� (õ��)
	
	public Phone() {} // ����Ʈ ������

	public Phone(String mode, int price) { // �Ű������� �ִ� ������
		super();
		this.model = mode;
		this.price = price;
	}
 
	// ���Ϳ� ����
	public String getModel() {
		return model;
	}

	public void setMode(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// equals �������̵�
	@Override
	public boolean equals(Object obj) {
		if (this == obj)  // �ּҰ� ������
			return true;  // ���� ��ü
		if (obj == null)  // ���� ��ü�� ������
			return false; // false��
		if (getClass() != obj.getClass()) // getClass()�� ��ü�� Ŭ���� ���� >> ��ü�� ���� Ŭ������ ����?
			return false; // ��������� ��� �������
		Phone other = (Phone) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
	// �ؽ��ڵ� �������̵�
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}
	
	// toString �������̵�
	@Override
	public String toString() {
		return "��: " + model + ", ����: " + price;
	}
	
	// clone �������̵� (���� ����)
	// 1. ������ �̿��ϱ�
//	@Override
//	public Phone clone() { // Object Ŭ������ �ڽ�Ŭ������ ��ȯ������ ����� �� �ִ�.
//		return new Phone(this.model, this.price); // ��ü�� �����ϰ� ������ ��ü�� ���ο� ��ü�� ��´�.
//	}
	
	// 2. Object Ŭ������ clone �̿��ϱ�(����ó��, Cloneable �������̽� �����ؾ���)
	@Override
	public Phone clone() {
		Phone result = null; // result�� Phone��ü
		try {
			result = (Phone)super.clone(); // Object�� clone�� ���پ�.(�������̵��ϱ����� clone) ��ü�� Phone���� �ٲ�.
		}catch(CloneNotSupportedException e) { // Cloneable �������̽� ���� ������ �� ����ó��
			e.printStackTrace(); 
		}
		return result;
	}
}
