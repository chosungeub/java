package banbokmoon;

import java.util.Scanner;

public class M80502 {

	public static void main(String[] args) {
		// �ݺ��� ����
		// �󸶱��� ���ұ��? 100 // �Էµ� ������ ���ϴ� �ڵ�
		System.out.print("�󸶱��� ���ұ��?");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println("1���� " + num + "������ ���� " + sum);
	}

}
