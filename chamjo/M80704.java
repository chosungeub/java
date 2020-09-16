package chamjo;

public class M80704 {

	public static void main(String[] args) {
		//배열복사
		int[] num= {10,20,30};
		int[] newNum=new int[5];
		for(int i=0; i<num.length; i++) {
			newNum[i]=num[i];  
		}
		for(int i=0; i<newNum.length; i++) {
			System.out.print(newNum[i]+", ");
			//배열의 방은 아무것도 넣지 않으면 0이 들어간다.
		}
	}

}
