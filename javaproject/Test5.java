package javaproject;

public class Test5 {

	public static void main(String[] args) {
		//����: ���� �ݾ��� int amount=38562; 
		//���: ����=3��, ��õ��=1��, õ��=3��, �����=1��, ���=0��, �ʿ�=6��, �Ͽ�=2��
		
		int amount = 38562;
		int gm = amount/10000;
		int ym = amount%10000/5000;
		int rm = amount%10000%5000/1000;
		int coin500m = amount%10000%5000%1000/500;
		int coin100m = amount%10000%5000%1000%500/100;
		int coin10m = amount%10000%5000%1000%500%100/10;
		int coin1m = amount%10000%5000%1000%500%100%50%10;
		System.out.println("����� " + "������ " + gm + "��" + " ��õ���� " + ym + "��" + " õ���� " + rm + "��" + " ������� " + coin500m + "��" + " ����� " + coin100m + "��" + " �ʿ��� " + coin10m + "��" + " �Ͽ��� " + coin1m + "��");
		

	}

}
