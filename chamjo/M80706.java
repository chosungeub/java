package chamjo;

public class M80706 {

	public static void main(String[] args) {
		//��
		int a=10;
		int b=20;
		//���⸦ �ϼ��Ͻÿ�. �� ���� �ʿ����.
		//�ֿܼ� a=20, b=10
		int temp;
		temp=a; //������ �ϳ� �� �����Ͽ� ������ȯ������� ���� ��ȯ�Ѵ�.
		a=b;
		b=temp;	
		
		System.out.println("a="+a+",b="+b);
		
	}

}
