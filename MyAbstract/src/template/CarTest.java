package template;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("==== 자율주행 자동차 ====");
		Car mycar = new AICar();
		mycar.run();
		
		System.out.println("==== 자율주행 자동차 ====");
		Car oldcar = new ManualCar();
		oldcar.run();
	}
}
