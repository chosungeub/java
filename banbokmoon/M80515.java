package banbokmoon;

import java.util.Scanner;

public class M80515 {

	public static void main(String[] args) {
		System.out.println("행운의 주사위 숫자? ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int per=100;
		while(true) { // 1~6사이의 값이 아닌숫자를 입력하면 무한루프에서 빠져나오지 못함
			int com=(int)(Math.random()*6)+1;
			if(com==num) {
				break;
			}
			per/=2;
		}
		System.out.println("오늘의 행운 지수는 "+ per + "%");
	}
}
