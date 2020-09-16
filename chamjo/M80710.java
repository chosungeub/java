package chamjo;

public class M80710 {

	public static void main(String[] args) {
		//**성적표**
		//총점=?? // 평균=??.?
		int scores[]= {96,75,88,87,70};
		int sum=0;
		double avg;
		for(int i=0; i<scores.length; i++) {
			sum +=scores[i];
		}
		avg=(double)sum/scores.length;
		System.out.println("**성적표**");
		System.out.println("총점= "+sum);
		System.out.printf("평균=%2.1f",avg); //특수한 포맷기호 "%2.1f" + "\n"(줄바꿈)
		//"%2.1f" -> %는 서식기호 f는 실수로 표시하란뜻 2는 소숫점을 포함한 글자 수(소수이상은 알아서 채워짐) .1은 소숫점 자리수
		//System.out.println("평균= "+(int)(avg*10)/10.0);	
	}

}
