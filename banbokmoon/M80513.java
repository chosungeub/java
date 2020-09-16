package banbokmoon;

public class M80513 {

	public static void main(String[] args) {
		// while문 // 데이터베이스에서는 자주 쓰임(최종값을 알수 없을때)
		int sum=0;
		int i=0; //for문에 있는 초기식을 미리 선언
		while(i<100) {
			i++; //언젠가 거짓이 되기 위해 증감식을 넣는다. 안넣으면 무한루프에 빠진다.
			sum+=i; 
		}
		System.out.println("1부터 100가지의 합은 " + sum);
	}
}
