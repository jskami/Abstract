package abstractEx;

// 283p
public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �Ҵ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ����.");
	}
}
