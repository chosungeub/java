package javaproject;

import java.util.Scanner;

public class Main80403 {

	public static void main(String[] args) {
		// ������ �Է¹޾� ������ 80�� �̻��̸� "�հ�" �̸��� "���հ�"�� ���
		// �� ���������� "�����ϼ̽��ϴ�." 
		System.out.print("����");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score>=80) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		System.out.println("�����ϼ̽��ϴ�.");

	}

}
