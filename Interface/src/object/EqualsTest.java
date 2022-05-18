package object;

// 358p. Object클래스의 equals()메서드 사용하기

class Student {
	int stId;
	String stName;

	public Student(int stId, String stName) {
		this.stId = stId;
		this.stName = stName;
	}
	
	public String toString() {
		return stId + ", " + stName;
	}
}
public class EqualsTest {

	public static void main(String[] args) {
	Student stDoh = new Student(100, "도롱이");
	Student stDoh2 = stDoh;	// 주소 복사
	Student stLong = new Student(100, "도롱이"); // 편의상 도롱이3이라고 하겠음
	
	// 동일한 주소(복사한 객체)의 두 인스턴스 비교======================
	System.out.println("== 기호로 비교");
	if(stDoh == stDoh2)
		System.out.println("●도롱이와 도롱이2의 주소가 같다.");
	else
		System.out.println("●도롱이와 도롱이2의 주소가 다르다.");
	
	System.out.println("equals()로 비교");
	if(stDoh.equals(stDoh2))
		System.out.println("●도롱이와 도롱이2는 동일하다.");
	else
		System.out.println("●도롱이와 도롱이2는 동일하지 않다.");
	//=======================================================
	System.out.println("++++++++++++++++++++++++++++");
	// 동일인이지만 인스턴스의 주소가 다른 경우 비교=====================
	System.out.println("== 기호로 비교");
	if(stDoh == stLong)
		System.out.println("●도롱이와 도롱이3의 주소가 같다.");
	else
		System.out.println("●도롱이와 도롱이3의 주소가 다르다.");
	
	System.out.println("equals()로 비교");
	if(stDoh.equals(stLong))
		System.out.println("●도롱이와 도롱이3은 동일하다.");
	else
		System.out.println("●도롱이와 도롱이3은 동일하지 않다.");
		
	}	
}
