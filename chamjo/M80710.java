package chamjo;

public class M80710 {

	public static void main(String[] args) {
		//**����ǥ**
		//����=?? // ���=??.?
		int scores[]= {96,75,88,87,70};
		int sum=0;
		double avg;
		for(int i=0; i<scores.length; i++) {
			sum +=scores[i];
		}
		avg=(double)sum/scores.length;
		System.out.println("**����ǥ**");
		System.out.println("����= "+sum);
		System.out.printf("���=%2.1f",avg); //Ư���� ���˱�ȣ "%2.1f" + "\n"(�ٹٲ�)
		//"%2.1f" -> %�� ���ı�ȣ f�� �Ǽ��� ǥ���϶��� 2�� �Ҽ����� ������ ���� ��(�Ҽ��̻��� �˾Ƽ� ä����) .1�� �Ҽ��� �ڸ���
		//System.out.println("���= "+(int)(avg*10)/10.0);	
	}

}
