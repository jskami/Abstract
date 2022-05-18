package object;

// 354p. object 클래스의 toString()메서드 사용하기 
class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	// toString()메서드를 재정의 해보자, 주석처리하면 원래의 해시 값으로 나올거임
	@Override
	public String toString() {
		return bookTitle + ", " + bookNumber;
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		// Book클래스형의 인스턴스 book1을 toString메서드로 정보를 확인해보자
		System.out.println(book1.toString());
		
		/* 사실 toString을 사용하지 않아도 똑같은 주소가 나오지만, 이녀석은 Book클래스의
		 * 메서드가 아닌 Object 클래스의 메서드로서 값이 나타난다. */
		System.out.println(book1);
		
		//=====================================//
		String str = new String("test");
		System.out.println(str);
		Integer i1 = new Integer(100);
		System.out.println(i1);
		/* String과 Integer클래스는 toString()메서드를 미리 재정의 해두어서
		 * '클래스이름@해시코드 값'으로 나타나지 않고 매개변수 값 그대로 나타난다. */
		
		
		
	}
}
