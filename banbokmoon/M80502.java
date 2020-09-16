package banbokmoon;

import java.util.Scanner;

public class M80502 {

	public static void main(String[] args) {
		// 반복문 문제
		// 얼마까지 더할까요? 100 // 입력된 값가지 더하는 코딩
		System.out.print("얼마까지 더할까요?");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println("1부터 " + num + "까지의 합은 " + sum);
	}

}
