package chamjo;

public class M80603 {

	public static void main(String[] args) {
		// 134p 3������
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) sum+=i; //���๮�� �� �� �϶� ��� ó�� ���� �� �ٷ� ó��(�ܴ��������϶�=�������ʿ������)
		}
		System.out.println("3�� ����� ��= "+sum);
	}

}
