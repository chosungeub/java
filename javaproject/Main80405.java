package javaproject;

import java.util.Scanner;

public class Main80405 {

	public static void main(String[] args) {
		// 중첩if문
		System.out.print("점수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int jumsu = sc.nextInt();
		if(jumsu<=100 && jumsu>=0) {
			if(jumsu<=100 && jumsu>=90) { 
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
		}else {
		System.out.println("점수를 잘못 입력하였습니다.");
		}
	}

}
