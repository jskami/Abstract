package arraylist;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 3;
		char medalColor;
		
		switch(ranking) {
			case 1: medalColor = 'g';
				break;
			case 2: medalColor = 's';
				break;
			case 3: medalColor = 'b';
				break;
			default : medalColor = 'n';
		}
		System.out.println(ranking + "등의 메달 색깔은 " + medalColor + "입니다.");
	}

}
