package arraylist;

public class VIPCustomer extends Customer {
	// �� Ŭ������ ��������� ���� -> ���߿� ��ӹ޾Ƽ� ���� �ʿ����
//	private int ctID;
//	private String ctName;
//	private String ctGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	// vip �� ���� ��� �������� �ʿ��� �������
	private int agentID;
	double saleRatio;
	
	// vip ����Ʈ ������
//	public VIPCustomer() {
//		ctGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		System.out.println("VIPCustomer() ������ ȣ��");
//	}
	
	// ����Ʈ �����ڸ� ����Ͽ� ȣ���ϱ� 245p + vip�Ű����� �ϳ� �߰�
	public VIPCustomer(int ctID, String ctName, int agentID) {	// ���� Ŭ������ �������� ���� ����
		super(ctID, ctName);	// �����Ϸ��� �ڵ����� �߰��ϴ� �ڵ�. ���� Ŭ������ Customer()�� ȣ��ȴ�. ���� Ŭ������ ������ ȣ��
		ctGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
//		System.out.println("VIPCustomer(int, String, int) ������ ȣ��");
	}
	
	
//	@Override	// ���� Ŭ������ calcPrice�޼��带 ��ӹ޾����� vip�� �ش��ϴ� ����� �����Ƿ� �������̵��� ���� ��ӹ��� �޼��带 �� ���� �Ͽ���.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);	// ������ ����
	}
	
	// vip���Ը� �ʿ��� �޼���
	public int getAgentID() {
		return agentID;
	}
	
//	public String showCustomerInfo() {
//		return ctName + " ���� ����� " + ctGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
//	}
	
//	public String showVIPInfo() {
//		return super.showCustomerInfo() + "��� ���� ID�� " + agentID + "�Դϴ�.";
//	}
	
	// �� ���� ��� �޼��� ������ 263p
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "��� ���� ID�� " + agentID + "�Դϴ�.";
	}
	
	
}
