package chamjo;

public class M80703 {

	public static void main(String[] args) {
		//2�� �迭 ���� // ������ ���α׷� �����
		int[][] ma=new int[3][3]; //3x3�� �迭
		int row=0, col=0; //row�� �� col�� ��
		int num=1;//�迭�� �� ��
		//ù���� �߰�
		col=ma[0].length/2;
		ma[row][col]=num; //�����ʷ� �ּҿ� ���� �־����!!!!(���� Ʋ���κ�)
		for(num=2; num<=ma[0].length*ma[0].length; num++) {
			//�밢�� ���� �ö󰡴� �ڵ�
			row--;
			col++;
			//��� ���� ��� �������� �ʴ� ���
			if(row<0 && col==ma[0].length) { // �����߻� ���� �л����� Ʋ�� 
				//�� ������ ��� �����ؾ��ϴ� &&�������� ���ǹ��� ���� ���� ����� 
				row+=2;
				col--;
			}
			//���� �������� ���� ���
			if(row<0) {
				//������������ �̵�
				row=ma[0].length-1;
			}
			//���� �������� ���� ���
			if(col==ma[0].length) {
				//ù ���� �̵�
				col=0;
			}
			//�̹� ���� �����ϴ� ���
			if(ma[row][col]!=0) {
				//-1�� + 2��
				row+=2;
				col--;
			}
			ma[row][col]=num;
		}
		for(int a=0; a<ma[0].length; a++) {
			for(int b=0; b<ma[0].length; b++) {
				if(ma[a][b]<10) {   
					//���� �ڸ� �� ������ ��� ���� �и��� ������ �����ϱ� ���� 1�� �ڸ� ���� ���⸦ �ϳ� �� �־��ִ� ���ǹ� 
					System.out.print(" "+ma[a][b]+" ");	
				}else {
					System.out.print(ma[a][b]+" ");	
				}
			}
			System.out.println();
		}
		
	}

}
