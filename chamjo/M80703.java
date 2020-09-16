package chamjo;

public class M80703 {

	public static void main(String[] args) {
		//2차 배열 응용 // 마방진 프로그램 만들기
		int[][] ma=new int[3][3]; //3x3의 배열
		int row=0, col=0; //row은 행 col은 열
		int num=1;//배열에 들어갈 값
		//첫행의 중간
		col=ma[0].length/2;
		ma[row][col]=num; //※최초로 주소에 값을 넣어야함!!!!(내가 틀린부분)
		for(num=2; num<=ma[0].length*ma[0].length; num++) {
			//대각선 위로 올라가는 코딩
			row--;
			col++;
			//행과 열이 모두 존재하지 않는 경우
			if(row<0 && col==ma[0].length) { // 에러발생 많은 학생들이 틀림 
				//두 조건을 모두 충족해야하는 &&연산자의 조건문은 가장 먼저 써야함 
				row+=2;
				col--;
			}
			//행이 존재하지 않을 경우
			if(row<0) {
				//마지막행으로 이동
				row=ma[0].length-1;
			}
			//열이 존재하지 않을 경우
			if(col==ma[0].length) {
				//첫 열로 이동
				col=0;
			}
			//이미 값이 존재하는 경우
			if(ma[row][col]!=0) {
				//-1열 + 2행
				row+=2;
				col--;
			}
			ma[row][col]=num;
		}
		for(int a=0; a<ma[0].length; a++) {
			for(int b=0; b<ma[0].length; b++) {
				if(ma[a][b]<10) {   
					//십의 자리 값 때문에 출력 값이 밀리는 현상을 방지하기 위해 1의 자리 수에 띄어쓰기를 하나 더 넣어주는 조건문 
					System.out.print(" "+ma[a][b]+" ");	
				}else {
					System.out.print(ma[a][b]+" ");	
				}
			}
			System.out.println();
		}
		
	}

}
