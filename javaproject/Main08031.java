package javaproject;

public class Main08031 {

	public static void main(String[] args) {
//		연산의 우선순위
		// if(조건) { 수행할 내용; }
		// 연산의 우선순위는 산술연산(+-/%)>(비교)관계(><>=<=)>논리(AND, OR(||))
		int num1=7;
		int num2=10;
		if(num1+5>10 && num2==10) {
			System.out.println("이 문장 수행");
		}
		System.out.println("이상입니다.");

	}

}
