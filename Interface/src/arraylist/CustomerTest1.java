package arraylist;

public class CustomerTest1 {
	// ��� Ŭ���� �׽�Ʈ 239p
	public static void main(String[] args) {
		Customer ctLee = new Customer(1001, "�̾�");
//		ctLee.setctID(1001);
//		ctLee.setctName("�̾�");
		ctLee.bonusPoint = 1000;
		System.out.println(ctLee.showCustomerInfo());
		System.out.println("=====================");
		
		Customer ctPark = new Customer(1002, "�ھ�");
//		ctPark.setctID(1002);
//		ctPark.setctName("�ھ�");
		ctPark.bonusPoint = 10000;
		System.out.println(ctPark.showCustomerInfo());
		System.out.println("=====================");

		VIPCustomer ctKim = new VIPCustomer(1003, "�达", 0001);
//		ctKim.setctID(1003);
//		ctKim.setctName("�达");
		ctKim.bonusPoint = 99999;
		System.out.println(ctKim.showCustomerInfo());
		System.out.println("=====================");
		
	}

}
