package banbokmoon;

import java.util.Scanner;

public class M80503 {

	public static void main(String[] args) {
		// 반복문 문제2
		int oddSum=0, evenSum=0;
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				oddSum+=i;
			}else {
				evenSum+=i;
			}
		}
		System.out.println("1부터 100까지의 홀수의 합은 " + oddSum);
		System.out.println("1부터 100까지의 짝수의 합은 " + evenSum);
	}

}
