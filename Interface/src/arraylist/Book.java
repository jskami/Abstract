package arraylist;

public class Book {
	// ��ü �迭 ����� 207p
	
	private String bookName;
	private String author;
	
	// ����Ʈ ������
	public Book() {
	}

	// �Ű������� �޴� ������
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;	
	}
	
	// �� �Ű��������� get, set �޼��� ����
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// ���� ��¿� �޼��� ����
	public void showBookInfo() {
		System.out.println(bookName + "�� ���� : " + author);
	}
	
	
	
	
}
