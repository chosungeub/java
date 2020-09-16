package chamjo;

public class M80614 {

	public static void main(String[] args) {
		//배열의 장점 1_1
		int score[]= {70, 85, 90, 80, 70, 96, 88}; 
		int tot=0;
		for (int i=0; i<score.length; i++) { 
		//score.length이란 배열의 크기 (int score[]=new int[7]);
		tot+=score[i]; //0~6 인덱스의 값을 tot에 더하는 것을 반복하는 코딩
		}
		System.out.println("총점= " + tot);
		System.out.println("평균= " + tot/score.length);
		
	}

}
