package javaproject;

import java.util.Scanner;

public class Main8039 {

	public static void main(String[] args) {
		System.out.print("���Լ�����?");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print("�ǸŴܰ���?");
		int price=sc.nextInt();
		int result;
		String memo;
		if(num>=10 && price>=1000) {
			price-=price/10*2; //����: result=(int)(num*price*0.8);
			result=num*price;
			memo="(���ΰ�)"; //���׿����ڷ� ��ü���� �ʴ� �پ��� if�� Ȱ��
		}else {
			result=num*price;
			memo="(����)";

		}
		System.out.println("�� �ǸŰ�="+result+memo);
	}

}
