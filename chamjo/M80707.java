package chamjo;

public class M80707 {

	public static void main(String[] args) {
		//��2 �迭���縦 �̿��� (��Ʈ)���� (�� �˰���)
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
