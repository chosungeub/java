package chamjo;

import java.util.Calendar;
import java.util.Scanner;

public class M81005 {

	public static void main(String[] args) {
		//182p 9�� ���� //�����԰� ����� �� (���ƴ�...)
		boolean run=true;
		int studentNum=0;
		int[] scores=null;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1: 
				//�л���
				System.out.print("�л���> ");
				studentNum=scanner.nextInt();
				scores=new int[studentNum];
				break;
				
			case 2:
				//�����Է�
				for(int i=0; i<studentNum; i++) {
				System.out.print("scores["+i+"]>");
				int score=scanner.nextInt(); 
				//������ ������ ���� ������ ���� ����� ���� ��ġ�� ����
				scores[i]=score;
				}
				break;
			case 3:
				//��������Ʈ
				for(int i=0; i<studentNum; i++) {
					System.out.println("scores["+i+"]: "+ scores[i]);
					}
				break;
			case 4:
				//�ְ� ���� ������ ����� ���ϴ� �� //�м�
				int max=0;
				double avg=0;
				int sum=0;
				for(int i=0; i<scores.length; i++) {
					sum+=scores[i];
					if(scores[i]>max) {
						max=scores[i];
					}
				}
				avg=(double)sum/studentNum;
				System.out.println("�ְ� ����: "+max);
				System.out.println("��� ����: "+avg);
				break;
			case 5:
				//����
				run=false;
				break;
			}
			System.out.println("���α׷� ����");
		}
		
	}

}
