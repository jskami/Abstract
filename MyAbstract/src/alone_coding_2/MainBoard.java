package alone_coding_2;

// 테스트코드부터 역으로 로직 구성하기(연습)
public class MainBoard {
	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel alevel = new AdvancedLevel();
		player.upgradeLevel(alevel);
		player.play(2);
		
		SuperLevel slevel = new SuperLevel();
		player.upgradeLevel(slevel);
		player.play(3);
		
	}
}
