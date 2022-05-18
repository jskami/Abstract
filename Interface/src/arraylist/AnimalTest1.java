package arraylist;

import java.util.ArrayList;

// ���� Ŭ���� ==============================
	class Animal {
		public void move() {
			System.out.println("������ ������!");
		}
	}
	
	// Animal�� ��ӹ��� Ŭ������ ==================
	class Human extends Animal {
		public void move() {
			System.out.println("����� �ȴ´�.");
		}
		
		public void readBook() {
			System.out.println("�����ϴ� �ΰ�");
		}
	}
	
	class Tiger extends Animal {
		public void move() {
			System.out.println("ȣ���̰� �ڴ�.");
		}
		
		public void hunting() {
			System.out.println("����ϴ� ȣ����");
		}
	}
	
	class Eagle extends Animal {
		public void move() {
			System.out.println("������ ����!");
		}
		
		public void sleeping() {
			System.out.println("�ڰ��ִ� ������");
		}
	}
	// =======================================
	
	// instanceof()�� �ٿ�ĳ���� �ϱ� 275p
	public class AnimalTest1 {
		ArrayList<Animal> aniList = new ArrayList<Animal>();
		
		public static void main(String[] args) {
			AnimalTest1 aTest = new AnimalTest1();
			aTest.addAnimal();
			System.out.println("���� ������ �ٿ� ĳ����");
			aTest.testCasting();
		}
		
		public void addAnimal() {
			aniList.add(new Human());
			aniList.add(new Tiger());
			aniList.add(new Eagle());
			
			for(Animal ani : aniList) {
				ani.move();
			}
			System.out.println("============================");
		}
		
	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) {	// ��� �迭 ��Ҹ� �ϳ��� ���鼭
			Animal ani = aniList.get(i);			// Animal������ �����´�.
			if(ani instanceof Human) {				// Human�̸�
				Human h = (Human)ani;				// Human������ �ٿ� ĳ�����Ѵ�.
				h.readBook();
			} else if (ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			} else if (ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.sleeping();
			} else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
	}
	
	// ������ �׽�Ʈ 259p
//	public class AnimalTest1 {
//		public static void main(String[] args) {
//			AnimalTest1 aTest = new AnimalTest1();
//			aTest.moveAnimal(new Human());
//			aTest.moveAnimal(new Tiger());
//			aTest.moveAnimal(new Eagle());
//	}
//
//	public void moveAnimal(Animal animal) {	// (Animal �Ű������� �ڷ����� ���� Ŭ����)
//		animal.move();	// �����ǵ� �޼��� ȣ��
//	}
				
}
