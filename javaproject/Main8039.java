package javaproject;

import java.util.Scanner;

public class Main8039 {

	public static void main(String[] args) {
		System.out.print("구입수량은?");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print("판매단가는?");
		int price=sc.nextInt();
		int result;
		String memo;
		if(num>=10 && price>=1000) {
			price-=price/10*2; //정답: result=(int)(num*price*0.8);
			result=num*price;
			memo="(할인가)"; //삼항연산자로 대체되지 않는 다양한 if의 활용
		}else {
			result=num*price;
			memo="(정상가)";

		}
		System.out.println("총 판매가="+result+memo);
	}

}
