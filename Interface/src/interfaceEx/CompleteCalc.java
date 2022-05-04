package interfaceEx;

public class CompleteCalc extends Calculator {
	public int times(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1/num2;
		else
			return Calc.Error;		
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	@Override
	public void description() {
		// 마우스 우클 -> Source -> Override/Implement Methods -> 디폴트 메서드 체크 후 ok하면 자동 생성, 재정의 하면 된다.
		super.description();
	}
}
