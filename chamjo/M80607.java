package chamjo;

import java.util.Scanner;

public class M80607 {

	public static void main(String[] args) {
		// 134p 7������ //
		boolean run=true;
		int balance=0;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.���� | 2. ���  | 3.�ܰ�  | 4.����");
			System.out.println("-----------------------------");
			System.out.print("����");
			int choice=scanner.nextInt();
			switch(choice) {
				case 1:
					System.out.println("���ݾ�>");
					balance+=scanner.nextInt(); 
					break;
				case 2:
					System.out.println("��ݾ�>");
					int money=scanner.nextInt(); //�̺κ��� ���ؾȰ�
					if(balance<money) {
						System.out.println("�ܾ��� �����մϴ�.");
					}else {
						balance-=money;
					}
					break;
				case 3:
					System.out.println("�ܰ�>");
					System.out.println(balance);
					break;
				case 4:
					run=false;
					break;
				default:
					System.out.println("�ٽ� ���ù�ȣ�� �Է����ּ���");
					break;
			}
		}
		System.out.println("���α׷� ����");
	}

}
