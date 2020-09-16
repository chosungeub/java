package chamjo;

public class M80702 {

	public static void main(String[] args) {
		//다차원 배열의 초기값설정
		int[][] num= {{10,20,30},{40,50,60}}; 
		for(int a=0; a<num.length; a++) {
			for(int b=0; b<num[0].length; b++) {
				System.out.print(num[a][b]+"  ");

			}
			System.out.println();
		}
		
	}

}
