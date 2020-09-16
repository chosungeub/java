package javaproject;

import java.util.Scanner;

public class Main80402 {

	public static void main(String[] args) {
		// 당신의 몸무게는? 56 당신의 키는? 170 
		// 문제) 표준몸무게=(자신의 키 -100)*0.9
		// 표준몸무게 +5 -5사이는 정상 // 미만은 마른체형입니다. // 초과는 비만.
		
		System.out.print("당신의 몸무게는?");
		Scanner sc = new Scanner(System.in);
		int we = sc.nextInt(); //double
		System.out.print("당신의 키는?");
		int he = sc.nextInt();
		int body = (int)((he-100)*0.9); 
		if(we>body+5) {
			System.out.println("비만입니다." + "(-" + (we-body-5)+ ")"); //+5가 아닌 이해를 빠르게 생각하자
		} else if(we<body-5) {
			System.out.println("마른체형 입니다."+ "(+" + (body-5-we) + ")");
		} else {
			System.out.println("정상입니다.");
		}
		System.out.println("※괄호안에 +는 그만큼 살을 찌우시고 -는 그만큼 빼세요");
	}

}
