package arraylist;

public class ObjectCopy {

	public static void main(String[] args) {
		// ��ü �迭 ���� 213p
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		System.out.println(bookArray1);
		System.out.println(bookArray2);
		
		bookArray1[0] = new Book("å1", "�۰�A");
		bookArray1[1] = new Book("å2", "�۰�B");
		bookArray1[2] = new Book("å3", "�۰�C");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
				
	}

}
