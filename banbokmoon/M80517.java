package banbokmoon;

public class M80517 {

	public static void main(String[] args) {
		//continue�� Ȱ�� for���̳� while���� ���δ�.
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
			if(i%5==0) {
				continue; //true�� �� �ݺ����� Ż��(�����ΰ���)�Ͽ� 5�� ����� ������ 1~100�� ���� ��������.
			}
			sum+=i;
		}
		System.out.println(sum);
		
	}
}
