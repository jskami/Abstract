package arraylist;

import java.util.ArrayList;

public class CustomerTest2 {

	public static void main(String[] args) {
		// ���� Ŭ���� ���� 242p
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer ct1 = new Customer(01, "��ī��");
		Customer ct2 = new Customer(02, "���̸�");
		Customer ct3 = new GoldCustomer(03, "���α�");
		Customer ct4 = new GoldCustomer(04, "�̻��ؾ�");
		Customer ct5 = new VIPCustomer(05, "����", 0044);
		
		// ArrayList�� add �Ӽ����� ��ü �迭�� �� �߰�
		customerList.add(ct1);
		customerList.add(ct2);
		customerList.add(ct3);
		customerList.add(ct4);
		customerList.add(ct5);

		int pricee = 10000;
		// ������ ����
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(pricee);
			System.out.println(customer.getctName() + "���� " + cost + "�� ��������" );
			System.out.println(customer.getctName() + "���� ���� BP�� " + customer.bonusPoint + "�Դϴ�.");
		}
		
		System.out.println("==============================================");
		//========================================================
		Customer ctY = new Customer(1009, "�羾");
//		ctY.setctName("�羾");
//		ctY.setctID(1009);
		ctY.bonusPoint = 1000;
		System.out.println(ctY.showCustomerInfo());

		System.out.println("======================");
		
		VIPCustomer ctK = new VIPCustomer(0101, "K��", 0014);
		System.out.println(ctK.showCustomerInfo());
		
		System.out.println("======================");

		VIPCustomer ctD = new VIPCustomer(0011, "D��", 0210);
		System.out.println(ctD.showCustomerInfo());
	
		System.out.println("======================");

		// �������� ���� ������ 264p
		Customer ctS = new VIPCustomer(1010, "S��", 0321);
		ctS.bonusPoint = 777;
		
		System.out.println(ctS.showCustomerInfo());
		System.out.println("======== ������, ���ʽ� ����Ʈ ���=======");
		
		int price = 10000;
		int Sprice = ctS.calcPrice(price);
		int Yprice = ctY.calcPrice(price);
		
		System.out.println(ctY.getctName() + " ���� " + Yprice + "�� �����ϼ̽��ϴ�.");
		System.out.println(ctY.showCustomerInfo());
		
		System.out.println(ctS.getctName() + " ���� " + Sprice + "�� �����ϼ̽��ϴ�.");
		System.out.println(ctS.showCustomerInfo());
		
	}
}
