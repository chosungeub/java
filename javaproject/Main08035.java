package javaproject;

import java.util.Scanner;

public class Main08035 {

	public static void main(String[] args) {
		//
		System.out.print("구입수량은?");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print("판매단가는?");
		int price=sc.nextInt();
		int result;
		if(num>=10 && price>=1000) {
			price-=price/10*2; //정답: result=(int)(num*price*0.8);
			result=num*price;
		}else {
			result=num*price;
		}
		System.out.println("총 판매가="+result);
	}

}
