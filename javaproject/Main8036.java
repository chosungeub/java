package javaproject;

import java.util.Scanner;

public class Main8036 {

	public static void main(String[] args) {
		// 수학성적은? 85 // 영어성적은? 70 // 경시대회 참여 가능합니다. 
		// 문. 수학이나 영어성적이 80점 이상이면 경시대회 참여 가능합니다. 라고 문자출력 그렇지 않으면 다음대회를 기다리세요 문자출력
		System.out.print("수학성적은?");
		Scanner sc = new Scanner(System.in);
		int ma=sc.nextInt();
		System.out.print("영어성적은?");
		int en=sc.nextInt();
		//정답: String result;
		if(ma>=80 || en>=80) {
			System.out.println("경시대회 참여 가능합니다."); //정답: result="경시대회 참여 가능합니다.";
		}else {
			System.out.println("다음 기회를 기다리세요.");	  //정답: result="다음 기회를 기다리세요.";	
		}
		//정답: System.out.println(result);
	}

}
