package javaproject;

import java.util.Scanner;

public class Test5_a {

	public static void main(String[] args) {
		//문제: 현재 금액이 int amount=38562; 
		//결과: 만원=3장, 오천원=1장, 천원=3장, 오백원=1개, 백원=0개, 십원=6개, 일원=2개
		//정답
		System.out.print("금액을 입력하세요=>");
		Scanner sc = new Scanner(System.in);
		int money=sc.nextInt();
		int ten_thousands=money/10000;  //변수 이름 사이에 공백은 절대 있을 수 없다.
		money%=10000; //money=money%10000;
		int five_thousands=money/5000;
		money%=5000;
		int one_thousands=money/1000;
		money%=1000;
		int five_hundreads=money/500;
		money%=500;		
		int one_hundreads=money/100;
		money%=100;
		int ten=money/10;
		money%=10;
		int one=money%10;
		System.out.println("만원 지폐 수= " + ten_thousands + "장 ");
		System.out.println("오천원 지폐 수= "+ five_thousands + "장 ");	
		System.out.println("천원 지폐 수= "+ one_thousands + "장 ");
		System.out.println("오백원 동전 수= "+ five_hundreads + "개 ");
		System.out.println("백원 동전 수= "+ one_hundreads + "개 ");
		System.out.println("십원 동전 수= "+ ten + "개 ");
		System.out.println("일원 동전 수= "+ one + "개 ");
	}

}
