package chamjo;

import java.util.Scanner;

public class Moon1 {

	public static void main(String[] args) {
		String pumArray[]= {"우유","새우깡","컵라면","맥주","샌드위치"};
		int price[]= {2500,1200,1500,3000,3500};
		System.out.print("1.우유  2.새우깡 3.컵라면 4.맥주 5.샌드위치(품목번호를 입력하시오)");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("구입 수량은?");
		int cnt=sc.nextInt();
		int totalPrice=0;
		//여기를 완성
		totalPrice = cnt*price[num-1]; //나의 0813오답: 무려 이중 for문을 사용해서 틀렸다. 
		//to me: 최소한의 변수로 값을 나타내도록 연습해보자
		System.out.println("구입한 " + pumArray[num-1] + "의 총 결재금액은 " + totalPrice + "원 입니다.");
		}
		//구입한 새우깡의 총결재금액= 3600원 입니다.
}
