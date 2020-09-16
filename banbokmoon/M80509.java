package banbokmoon;

import java.util.Scanner;

public class M80509 {

	public static void main(String[] args) {
		// 다중(중첩)for문 문제4
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) { 
				System.out.print(a);
			}
			System.out.println();
		}
	}
}
