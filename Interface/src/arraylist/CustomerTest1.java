package arraylist;

public class CustomerTest1 {
	// »ó¼Ó Å¬·¡½º Å×½ºÆ® 239p
	public static void main(String[] args) {
		Customer ctLee = new Customer(1001, "ÀÌ¾¾");
//		ctLee.setctID(1001);
//		ctLee.setctName("ÀÌ¾¾");
		ctLee.bonusPoint = 1000;
		System.out.println(ctLee.showCustomerInfo());
		System.out.println("=====================");
		
		Customer ctPark = new Customer(1002, "¹Ú¾¾");
//		ctPark.setctID(1002);
//		ctPark.setctName("¹Ú¾¾");
		ctPark.bonusPoint = 10000;
		System.out.println(ctPark.showCustomerInfo());
		System.out.println("=====================");

		VIPCustomer ctKim = new VIPCustomer(1003, "±è¾¾", 0001);
//		ctKim.setctID(1003);
//		ctKim.setctName("±è¾¾");
		ctKim.bonusPoint = 99999;
		System.out.println(ctKim.showCustomerInfo());
		System.out.println("=====================");
		
	}

}
