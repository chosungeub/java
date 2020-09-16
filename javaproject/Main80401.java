package javaproject;

import java.util.Scanner;

public class Main80401 {

	public static void main(String[] args) {
		// 조건문 if문
		// 문제: 구매수량은? 5 구매 단가는? 5600 // 출력: 결재금액= 30500(배송료 포함)
		// 구매수량과 단가를 입력받아 결재금액을 구하시오. 단, 결재금액이 30000원 이상일때만 무료배송. 
		// 미만은 2500원 배송료 붙음
		System.out.print("구매수량은?");
		Scanner sc1 = new Scanner(System.in);
		int count=sc1.nextInt();
		System.out.print("구매 단가는?");
		Scanner sc2 = new Scanner(System.in);
		int money=sc2.nextInt();
		String memo="(무료배송)";
		int result = money*count;
		if(result<30000) {
			result+=2500;
			memo="(배송료 포함)";
		}
		System.out.println("결재금액= " + result + memo);

	}

}
