package arraylist;

public class Student {
	// ��ü �迭 �����ϱ� 211p
	
	private String stuName;
	private int stuNum;
	
	public Student() {
		
	}
	
	public Student(String stuName, int stuNum) {
		this.stuName = stuName;
		this.stuNum = stuNum;
	}
	
	public String getStuName() {
		return stuName;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	public int getStuNum() {
		return stuNum;
	}
	
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	
	public void showStudentInfo()	{
		System.out.println(stuName + "��(��) �й��� " + stuNum + "�Դϴ�.");
	}
	
	// 357p toString()�޼���� ������ �Ͽ� �̸�,�й� ����ϱ�
	public String toString() {
		return stuNum + ", " + stuName;
	}
	
}
