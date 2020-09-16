package javaproject;

public class Main07314 {

	public static void main(String[] args) {
		int amount=5;
		int price=1000;
		System.out.println("판매가=" + (amount*price)); //문자인 "판매가="와 숫자인 (amount*price)가 +로 연결되면 확장연산으로 모두 문자처럼 연결연산이 된다. 
		// 중요한 것은 산술연산이 앞으로 나오지 않는 확장은 가로로 구분 해주지 않을 시 +도 모두 연결 연산으로 확장되어 산술되지 않는다. 
		// ex1) 2+5+"판매가" -> 7판매가  ex2) "판매가"+2+5 -> 판매가25 ex3) "판매가"+(2+5) -> 판매가7
// +의 두가지의 의미 2+5의 산술연산 "대한민국"+"만세" 연결하는 연산
	}

}
