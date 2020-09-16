package chamjo;

import java.util.Scanner;

public class M80607 {

	public static void main(String[] args) {
		// 134p 7번문제 //
		boolean run=true;
		int balance=0;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2. 출금  | 3.잔고  | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택");
			int choice=scanner.nextInt();
			switch(choice) {
				case 1:
					System.out.println("예금액>");
					balance+=scanner.nextInt(); 
					break;
				case 2:
					System.out.println("출금액>");
					int money=scanner.nextInt(); //이부분이 이해안감
					if(balance<money) {
						System.out.println("잔액이 부족합니다.");
					}else {
						balance-=money;
					}
					break;
				case 3:
					System.out.println("잔고>");
					System.out.println(balance);
					break;
				case 4:
					run=false;
					break;
				default:
					System.out.println("다시 선택번호를 입력해주세요");
					break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
