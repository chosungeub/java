package chamjo;

public class Test08061 {

	public static void main(String[] args) {
		
		int num[]= {50,78,96,70,88,63,-1,74,88,90};
		// 문 -1이 나오기 전까지 배열의 합을 구하여라 // 맞는답
		int sum=0;
		int i=0;
		while (num[i]>0) {
			sum+=num[i];
			i++;
		} 
		System.out.println("-1이 나오기 전까지의 배열의 합은 " + sum + "입니다.");
	}

}
