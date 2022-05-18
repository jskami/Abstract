package arraylist;

// �� Ŭ���� ���� 234p
public class Customer {
	// �� ��� ����
	protected int ctID;
	protected String ctName;
	protected String ctGrade;
	int bonusPoint;
	double bonusRatio;
	
	// ����Ʈ ������
//	public Customer() {
//		ctGrade = "Silver";
//		bonusRatio = 0.01;
//		System.out.println("Customer() ������ȣ��");
//	}	// �Ʒ��� ������ �� ���� �Բ� ȣ���ϴ� �޼��带 �����߱� ������ �ּ�ó�� ��
	
	public Customer() {		// ++++++++++++++++ �������� ���� ���� �����, ���ʽ�����Ʈ, ������ ���� �޼��� 262p
		initCustomer();
	}
	
	// customerŬ������ ���ο� ������ �߰��ϱ� 245p
	// ��ID�� �̸��� �ݵ�� �����Ѵٴ� ������ �޼���
	public Customer(int ctID, String ctName) {
		this.ctID = ctID;
		this.ctName = ctName;
		ctGrade = "Silver";
		bonusRatio = 0.01;
		initCustomer();		// ++++++++++++++++ ������ ���� �޼��� ȣ��
//		System.out.println("Customer(int, String) ������ ȣ��");
	}
	
	private void initCustomer() {	// ++++++++ �����ڿ����� ȣ���ϴ� �޼����̴ϱ� private���� ����
		ctGrade = "Silver";		// ������� �ʱ�ȭ
		bonusRatio = 0.01;		// ������� �ʱ�ȭ
	}
	
	
	// ���ʽ� ����Ʈ ����, ���� ���� ��� �޼���
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return ctName + " ���� ����� " + ctGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
	
	// protected ����������� get, set �޼���, �ܺο��� ����ϵ��� �� 
	public int getctID() {
		return ctID;
	}
	
	public void setctID(int ctID) {
		this.ctID = ctID;
	}
	
	public String getctName() {
		return ctName;
	}
	
	public void setctName(String ctName) {
		this.ctName = ctName;
	}
	
	public String getctGrade() {
		return ctGrade;
	}
	
	public void setctGrade(String ctGrade) {
		this.ctGrade = ctGrade;
	}

	
}
