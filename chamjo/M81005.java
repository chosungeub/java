package chamjo;

import java.util.Calendar;
import java.util.Scanner;

public class M81005 {

	public static void main(String[] args) {
		//182p 9번 문제 //선생님과 만들어 봄 (여렵다...)
		boolean run=true;
		int studentNum=0;
		int[] scores=null;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1: 
				//학생수
				System.out.print("학생수> ");
				studentNum=scanner.nextInt();
				scores=new int[studentNum];
				break;
				
			case 2:
				//점수입력
				for(int i=0; i<studentNum; i++) {
				System.out.print("scores["+i+"]>");
				int score=scanner.nextInt(); 
				//점수를 개별로 받을 변수를 새로 만드는 개념 놓치지 말것
				scores[i]=score;
				}
				break;
			case 3:
				//점수리스트
				for(int i=0; i<studentNum; i++) {
					System.out.println("scores["+i+"]: "+ scores[i]);
					}
				break;
			case 4:
				//최고 높은 점수와 평균을 구하는 것 //분석
				int max=0;
				double avg=0;
				int sum=0;
				for(int i=0; i<scores.length; i++) {
					sum+=scores[i];
					if(scores[i]>max) {
						max=scores[i];
					}
				}
				avg=(double)sum/studentNum;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
				break;
			case 5:
				//종료
				run=false;
				break;
			}
			System.out.println("프로그램 종료");
		}
		
	}

}
