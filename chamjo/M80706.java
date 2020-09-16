package chamjo;

public class M80706 {

	public static void main(String[] args) {
		//문
		int a=10;
		int b=20;
		//여기를 완성하시오. 한 줄일 필요없음.
		//콘솔에 a=20, b=10
		int temp;
		temp=a; //변수를 하나 더 생성하여 물물교환방식으로 값을 교환한다.
		a=b;
		b=temp;	
		
		System.out.println("a="+a+",b="+b);
		
	}

}
