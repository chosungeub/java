package banbokmoon;

import java.util.Scanner;

public class M80505 {

	public static void main(String[] args) {
		// 반복문 문제4 // 원하는 단은?
		System.out.println("원하는 단은?");
		Scanner sc = new Scanner(System.in);
		int dan=sc.nextInt();
		System.out.println("** " + dan + "단 **");
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "x" + i + "=" + dan*i);
		}
		}

}
