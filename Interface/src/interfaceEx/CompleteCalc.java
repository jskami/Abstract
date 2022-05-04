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
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}

	@Override
	public void description() {
		// ���콺 ��Ŭ -> Source -> Override/Implement Methods -> ����Ʈ �޼��� üũ �� ok�ϸ� �ڵ� ����, ������ �ϸ� �ȴ�.
		super.description();
	}
}
