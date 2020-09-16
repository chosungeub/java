package javaproject;

import java.util.Scanner;

public class Main80410 {

	public static void main(String[] args) {
		System.out.print("행운의 주사위 숫자는??");
		Scanner sc = new Scanner(System.in);
		int myNum=sc.nextInt();
		int comNum=(int)(Math.random()*6)+1; 
		if(myNum==comNum) {
			System.out.println("굳! 오늘은 행운데이");
		}else {
			System.out.println("틀렸네요"); 
		}
				//생각보다 1/6확률로 나오지 않는 것을 알 수 있다. 
	}

}
