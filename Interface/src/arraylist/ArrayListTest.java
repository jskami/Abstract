package arraylist;
import java.util.ArrayList;	// import �ݵ�� �ۼ�

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList Ŭ���� ����ϱ� 224p
		
		// ArrayList ����
		ArrayList<Book> library = new ArrayList<Book>();
		
		// add()�޼���� ��� �� �߰�
		library.add(new Book("å1", "�۰�A"));
		library.add(new Book("å2", "�۰�B"));
		library.add(new Book("å3", "�۰�C"));
		library.add(new Book("åx", "�۰�??"));
		
		// �迭�� �߰��� ��� ��ŭ ���
		for (int i = 0; i < library.size(); i++) {
			Book book = library.get(i);	// ��Ҹ� �ϳ��� �������� �޼��� get()
			book.showBookInfo();
		}
		System.out.println("=====���м�=====");
		
		// ���� for�� ���
		for (Book book : library) {
			book.showBookInfo();
		}
		
		
		
	}

}
