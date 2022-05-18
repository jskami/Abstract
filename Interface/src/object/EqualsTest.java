package object;

// 358p. ObjectŬ������ equals()�޼��� ����ϱ�

class Student {
	int stId;
	String stName;

	public Student(int stId, String stName) {
		this.stId = stId;
		this.stName = stName;
	}
	
	public String toString() {
		return stId + ", " + stName;
	}
}
public class EqualsTest {

	public static void main(String[] args) {
	Student stDoh = new Student(100, "������");
	Student stDoh2 = stDoh;	// �ּ� ����
	Student stLong = new Student(100, "������"); // ���ǻ� ������3�̶�� �ϰ���
	
	// ������ �ּ�(������ ��ü)�� �� �ν��Ͻ� ��======================
	System.out.println("== ��ȣ�� ��");
	if(stDoh == stDoh2)
		System.out.println("�ܵ����̿� ������2�� �ּҰ� ����.");
	else
		System.out.println("�ܵ����̿� ������2�� �ּҰ� �ٸ���.");
	
	System.out.println("equals()�� ��");
	if(stDoh.equals(stDoh2))
		System.out.println("�ܵ����̿� ������2�� �����ϴ�.");
	else
		System.out.println("�ܵ����̿� ������2�� �������� �ʴ�.");
	//=======================================================
	System.out.println("++++++++++++++++++++++++++++");
	// ������������ �ν��Ͻ��� �ּҰ� �ٸ� ��� ��=====================
	System.out.println("== ��ȣ�� ��");
	if(stDoh == stLong)
		System.out.println("�ܵ����̿� ������3�� �ּҰ� ����.");
	else
		System.out.println("�ܵ����̿� ������3�� �ּҰ� �ٸ���.");
	
	System.out.println("equals()�� ��");
	if(stDoh.equals(stLong))
		System.out.println("�ܵ����̿� ������3�� �����ϴ�.");
	else
		System.out.println("�ܵ����̿� ������3�� �������� �ʴ�.");
		
	}	
}
