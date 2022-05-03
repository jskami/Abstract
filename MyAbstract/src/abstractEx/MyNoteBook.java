package abstractEx;

public class MyNoteBook extends NoteBook {
	@Override
	public void typing() {
		System.out.println("MyNoteBook typing()");
	}
	
	/*노트북 클래스에서 구현된 디스플레이 추상메서드를 상속받으면 추상메서드 두개를 전부 구현 할 수
	 * 있기 때문에 타이핑 추상메서드 한 개만 구현하고 클래스를 추상클래스로 사용하지 않았다. 
	 */
}
