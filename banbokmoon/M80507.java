package banbokmoon;

import java.util.Scanner;

public class M80507 {

	public static void main(String[] args) {
		// 다중(중첩)for문
		for(int a=1; a<=5; a++) {
			for(int b=5; b>a; b--) { //제일좋은답 (int b=5; b<=6-a; b--)
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
