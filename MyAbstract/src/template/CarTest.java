package template;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("==== �������� �ڵ��� ====");
		Car mycar = new AICar();
		mycar.run();
		
		System.out.println("==== �������� �ڵ��� ====");
		Car oldcar = new ManualCar();
		oldcar.run();
	}
}
