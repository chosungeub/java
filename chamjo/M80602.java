package chamjo;

public class M80602 {

	public static void main(String[] args) {
		// 134p 4번문제 // 종료값을 알수 없는 조건은 while이 제격이다.
		int num1=0;
		int num2=0;
		while(num1+num2!=5) {
			num1=(int)(Math.random()*6)+1;
			num2=(int)(Math.random()*6)+1;
			System.out.println("("+num1+", "+ num2 +")");
		}
		
	}

}
