package banbokmoon;

import java.util.Scanner;

public class M80512 {

	public static void main(String[] args) {
		// ����(��ø)for�� ����6
		// ���� =>��Ÿ�� ������ �߰�=>����=>2kg=30��, 3kg=30�� 
		//=> ��� 100kg���� ���簡�� //�� ���繰�� ���԰� 70kg
		//2,3kg�� ������ ������ �ִ� ����� �� ��� ���ϱ�
		int sum;
		for(int a=1; a<=30; a++) {
			for(int b=1; b<=30; b++) { 
				sum=a*2 + b*3;
				if(sum==30) {
					System.out.println("2kg�� ���� " + a + " 3kg�� ���� " + b );
				} //�ᱹ ����� �ϴµ����� if���� ���δ�. (if���� ���� ���� ���̴� ����)
			}
			
		}
	}
}
