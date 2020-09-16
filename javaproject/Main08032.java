package javaproject;

public class Main08032 {

	public static void main(String[] args) {
		// 증감연산자의 우선순위 //
//		int num=0;
//		num++; //후위증감연산자
//		++num; //전위증감연산자
//		System.out.println(num); //2
//		num--; 
//		--num; 
//		System.out.println(num); //0
		
		int value=0;
		int num=0;
		value=num++; // ++num 이면 값은  1
		System.out.println(value); // 0
		//이렇게 증감연산자의 최우선순위 대규칙을 파괴하기 때문에 반드시 증감연산자는 한줄 단독으로 쓴다.
		//절대 이렇게 쓰지 말것: int a=2, b=3, result; //result=++a + --b * a--;
		//a는2, b는2, result는 9가 된다. //연산이 매우복잡 
	}

}
