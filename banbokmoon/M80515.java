package banbokmoon;

import java.util.Scanner;

public class M80515 {

	public static void main(String[] args) {
		System.out.println("����� �ֻ��� ����? ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int per=100;
		while(true) { // 1~6������ ���� �ƴѼ��ڸ� �Է��ϸ� ���ѷ������� ���������� ����
			int com=(int)(Math.random()*6)+1;
			if(com==num) {
				break;
			}
			per/=2;
		}
		System.out.println("������ ��� ������ "+ per + "%");
	}
}
