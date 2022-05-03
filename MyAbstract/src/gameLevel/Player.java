package gameLevel;

public class Player {
	private PlayerLevel level;
	
	// �Ű����� �����ϱ� ����Ʈ ������
	public Player() {
		level = new BeginnerLevel();
		level.showLevelInfo();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	// ���� ���� �޼���
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelInfo();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}