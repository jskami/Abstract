package arraylist;

public class Student1Test {

	public static void main(String[] args) {
		// �л� ���� ����ϱ� 229p
		Student1 st1 = new Student1(1001, "park");
		st1.addSubject("�ڹ�", 70);
		st1.addSubject("php", 50);
		
		Student1 st2 = new Student1(1002, "Moon");
		st2.addSubject("�ڹ�", 80);
		st2.addSubject("php", 40);
		st2.addSubject("�ڹٽ�ũ��Ʈ", 60);
		
		st1.showStudentInfo();
		System.out.println("=========");
		st2.showStudentInfo();
		
		// toString()�޼���� �̸�,�й� ����ϱ�
		Student st = new Student("3�г�", 10);
		System.out.println(st); // Object Ŭ������ toString
		System.out.println(st.toString());	// Student Ŭ������ toString
	}

}
