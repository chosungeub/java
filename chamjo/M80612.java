package chamjo;

public class M80612 {

	public static void main(String[] args) {
		//�迭 (�ſ��߿� -> if�� �������� �߿�) : ���̵��� ���� ���α׷� ȿ�������� �ۼ�����
		//�������� ����1
		/* int kor,eng,mat,kor; //������
		int tot;
		kor=80;
		eng=70;
		mat=75;
		kor=96;
		tot=kor+eng+mat+kor;
		System.out.println("����= " + kor);
		System.out.println("����= " + eng);
		System.out.println("����= " + mat);
		System.out.println("����= " + kor);
		System.out.println("����= " + tot);
		 �ϳ��� ������ �ϳ��� ���� ����Ǵ� �⺻Ÿ�� */
		//�迭�� �ϳ��� �����ҿ� �������� ���� ������ �� �ִ�. //�̸��� �ϳ��� ���� ������
	
		int score[]=new int[4]; //new�� ���Ӱ� �����ϰڴٴ� �ǹ� []���� ���� �迭�� ����
		int tot;
		score[0]=70; //[]�ε���
		score[1]=85;
		score[2]=90;
		score[3]=80;
		tot=score[0]+score[1]+score[2]+score[3];
		System.out.println("����= " + score[0]);
		System.out.println("����= " + score[1]);
		System.out.println("����= " + score[2]);
		System.out.println("����= " + score[3]);
		System.out.println("����= " + tot);
		//�迭�� ����
		//1. 
	}

}
