package arraylist;

public class OverridingTest2 {

	public static void main(String[] args) {
		// Ŭ���� �� ��ȯ�� ������ �޼��� ȣ�� 253p
		Customer vc  = new VIPCustomer(9292, "�Ḹ��", 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getctName() + " ���� �����ؾ� �� �ݾ�" + vc.calcPrice(10000) + "�Դϴ�.");
	}
	

}
