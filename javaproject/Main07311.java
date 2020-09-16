package javaproject;

public class Main07311 {
	

	public static void main(String[] args) { 
		int num1=10;
		int num2=3;
		// 변수의 사용규칙: 가독성 있게 변수이름을 정하자 (나쁜ex- int a, int b)
		// 타입은 올바른 계산을 위해 필요한 단위이며 타입별 용량에 따라 담기는 정도가 있다.
		// 정수타입 int는 지수와 가수의 개념이 없다 = int타입은 소수점이 절사된다 = int에 바로 소수를 넣으면 에러가 뜬다
		// int는 4byte 21억정도의 양을 처리
		double val = 23; // 23.0인 지수와 가수로 이해하여 처리됨 = 콘솔 출력값도 23.0으로 나옴
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(val);
		// 리터럴=초기값
		
	//	int num3=025; // 0이 맨 앞에 붙은 값은 8진수로 인식된다. 결과값 2*8의1승 + 5*8의0승 으로 처리
		//int num4=0x25; // 0x가 붙는 숫자는 16진수로 인식된다. 결과값  2*16의1승 + 5*16의0승 으로 처리

		
	}	

}
