package arraylist;

public class OverridingTest1 {
	// calcPrice() �׽�Ʈ 252p

	public static void main(String[] args) {
		Customer ctLee = new Customer(2341, "�̾�");
		ctLee.bonusPoint = 49291;
		
		VIPCustomer ctPark = new VIPCustomer(777, "�ھ�", 001);
		ctPark.bonusPoint = 99999;
		
		System.out.println("==========================");
		
		int price = 10000;
		System.out.println(ctLee.getctName() + "�� �����ؾ� �� �ݾ��� " + ctLee.calcPrice(price) + "�Դϴ�.");
		System.out.println(ctPark.getctName() + "�� �����ؾ� �� �ݾ��� " + ctPark.calcPrice(price) + "�Դϴ�.");
	}

}
