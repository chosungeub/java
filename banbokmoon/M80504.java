package banbokmoon;

public class M80504 {

	public static void main(String[] args) {
		// �ݺ��� ����3 // 1���� �� ���� ���ؾ߸� 3750�� �������?
		int i; //i�� for�������� ����Ǿ��ٸ� ��¹��� i�� ����� �� ���� ������ i�� ���� �����Ѵ�.
		int sum=0;
		for(i=1; i<=100; i++) { //����� ���� Ÿ�Ա��� �ٽ� �Ἥ ������ �ʿ����. int i =1(x)
			sum+=i;
			if(sum>3750) {
				break;
			}
		}
		System.out.println("1����" + i + "���� ���ؾ߸� 3750�� �ѽ��ϴ�");
		}

}
