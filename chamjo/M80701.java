package chamjo;

public class M80701 {

	public static void main(String[] args) {
		//������ �迭: []�� 2�� �̻�
		//(����)���ؿ� ���� �ִ°��� ������, ���ؿ� �ּҰ� �ִ°��� ������, ���������� ���� ���� ����ִ� ��Ҹ� ��(heap)�̶�� �Ѵ�.
		//�׷��� ���� �ּҰ� �ֱ⵵ �ϴ�.
		int[][] num=new int[2][3]; //int[][] num=new int[��][��];
		num[0][0]=10;
		num[0][1]=20;
		num[0][2]=30;
		num[1][0]=40;
		num[1][1]=50;
		num[1][2]=60;
		for(int a=0; a<num.length; a++) {
			for(int b=0; b<num[0].length; b++) {
				System.out.print(num[a][b]+"  ");

			}
			System.out.println();
		}
		
	}

}
