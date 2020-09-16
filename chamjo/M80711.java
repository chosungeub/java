package chamjo;

public class M80711 {

	public static void main(String[] args) {
		//향상된 for문
		int scores[]= {96,75,88,87,70};
		int sum=0;
		double avg;
		for(int score:scores) { 
		//int score: 는 temp의 기능을 수행한다. 자동으로 다음주소를 읽어 새로운 값을 temp에 저장한다.
		//더 이상 가져올 값이 없을 시 빠져나온다. (배열일 때만 사용가능한 향상된 for문)
			sum +=score;
		}
		avg=(double)sum/scores.length;
		System.out.println("**성적표**");
		System.out.printf("총점=%d\n", sum);
		System.out.printf("평균=%2.1f",avg); 	
	}

}
