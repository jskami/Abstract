package gameLevel;

public class SuperLevel extends PlayerLevel {
	public void run() {
		System.out.println("고속의 스피드");
	}
	
	public void jump() {
		System.out.println("이중 점프");
	}
	
	public void turn() {
		System.out.println("회피 구르기");
	}
	
	public void showLevelInfo() {
		System.out.println("***상급자 레벨이다***");
	}

}
