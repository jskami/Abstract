package arraylist;

public class OverridingTest3 {

	public static void main(String[] args) {
		// Ŭ�������� ����Ͽ� ���� �ݾ� ����ϱ� 257p
		int price = 10000;
		
		// customer �ν��Ͻ� ����
		Customer ctLee = new Customer(1001, "�̾�");
		System.out.println(ctLee.getctName() + " ���� �����ؾ� �� �ݾ��� " + ctLee.calcPrice(price) + "�� �Դϴ�.");
		
		System.out.println("=========================");
		
		// vipcustomer �ν��Ͻ� ����
		VIPCustomer ctPark = new VIPCustomer(1002, "�ھ�", 001);
		System.out.println(ctPark.getctName() + " ���� �����ؾ� �� �ݾ��� " + ctPark.calcPrice(price) + "�� �Դϴ�.");
		
		System.out.println("=========================");
		
		// vipcustomer �ν��Ͻ��� customer������ ��ȯ
		Customer ctJam = new VIPCustomer(1003, "�Ḹ��", 002);
		System.out.println(ctJam.getctName() + " ���� �����ؾ� �� �ݾ��� " + ctJam.calcPrice(price) + "�� �Դϴ�.");
		// ����޼��� ��Ŀ� ���� vip�� �ν��Ͻ� �޼��尡 ȣ��Ǿ���.
		
		
		
	}

}
