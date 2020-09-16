package banbokmoon;

import java.util.Scanner;

public class M80511 {

	public static void main(String[] args) {
		// 다중(중첩)for문 문제5
		int sum;
		for(int a=1; a<=17; a++) {
			for(int b=1; b<=17; b++) { 
				sum=a*4 + b*2;
					if(sum==56 && a+b==17) {
						System.out.println("돼지 마리 수는 " + a + " 타조 마리 수는 " + b );
					}
			}
			
		}
	}
}
