package banbokmoon;

import java.util.Scanner;

public class M80512 {

	public static void main(String[] args) {
		// 다중(중첩)for문 문제6
		// 여행 =>배타고 보물섬 발견=>동굴=>2kg=30개, 3kg=30개 
		//=> 배는 100kg까지 적재가능 //기 적재물의 무게가 70kg
		//2,3kg의 보물을 싣을수 있는 경우의 수 모두 구하기
		int sum;
		for(int a=1; a<=30; a++) {
			for(int b=1; b<=30; b++) { 
				sum=a*2 + b*3;
				if(sum==30) {
					System.out.println("2kg의 보물 " + a + " 3kg의 보물 " + b );
				} //결국 출력을 하는데에는 if문이 쓰인다. (if문이 제일 많이 쓰이는 이유)
			}
			
		}
	}
}
