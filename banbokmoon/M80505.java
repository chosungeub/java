package banbokmoon;

import java.util.Scanner;

public class M80505 {

	public static void main(String[] args) {
		// �ݺ��� ����4 // ���ϴ� ����?
		System.out.println("���ϴ� ����?");
		Scanner sc = new Scanner(System.in);
		int dan=sc.nextInt();
		System.out.println("** " + dan + "�� **");
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "x" + i + "=" + dan*i);
		}
		}

}
