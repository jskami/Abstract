package object;

// 354p. object Ŭ������ toString()�޼��� ����ϱ� 
class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	// toString()�޼��带 ������ �غ���, �ּ�ó���ϸ� ������ �ؽ� ������ ���ð���
	@Override
	public String toString() {
		return bookTitle + ", " + bookNumber;
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "����");
		
		// BookŬ�������� �ν��Ͻ� book1�� toString�޼���� ������ Ȯ���غ���
		System.out.println(book1.toString());
		
		/* ��� toString�� ������� �ʾƵ� �Ȱ��� �ּҰ� ��������, �̳༮�� BookŬ������
		 * �޼��尡 �ƴ� Object Ŭ������ �޼���μ� ���� ��Ÿ����. */
		System.out.println(book1);
		
		//=====================================//
		String str = new String("test");
		System.out.println(str);
		Integer i1 = new Integer(100);
		System.out.println(i1);
		/* String�� IntegerŬ������ toString()�޼��带 �̸� ������ �صξ
		 * 'Ŭ�����̸�@�ؽ��ڵ� ��'���� ��Ÿ���� �ʰ� �Ű����� �� �״�� ��Ÿ����. */
		
		
		
	}
}
