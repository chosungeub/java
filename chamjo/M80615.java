package chamjo;

public class M80615 {

	public static void main(String[] args) {
		//�迭�� ���� 1_1
		//�迭�� '���� Ÿ��'�� �����͸� ���ӵ� ������ �����ϴ� �ڷᱸ��
		int score[]= {70, 85, 90, 80, 70, 96, 88}; 
		int tot=0;
		double avg;
		for (int i=0; i<score.length; i++) { 
		//score.length�̶� �迭�� ũ�� (int score[]=new int[7]); //�ݺ������� ����
		tot+=score[i]; //0~6 �ε����� ���� tot�� ���ϴ� ���� �ݺ��ϴ� �ڵ�
		}
		System.out.println("����= " + tot);
		avg=tot/(double)score.length;
		System.out.println("���= " + (int)(avg*100)/100.0);
		// casting�� �̿��� �Ҽ��� �ڸ����� �����ϴ� ��
	}

}
