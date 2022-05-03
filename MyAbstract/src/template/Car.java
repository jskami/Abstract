package template;

/* ���ø� �޼��� 291p */
public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();	
	
	public void startCar() {
		System.out.println("�õ��� �Ҵ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ����.");
	}
	
	
	// ���ø� �޼���
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
	/* �ν��Ͻ�(��ü)�� ���� �޶� �޼��帶�� ǥ���ϴ� ����� �ٸ� ��������, ������ �ൿ�� �����Ѵ�.
	 * �׷� �ൿ���� ���� ������ �ʿ� ���� �� �������� �޼��带 ����� ���� ����. �̰��� ���ø� �޼����̴�.
	 * ������ �ó������� �����ϰ��� �ϴ� �޼����̱� ������ ���� Ŭ�������� ������ �ؼ��� �ȵȴ�.
	 * ������ final�� ����Ѵ�. */
}