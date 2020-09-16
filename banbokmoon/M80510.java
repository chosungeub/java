package banbokmoon;

import java.util.Scanner;

public class M80510 {

	public static void main(String[] args) {
		// 다중(중첩)for문 문제5
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=6-a; b++) { 
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
