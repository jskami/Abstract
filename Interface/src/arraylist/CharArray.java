package arraylist;

public class CharArray {

	public static void main(String[] args) {
		// ���ڿ� �ƽ�Ű �ڵ� �� ��� 206p
		char[] alphabets = new char[26];
		char ch = 'A';
		System.out.println((int)ch); // ���������� �� ��ȯ ��� �׽�Ʈ
		
		for (int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		System.out.println(alphabets[18]); // ������ ���� ���
		
		for (int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + " = " + (int)alphabets[i]); // ����ȯ ����
		}
		
		System.out.println("===== ���м� =====");
		
		// ���� : �ҹ��� ���
		char[] alphabet2 = new char[26];
		char ch2 = 'a';
		System.out.println((int)ch2);
		
		for (int i = 0; i < alphabet2.length; i++, ch2++) {
			alphabet2[i] = ch2;			
		}
		System.out.println(alphabet2[18]);
		
		for (int i = 0; i < alphabet2.length; i++) {
			System.out.println(alphabet2[i] + " = " + (int)alphabet2[i]);
		}
		
		System.out.println("===== ���м� =====");
		
		
		
	}
	
}
