package arraylist;

	// �����ϱ� : ������ 
	class Studentt {
		public void Homework() {
			System.out.println("�����ض�");
		}
	}
	
	class kid extends Studentt {
		public void Homework() {
			System.out.println("���̵� ������");
		}
	}
	
	class senior extends Studentt {
		public void Homework() {
			System.out.println("��� ������");
		}
	}

	class alien extends Studentt {
		public void Homework() {
			System.out.println("�ܰ��ε� ������");
		}
	}
	
	public class StudentTest99 {
		public static void main(String[] args) {
			StudentTest99 st = new StudentTest99();
			st.study(new kid());
			st.study(new senior());
			st.study(new alien());
		}
		
		public void study(Studentt student) {
			student.Homework();
		}

	}
	