package javaproject;

import java.util.Scanner;

public class Main08035 {

	public static void main(String[] args) {
		//
		System.out.print("���Լ�����?");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print("�ǸŴܰ���?");
		int price=sc.nextInt();
		int result;
		if(num>=10 && price>=1000) {
			price-=price/10*2; //����: result=(int)(num*price*0.8);
			result=num*price;
		}else {
			result=num*price;
		}
		System.out.println("�� �ǸŰ�="+result);
	}

}
