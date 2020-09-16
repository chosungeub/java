package javaproject;

import java.util.Scanner;

public class Main80407 {

	public static void main(String[] args) {
		//switch문을 if문으로하면? //쓰임의 차이가 있는 이유? 대소비교가 필요할때 if
		//switch문을 쓸때 규칙
		System.out.print("여행지 선택(1.미주 2.유럽 3.동남아)");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println("1층 안내데스크로 가세요");
		}else if(choice==2) {
			System.out.println("2층 안내데스크로 가세요");
		}else if(choice==3) {
			System.out.println("별관 안내데스크로 가세요");
		}else {
			System.out.println("여행지 선택이 잘못되었습니다.");
		}
		System.out.println("즐거운 여행되세요");
	}

}
