package alone_coding;

/* �׽�Ʈ Ŭ������ ���� �ۼ� ��, � Ŭ������ �޼��尡 �ʿ��ϰ� �߻��� ���� ������ �����ؼ�
 * �ڵ��غ���. 
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
