package schedualer;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �� ���� ���ʷ� �Ҵ�");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P : �켱������ ���� ���� ���� �Ҵ�");
		System.out.println("A : ���� ������ �ʿ��� �� ��ȭ�� �����´�.");
		
		int ch = System.in.read();	// ���ڸ� �Է¹޴� �޼��带 ����Ϸ��� IOException�� ���.
		Scheduler scheduler = null;
		
		
		// �Է°��� �޾� ��ġ�ϸ� �ش� Ŭ���� ����
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else if(ch == 'A' || ch == 'a') {
			scheduler = new AgentGetCall();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		// � ��å�ΰ��� ������� �������̽��� ������ �޼��� ȣ��
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
	}
}