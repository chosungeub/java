package banbokmoon;

import java.util.Scanner;

public class M80503 {

	public static void main(String[] args) {
		// �ݺ��� ����2
		int oddSum=0, evenSum=0;
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				oddSum+=i;
			}else {
				evenSum+=i;
			}
		}
		System.out.println("1���� 100������ Ȧ���� ���� " + oddSum);
		System.out.println("1���� 100������ ¦���� ���� " + evenSum);
	}

}
