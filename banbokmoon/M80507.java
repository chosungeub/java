package banbokmoon;

import java.util.Scanner;

public class M80507 {

	public static void main(String[] args) {
		// ����(��ø)for��
		for(int a=1; a<=5; a++) {
			for(int b=5; b>a; b--) { //���������� (int b=5; b<=6-a; b--)
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
