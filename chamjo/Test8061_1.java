package chamjo;

public class Test8061_1 {

	public static void main(String[] args) {
		
		int num[]= {50,78,96,70,88,63,-1,74,88,90};
		// �� -1�� ������ ������ �迭�� ���� ���Ͽ��� // ������ ����
		int sum=0;
		
		for (int i=0; i<num.length; i++) {
			if(num[i]==-1)break;
			sum+=num[i];
		} 
		System.out.println("-1�� ������ �������� �迭�� ���� " + sum + "�Դϴ�.");
	}

}
