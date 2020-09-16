package banbokmoon;

public class M80504 {

	public static void main(String[] args) {
		// 반복문 문제3 // 1부터 몇 까지 더해야만 3750이 넘을까요?
		int i; //i가 for문에서만 선언되었다면 출력문에 i를 출력할 수 없기 때문에 i를 먼저 선언한다.
		int sum=0;
		for(i=1; i<=100; i++) { //선언된 것을 타입까지 다시 써서 선언할 필요없다. int i =1(x)
			sum+=i;
			if(sum>3750) {
				break;
			}
		}
		System.out.println("1부터" + i + "까지 더해야만 3750이 넘습니다");
		}

}
