package javaproject;

import java.util.Scanner;

public class Main80401 {

	public static void main(String[] args) {
		// ���ǹ� if��
		// ����: ���ż�����? 5 ���� �ܰ���? 5600 // ���: ����ݾ�= 30500(��۷� ����)
		// ���ż����� �ܰ��� �Է¹޾� ����ݾ��� ���Ͻÿ�. ��, ����ݾ��� 30000�� �̻��϶��� ������. 
		// �̸��� 2500�� ��۷� ����
		System.out.print("���ż�����?");
		Scanner sc1 = new Scanner(System.in);
		int count=sc1.nextInt();
		System.out.print("���� �ܰ���?");
		Scanner sc2 = new Scanner(System.in);
		int money=sc2.nextInt();
		String memo="(������)";
		int result = money*count;
		if(result<30000) {
			result+=2500;
			memo="(��۷� ����)";
		}
		System.out.println("����ݾ�= " + result + memo);

	}

}
