package chamjo;

public class M80704 {

	public static void main(String[] args) {
		//�迭����
		int[] num= {10,20,30};
		int[] newNum=new int[5];
		for(int i=0; i<num.length; i++) {
			newNum[i]=num[i];  
		}
		for(int i=0; i<newNum.length; i++) {
			System.out.print(newNum[i]+", ");
			//�迭�� ���� �ƹ��͵� ���� ������ 0�� ����.
		}
	}

}
