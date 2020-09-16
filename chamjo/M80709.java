package chamjo;

public class M80709 {

	public static void main(String[] args) {
		//문2 정렬 알고리즘2 //**성적표**//1등 이영희 -99점 2등 이영표 -90점 . . . . .
		int[] num= {86,99,80,70,63};
		int temp;
		for(int a=0; a<num.length-1; a++) {
			for(int b=a+1; b<num.length; b++) {
				if(num[a] < num[b]) {
					temp=num[a];
					num[a]=num[b];
					num[b]=temp;
				}
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}		
		
	}

}
