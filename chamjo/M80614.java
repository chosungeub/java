package chamjo;

public class M80614 {

	public static void main(String[] args) {
		//�迭�� ���� 1_1
		int score[]= {70, 85, 90, 80, 70, 96, 88}; 
		int tot=0;
		for (int i=0; i<score.length; i++) { 
		//score.length�̶� �迭�� ũ�� (int score[]=new int[7]);
		tot+=score[i]; //0~6 �ε����� ���� tot�� ���ϴ� ���� �ݺ��ϴ� �ڵ�
		}
		System.out.println("����= " + tot);
		System.out.println("���= " + tot/score.length);
		
	}

}
