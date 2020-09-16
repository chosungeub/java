package chamjo;

public class M80613 {

	public static void main(String[] args) {
		//배열의 장점 1
		//int score[]=new int[4];
		int score[]= {70, 85, 90, 80}; // 배열을 선언과 함께 초기값을 설정해주는 방법
		int tot;
		/*score[0]=70; 
		score[1]=85;
		score[2]=90;
		score[3]=80; */
		tot=score[0]+score[1]+score[2]+score[3];
		System.out.println("국어= " + score[0]);
		System.out.println("영어= " + score[1]);
		System.out.println("수학= " + score[2]);
		System.out.println("국사= " + score[3]);
		System.out.println("총점= " + tot);
		
	}

}
