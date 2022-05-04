package interfaceEx;

public class CustomerTest {
	public static void main(String[] args) {
		Customer ct = new Customer();
		
		/* Customer 클래스형인 ct를 Buy 인터페이스형인 buyer에 대입해서 형변환 하였다.
		 * buyer는 Buy 인터페이스의 메서드만 호출 가능하다. */
		Buy buyer = ct;
		buyer.buy();
		
		// 위와 동일
		Sell seller = ct;
		seller.sell();
		
		if(seller instanceof Customer) {
			Customer ct2 = (Customer)seller;	// seller를 하위 클래스형인 Customer로 다시 형변환 함
		
		ct2.buy();
		ct2.sell();
		/* 최종적으로 인터페이스의 메서드는 인터페이스형 인스턴스만 호출이 가능했는데, 
		 * 클래스형으로 형 변환한 인스턴스역시 인터페이스의 메서드를 호출 할 수 있게 되었다? */
		
		}
	}
}
