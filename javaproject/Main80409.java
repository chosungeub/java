package javaproject;

import java.util.Scanner;

public class Main80409 {

	public static void main(String[] args) {
		int num=(int)(Math.random()*6)+1; 
		//Math�� class(��ü ���)��� �� ���´�. Math�� ����class��.
		//Math.random�� 0~1�� �Ǽ��� ������ �����Ѵ�. //0.999~ 0.5444~ ��
		switch(num) {
			case 1:
				System.out.println("1���� ���Խ��ϴ�.");
				break;
			case 2:
				System.out.println("2���� ���Խ��ϴ�.");
				break;
			case 3:
				System.out.println("3���� ���Խ��ϴ�.");
				break;
			case 4:
				System.out.println("4���� ���Խ��ϴ�.");
				break;
			case 5:
				System.out.println("5���� ���Խ��ϴ�.");
				break;
			case 6:
				System.out.println("6���� ���Խ��ϴ�.");
				break;
		} //���� �� ������ �ٸ� ��¹��� ���´�.
				
	}

}
