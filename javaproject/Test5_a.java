package javaproject;

import java.util.Scanner;

public class Test5_a {

	public static void main(String[] args) {
		//����: ���� �ݾ��� int amount=38562; 
		//���: ����=3��, ��õ��=1��, õ��=3��, �����=1��, ���=0��, �ʿ�=6��, �Ͽ�=2��
		//����
		System.out.print("�ݾ��� �Է��ϼ���=>");
		Scanner sc = new Scanner(System.in);
		int money=sc.nextInt();
		int ten_thousands=money/10000;  //���� �̸� ���̿� ������ ���� ���� �� ����.
		money%=10000; //money=money%10000;
		int five_thousands=money/5000;
		money%=5000;
		int one_thousands=money/1000;
		money%=1000;
		int five_hundreads=money/500;
		money%=500;		
		int one_hundreads=money/100;
		money%=100;
		int ten=money/10;
		money%=10;
		int one=money%10;
		System.out.println("���� ���� ��= " + ten_thousands + "�� ");
		System.out.println("��õ�� ���� ��= "+ five_thousands + "�� ");	
		System.out.println("õ�� ���� ��= "+ one_thousands + "�� ");
		System.out.println("����� ���� ��= "+ five_hundreads + "�� ");
		System.out.println("��� ���� ��= "+ one_hundreads + "�� ");
		System.out.println("�ʿ� ���� ��= "+ ten + "�� ");
		System.out.println("�Ͽ� ���� ��= "+ one + "�� ");
	}

}
