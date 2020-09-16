package javaproject;

import java.util.Scanner;

public class Main80404 {

	public static void main(String[] args) {
		// 80403정답전 예제
				// 안좋은 예시
				
				System.out.print("점수를 입력하시오.");
				Scanner sc = new Scanner(System.in);
				int jumsu = sc.nextInt();
				if(jumsu<=100 && jumsu>=90) {  //
					System.out.println("수");
				}else if(jumsu<=89 && jumsu>=80) {
					System.out.println("우");
				}else if(jumsu<=79 && jumsu>=70) {
					System.out.println("미");
				}else if(jumsu<=69 && jumsu>=60) {
					System.out.println("양");
				}else {
					System.out.println("가");
				}
	}

}
