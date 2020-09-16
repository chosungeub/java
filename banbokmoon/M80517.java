package banbokmoon;

public class M80517 {

	public static void main(String[] args) {
		//continue의 활용 for문이나 while문에 쓰인다.
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
			if(i%5==0) {
				continue; //true일 때 반복문을 탈출(끝으로가서)하여 5의 배수만 제외한 1~100의 합이 구해진다.
			}
			sum+=i;
		}
		System.out.println(sum);
		
	}
}
