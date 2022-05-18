package arraylist;
import java.util.ArrayList;

public class StudentArrayListTest {

	public static void main(String[] args) {
		// �л� arrayList ���� 225p
		ArrayList<Student> manage = new ArrayList<Student>();
		
		manage.add(new Student("������", 10));
		manage.add(new Student("����ȣ", 11));
		manage.add(new Student("������", 12));
		
		for (int i = 0; i < manage.size(); i++) {
			Student stu = manage.get(i);
			stu.showStudentInfo();
		}

		
		System.out.println("==== ���� for������ ����غ��� ====");
		for (Student stu : manage) {
			stu.showStudentInfo();
		}
		
	}

}
