package alone_coding;

/* 테스트 클래스를 먼저 작성 후, 어떤 클래스와 메서드가 필요하고 추상을 넣을 것인지 생각해서
 * 코딩해보자. 
 * */
public class CarTest {
	public static void main(String[] args) {
		Bus bus = new Bus();
		AutoCar autocar = new AutoCar();
		
		bus.run();
		autocar.run();
		
		bus.refuel();
		autocar.refuel();
		
		bus.takePassenger();
		autocar.load();
		
		bus.stop();
		autocar.stop();
	}
}
