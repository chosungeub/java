package banbokmoon;

import java.util.Scanner;

public class M80506 {

	public static void main(String[] args) {
		// 반복문 문제5(선행문제) // 숫자를 입력하세요? 3 // 3은 소수입니다.
		System.out.println("숫자를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		int dan=sc.nextInt();
		String memo="소수 입니다.";
		int i;
		for(i=2; i<=9; i++) {
			if(!(dan==i) && dan%i==0) {
				memo="소수가 아닙니다.";
			}else if(dan%i==0 && dan%1==dan) {
				memo="소수 입니다.";
			}
		}
		System.out.println(memo); //오답이라고 함.. 
	}

}
