package interfaceEx;

public class Customer implements Buy, Sell {
	@Override
	public void sell() {
		System.out.println("�Ǹ��մϴ�.");
	}
	
	@Override
	public void buy() {
		System.out.println("�����մϴ�.");
	}
}
