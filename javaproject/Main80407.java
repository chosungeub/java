package javaproject;

import java.util.Scanner;

public class Main80407 {

	public static void main(String[] args) {
		//switch���� if�������ϸ�? //������ ���̰� �ִ� ����? ��Һ񱳰� �ʿ��Ҷ� if
		//switch���� ���� ��Ģ
		System.out.print("������ ����(1.���� 2.���� 3.������)");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println("1�� �ȳ�����ũ�� ������");
		}else if(choice==2) {
			System.out.println("2�� �ȳ�����ũ�� ������");
		}else if(choice==3) {
			System.out.println("���� �ȳ�����ũ�� ������");
		}else {
			System.out.println("������ ������ �߸��Ǿ����ϴ�.");
		}
		System.out.println("��ſ� ����Ǽ���");
	}

}
