package chamjo;

public class Test08061 {

	public static void main(String[] args) {
		
		int num[]= {50,78,96,70,88,63,-1,74,88,90};
		// �� -1�� ������ ������ �迭�� ���� ���Ͽ��� // �´´�
		int sum=0;
		int i=0;
		while (num[i]>0) {
			sum+=num[i];
			i++;
		} 
		System.out.println("-1�� ������ �������� �迭�� ���� " + sum + "�Դϴ�.");
	}

}
