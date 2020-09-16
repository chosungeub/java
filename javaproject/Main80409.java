package javaproject;

import java.util.Scanner;

public class Main80409 {

	public static void main(String[] args) {
		int num=(int)(Math.random()*6)+1; 
		//Math는 class(객체 명령)배울 때 나온다. Math는 내장class다.
		//Math.random은 0~1의 실수인 난수를 생성한다. //0.999~ 0.5444~ 등
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			case 6:
				System.out.println("6번이 나왔습니다.");
				break;
		} //실행 할 때마다 다른 출력문이 나온다.
				
	}

}
