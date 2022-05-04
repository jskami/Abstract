package interfaceEx;

// 314p
public interface Calc {
	// �������̽����� ������ ������ ������ �������� ����� ��ȯ��
	double PI = 3.14;
	int Error = -999999999;
	
	// �������̽����� ������ �޼���� ������ �������� �߻�޼���� ��ȯ��
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// �������̽����� ����Ʈ �޼��� �����ϱ� : �޼��� �ڷ��� �տ� default ����� �ۼ�
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.(����Ʈ �޼���, �������̽����� ��������� �������̽��� ������ Ŭ������ �ִ� ��� ����Ʈ �޼���� Ŭ�������� ���ȴ�.)");
		myMethod(); // ����Ʈ �޼��� ������ �߻�޼��� ����, private static�� ����ؼ� ȣ���Ұž�.
	}
	
	// ���� �޼��� �����ϱ�
	static int total(int[] arr) {
		int total = 0;
	
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();	// ���� �޼��� ������ �߻�޼��� ����, ���� ���������� private static�� ����ؼ� ȣ���� ����
		return total;
	}	// �������̽��� ���� �޼��� total()����
	
	// private �޼���
	private void myMethod() {
		System.out.println("private �޼����Դϴ�.");
	}
	
	// private static �޼���
	private static void myStaticMethod() {
		System.out.println("private static �޼����Դϴ�.");
	}
	
	
}
