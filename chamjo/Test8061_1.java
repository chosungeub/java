package chamjo;

public class Test8061_1 {

	public static void main(String[] args) {
		
		int num[]= {50,78,96,70,88,63,-1,74,88,90};
		// 문 -1이 나오기 전까지 배열의 합을 구하여라 // 본수업 정답
		int sum=0;
		
		for (int i=0; i<num.length; i++) {
			if(num[i]==-1)break;
			sum+=num[i];
		} 
		System.out.println("-1이 나오기 전까지의 배열의 합은 " + sum + "입니다.");
	}

}
