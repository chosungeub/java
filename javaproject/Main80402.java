package javaproject;

import java.util.Scanner;

public class Main80402 {

	public static void main(String[] args) {
		// ����� �����Դ�? 56 ����� Ű��? 170 
		// ����) ǥ�ظ�����=(�ڽ��� Ű -100)*0.9
		// ǥ�ظ����� +5 -5���̴� ���� // �̸��� ����ü���Դϴ�. // �ʰ��� ��.
		
		System.out.print("����� �����Դ�?");
		Scanner sc = new Scanner(System.in);
		int we = sc.nextInt(); //double
		System.out.print("����� Ű��?");
		int he = sc.nextInt();
		int body = (int)((he-100)*0.9); 
		if(we>body+5) {
			System.out.println("���Դϴ�." + "(-" + (we-body-5)+ ")"); //+5�� �ƴ� ���ظ� ������ ��������
		} else if(we<body-5) {
			System.out.println("����ü�� �Դϴ�."+ "(+" + (body-5-we) + ")");
		} else {
			System.out.println("�����Դϴ�.");
		}
		System.out.println("�ذ�ȣ�ȿ� +�� �׸�ŭ ���� ���ð� -�� �׸�ŭ ������");
	}

}
