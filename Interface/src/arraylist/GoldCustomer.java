package arraylist;

// ��� ��� �� �߰� 267p
/* ������ 10%, ���ʽ� ����Ʈ 2% ����, ��� ���� ����*/
public class GoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer(int ctID, String ctName) {
		super(ctID, ctName);
		ctGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	// ������ �� �޼���
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
