package javaproject;

import java.util.Scanner;

public class Main80403 {

	public static void main(String[] args) {
		// 점수를 입력받아 점수가 80점 이상이면 "합격" 미만은 "불합격"을 출력
		// 맨 마지막에는 "수고하셨습니다." 
		System.out.print("점수");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score>=80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		System.out.println("수고하셨습니다.");

	}

}
