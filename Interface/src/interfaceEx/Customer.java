package interfaceEx;

public class Customer implements Buy, Sell {
	@Override
	public void sell() {
		System.out.println("판매합니다.");
	}
	
	@Override
	public void buy() {
		System.out.println("구매합니다.");
	}
}
