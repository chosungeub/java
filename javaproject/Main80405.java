package javaproject;

import java.util.Scanner;

public class Main80405 {

	public static void main(String[] args) {
		// ��øif��
		System.out.print("������ �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		int jumsu = sc.nextInt();
		if(jumsu<=100 && jumsu>=0) {
			if(jumsu<=100 && jumsu>=90) { 
				System.out.println("��");
			}else if(jumsu<=89 && jumsu>=80) {
				System.out.println("��");
			}else if(jumsu<=79 && jumsu>=70) {
				System.out.println("��");
			}else if(jumsu<=69 && jumsu>=60) {
				System.out.println("��");
			}else {
				System.out.println("��");
			}
		}else {
		System.out.println("������ �߸� �Է��Ͽ����ϴ�.");
		}
	}

}
