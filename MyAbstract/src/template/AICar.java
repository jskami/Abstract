package template;

public class AICar extends Car {
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("방향전환을 자동으로 실시합니다.");
	}
	
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}
	
	public void wiper() {
		System.out.println("비나 눈의 양에 따라 빠르기가 자동으로 조절됩니다.");
	}

}
