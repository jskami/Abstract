package interfaceEx;

public class CustomerTest {
	public static void main(String[] args) {
		Customer ct = new Customer();
		
		/* Customer Ŭ�������� ct�� Buy �������̽����� buyer�� �����ؼ� ����ȯ �Ͽ���.
		 * buyer�� Buy �������̽��� �޼��常 ȣ�� �����ϴ�. */
		Buy buyer = ct;
		buyer.buy();
		
		// ���� ����
		Sell seller = ct;
		seller.sell();
		
		if(seller instanceof Customer) {
			Customer ct2 = (Customer)seller;	// seller�� ���� Ŭ�������� Customer�� �ٽ� ����ȯ ��
		
		ct2.buy();
		ct2.sell();
		/* ���������� �������̽��� �޼���� �������̽��� �ν��Ͻ��� ȣ���� �����ߴµ�, 
		 * Ŭ���������� �� ��ȯ�� �ν��Ͻ����� �������̽��� �޼��带 ȣ�� �� �� �ְ� �Ǿ���? */
		
		}
	}
}
