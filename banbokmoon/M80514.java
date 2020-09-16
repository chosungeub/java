package banbokmoon;

import java.util.Scanner;

public class M80514 {

	public static void main(String[] args) {
		// while문 문제 // 원하는 숫자는? 3 // 1~100사이의 3의 배수의 합은?
		System.out.println("원하는 숫자는? ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int i=0;
		int sum=0;
		while(i<100) {
			i+=num;
			sum+=i;
			}
		System.out.println("1~100사이의" + num + "의 배수의 합은 " + sum + "입니다.");
	}
}
