package javaproject;

public class Test5 {

	public static void main(String[] args) {
		//문제: 현재 금액이 int amount=38562; 
		//결과: 만원=3장, 오천원=1장, 천원=3장, 오백원=1개, 백원=0개, 십원=6개, 일원=2개
		
		int amount = 38562;
		int gm = amount/10000;
		int ym = amount%10000/5000;
		int rm = amount%10000%5000/1000;
		int coin500m = amount%10000%5000%1000/500;
		int coin100m = amount%10000%5000%1000%500/100;
		int coin10m = amount%10000%5000%1000%500%100/10;
		int coin1m = amount%10000%5000%1000%500%100%50%10;
		System.out.println("결과는 " + "만원권 " + gm + "개" + " 오천원권 " + ym + "개" + " 천원권 " + rm + "개" + " 오백원권 " + coin500m + "개" + " 백원권 " + coin100m + "개" + " 십원권 " + coin10m + "개" + " 일원권 " + coin1m + "개");
		

	}

}
