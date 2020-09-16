package chamjo;

public class M80612 {

	public static void main(String[] args) {
		//배열 (매우중요 -> if문 다음으로 중요) : 난이도가 높은 프로그램 효과적으로 작성가능
		//개념정리 예문1
		/* int kor,eng,mat,kor; //오류남
		int tot;
		kor=80;
		eng=70;
		mat=75;
		kor=96;
		tot=kor+eng+mat+kor;
		System.out.println("국어= " + kor);
		System.out.println("영어= " + eng);
		System.out.println("수학= " + mat);
		System.out.println("국사= " + kor);
		System.out.println("총점= " + tot);
		 하나의 변수에 하나의 값만 저장되는 기본타입 */
		//배열은 하나의 기억장소에 여러개의 값을 저장할 수 있다. //이름은 하난데 값은 여러개
	
		int score[]=new int[4]; //new는 새롭게 생성하겠다는 의미 []안의 수는 배열의 갯수
		int tot;
		score[0]=70; //[]인덱스
		score[1]=85;
		score[2]=90;
		score[3]=80;
		tot=score[0]+score[1]+score[2]+score[3];
		System.out.println("국어= " + score[0]);
		System.out.println("영어= " + score[1]);
		System.out.println("수학= " + score[2]);
		System.out.println("국사= " + score[3]);
		System.out.println("총점= " + tot);
		//배열의 장점
		//1. 
	}

}
