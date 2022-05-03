package gameLevel;

public class Player {
	private PlayerLevel level;
	
	// 매개변수 없으니까 디폴트 생성자
	public Player() {
		level = new BeginnerLevel();
		level.showLevelInfo();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	// 레벨 변경 메서드
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelInfo();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
