package arraylist;

public class BookArray2 {

	public static void main(String[] args) {
		// ��ü �迭 �����(3) : �� �迭 ��ҿ� �ν��Ͻ� ���� �� �־�� 209p
		Book[] library = new Book[5];
		
		// �ν��Ͻ� ���� �� �迭�� ����
		library[0] = new Book("å1", "�۰�A");
		library[1] = new Book("å2", "�۰�B");
		library[2] = new Book("å3", "�۰�C");
		library[3] = new Book("å4", "�۰�D");
		library[4] = new Book("å5", "�۰�E");
		
		// Book �ν��Ͻ� �����
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		// Book �ν��Ͻ��� ������ �޸� ���� �ּ�
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		
		
		
	}

}
