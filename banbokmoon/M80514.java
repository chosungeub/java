package banbokmoon;

import java.util.Scanner;

public class M80514 {

	public static void main(String[] args) {
		// while�� ���� // ���ϴ� ���ڴ�? 3 // 1~100������ 3�� ����� ����?
		System.out.println("���ϴ� ���ڴ�? ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int i=0;
		int sum=0;
		while(i<100) {
			i+=num;
			sum+=i;
			}
		System.out.println("1~100������" + num + "�� ����� ���� " + sum + "�Դϴ�.");
	}
}
