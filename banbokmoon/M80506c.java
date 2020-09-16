package banbokmoon;

import java.util.Scanner;

public class M80506c {

	public static void main(String[] args) {
		// 반복문 문제5(선행문제정답) // 숫자를 입력하세요? 3 // 3은 소수입니다.
		System.out.println("숫자를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int i;
		for (i=2; i<=num-1; i++) {
			if(num%i==0) {
				break;
			}
		}
		if(num==i) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
	}

}
