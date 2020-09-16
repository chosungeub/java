package banbokmoon;

public class M80516 {

	public static void main(String[] args) {
		//do while문 
		int sum=0;
		int i=0; 
		do { //do문은 무조건 1번은 실행해준다. // 표를 보여준다음 표를 잘라 확인하는 작업시 등에 활용
			i++; 
			sum+=i; 
		}while(i<100); //반드시 ; 붙인다.
		System.out.println("1부터 100가지의 합은 " + sum);
	}
}
