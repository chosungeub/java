package chamjo;

public class M80711 {

	public static void main(String[] args) {
		//���� for��
		int scores[]= {96,75,88,87,70};
		int sum=0;
		double avg;
		for(int score:scores) { 
		//int score: �� temp�� ����� �����Ѵ�. �ڵ����� �����ּҸ� �о� ���ο� ���� temp�� �����Ѵ�.
		//�� �̻� ������ ���� ���� �� �������´�. (�迭�� ���� ��밡���� ���� for��)
			sum +=score;
		}
		avg=(double)sum/scores.length;
		System.out.println("**����ǥ**");
		System.out.printf("����=%d\n", sum);
		System.out.printf("���=%2.1f",avg); 	
	}

}
