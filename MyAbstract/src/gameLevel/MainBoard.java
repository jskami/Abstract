package gameLevel;

public class MainBoard {
	public static void main(String[] args) {
		Player p1 = new Player(); // 처음 생성시 BeginnerLevel
		p1.play(1);
		
		Player p2 = new Player();
		p2.play(3);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		p2.upgradeLevel(aLevel);
		p2.play(3);
		
		SuperLevel sLevel = new SuperLevel();
		p2.upgradeLevel(sLevel);
		p2.play(7);
		
	}
}
