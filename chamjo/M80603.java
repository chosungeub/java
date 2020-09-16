package chamjo;

public class M80603 {

	public static void main(String[] args) {
		// 134p 3번문제
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) sum+=i; //실행문이 한 줄 일때 블록 처리 없이 한 줄로 처리(단답형문제일때=수정이필요없을때)
		}
		System.out.println("3의 배수의 합= "+sum);
	}

}
