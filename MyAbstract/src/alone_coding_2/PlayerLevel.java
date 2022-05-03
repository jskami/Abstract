package alone_coding_2;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelInfo();
	
	final public void allskill(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
	
}
