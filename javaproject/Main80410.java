package javaproject;

import java.util.Scanner;

public class Main80410 {

	public static void main(String[] args) {
		System.out.print("����� �ֻ��� ���ڴ�??");
		Scanner sc = new Scanner(System.in);
		int myNum=sc.nextInt();
		int comNum=(int)(Math.random()*6)+1; 
		if(myNum==comNum) {
			System.out.println("��! ������ ����");
		}else {
			System.out.println("Ʋ�ȳ׿�"); 
		}
				//�������� 1/6Ȯ���� ������ �ʴ� ���� �� �� �ִ�. 
	}

}
