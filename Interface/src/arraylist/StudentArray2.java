package arraylist;

public class StudentArray2 {

	public static void main(String[] args) {
		// 객체 배열 연습하기 211p
		
		Student[] manage = new Student[4];
		
		manage[0] = new Student("James", 1001);
		manage[1] = new Student("Tomas", 1002);
		manage[2] = new Student("Edward", 1003);
		manage[3] = new Student("JSP", 1004);
		
		for (int i = 0; i < manage.length; i++) {
			manage[i].showStudentInfo();
		}
		
		for (int i = 0; i < manage.length; i++) {
			System.out.println(manage[i]);
		}

	}

}
