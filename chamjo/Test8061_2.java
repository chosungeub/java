package chamjo;

public class Test8061_2 {

	public static void main(String[] args) {
		
		int num[]= {50,78,96,70,88,63,-1,74,88,90};
		// 문 -1이 나오기 전까지 배열의 합을 구하여라 // 내가 썼던 두 번째 정답
		int sum=0;
		for(int i=0; i<num.length; i++) {
			if(num[i]<0) {
				break;
			}
			sum+=num[i]; //break로 빠져나오면 그 하위 실행문들은 실행되지 않는다. 
			//실행흐름 중요. 잘 틀림 // break 위에 쓸때가 있음
		} 
		System.out.println("-1이 나오기 전까지의 배열의 합은 " + sum + "입니다.");
	}

}
