package chamjo;

public class M80701 {

	public static void main(String[] args) {
		//다차원 배열: []이 2개 이상
		//(복습)스텍에 값이 있는것이 원시형, 스텍에 주소가 있는것이 참조형, 참조형에서 실제 값이 들어있는 장소를 힙(heap)이라고 한다.
		//그러나 힙에 주소가 있기도 하다.
		int[][] num=new int[2][3]; //int[][] num=new int[행][열];
		num[0][0]=10;
		num[0][1]=20;
		num[0][2]=30;
		num[1][0]=40;
		num[1][1]=50;
		num[1][2]=60;
		for(int a=0; a<num.length; a++) {
			for(int b=0; b<num[0].length; b++) {
				System.out.print(num[a][b]+"  ");

			}
			System.out.println();
		}
		
	}

}
