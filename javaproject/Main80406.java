package javaproject;

import java.util.Scanner;

public class Main80406 {

	public static void main(String[] args) {
		// switch��
		// �ݵ�� break����ؾ� ��.
		// break�� �����Ұ�� ���ǿ� �ش�Ǵ� case���� ������Ģ������ ���� �࿡ ��� ���� ����ȴ�.
		System.out.print("������ ����(1.���� 2.���� 3.������)");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("1�� �ȳ�����ũ�� ������");
				break;
			case 2:
				System.out.println("2�� �ȳ�����ũ�� ������");
				break;
			case 3:
				System.out.println("���� �ȳ�����ũ�� ������");
				break;
			default:
				System.out.println("������ ������ �߸��Ǿ����ϴ�.");
		}
		System.out.println("��ſ� ����Ǽ���");
	}

}
