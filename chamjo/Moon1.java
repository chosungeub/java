package chamjo;

import java.util.Scanner;

public class Moon1 {

	public static void main(String[] args) {
		String pumArray[]= {"����","�����","�Ŷ��","����","������ġ"};
		int price[]= {2500,1200,1500,3000,3500};
		System.out.print("1.����  2.����� 3.�Ŷ�� 4.���� 5.������ġ(ǰ���ȣ�� �Է��Ͻÿ�)");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("���� ������?");
		int cnt=sc.nextInt();
		int totalPrice=0;
		//���⸦ �ϼ�
		totalPrice = cnt*price[num-1]; //���� 0813����: ���� ���� for���� ����ؼ� Ʋ�ȴ�. 
		//to me: �ּ����� ������ ���� ��Ÿ������ �����غ���
		System.out.println("������ " + pumArray[num-1] + "�� �� ����ݾ��� " + totalPrice + "�� �Դϴ�.");
		}
		//������ ������� �Ѱ���ݾ�= 3600�� �Դϴ�.
}
