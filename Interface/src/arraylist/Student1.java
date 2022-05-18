package arraylist;

import java.util.ArrayList;

public class Student1 {
	// �迭 ���� Student Ŭ���� ���� 227p
	// �л� ���� ��� ���α׷� ����
	// + Subject Ŭ���� / + Student1Test Ŭ���� 

	// �������
	int stuID;
	String stuName;
	ArrayList<Subject> subjectList; // subjectŬ������ ���� �ڷ����̴ϱ� ArrayList�� Ȱ��

	// ������
	public Student1(int stuID, String stuName) {
		this.stuID = stuID;
		this.stuName = stuName;
		subjectList = new ArrayList<Subject>();
	}

	// �����ϴ� ������ subjectList �迭�� �߰��ϴ� �޼���
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}

	// �迭 ��� �� ���
	public void showStudentInfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total += s.getScorePoint(); // ���� ���ϱ�
			System.out.println("�л� " + stuName + "�� " + s.getName() + 
								" ���� ������ " + s.getScorePoint() + "�Դϴ�.");
		}
		System.out.println("�л� " + stuName + "�� ������ " + total + "�Դϴ�.");
	}

}
