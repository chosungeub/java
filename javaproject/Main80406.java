package javaproject;

import java.util.Scanner;

public class Main80406 {

	public static void main(String[] args) {
		// switch문
		// 반드시 break사용해야 함.
		// break를 생략할경우 조건에 해당되는 case부터 순차규칙에따라 다음 행에 모든 것이 실행된다.
		System.out.print("여행지 선택(1.미주 2.유럽 3.동남아)");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("1층 안내데스크로 가세요");
				break;
			case 2:
				System.out.println("2층 안내데스크로 가세요");
				break;
			case 3:
				System.out.println("별관 안내데스크로 가세요");
				break;
			default:
				System.out.println("여행지 선택이 잘못되었습니다.");
		}
		System.out.println("즐거운 여행되세요");
	}

}
