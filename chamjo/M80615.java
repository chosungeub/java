package chamjo;

public class M80615 {

	public static void main(String[] args) {
		//배열의 장점 1_1
		//배열은 '같은 타입'의 데이터를 연속된 공간에 저장하는 자료구조
		int score[]= {70, 85, 90, 80, 70, 96, 88}; 
		int tot=0;
		double avg;
		for (int i=0; i<score.length; i++) { 
		//score.length이란 배열의 크기 (int score[]=new int[7]); //반복문과의 응용
		tot+=score[i]; //0~6 인덱스의 값을 tot에 더하는 것을 반복하는 코딩
		}
		System.out.println("총점= " + tot);
		avg=tot/(double)score.length;
		System.out.println("평균= " + (int)(avg*100)/100.0);
		// casting을 이용해 소수점 자리수를 조절하는 법
	}

}
