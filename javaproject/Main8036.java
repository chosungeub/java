package javaproject;

import java.util.Scanner;

public class Main8036 {

	public static void main(String[] args) {
		// ���м�����? 85 // �������? 70 // ��ô�ȸ ���� �����մϴ�. 
		// ��. �����̳� ������� 80�� �̻��̸� ��ô�ȸ ���� �����մϴ�. ��� ������� �׷��� ������ ������ȸ�� ��ٸ����� �������
		System.out.print("���м�����?");
		Scanner sc = new Scanner(System.in);
		int ma=sc.nextInt();
		System.out.print("�������?");
		int en=sc.nextInt();
		//����: String result;
		if(ma>=80 || en>=80) {
			System.out.println("��ô�ȸ ���� �����մϴ�."); //����: result="��ô�ȸ ���� �����մϴ�.";
		}else {
			System.out.println("���� ��ȸ�� ��ٸ�����.");	  //����: result="���� ��ȸ�� ��ٸ�����.";	
		}
		//����: System.out.println(result);
	}

}
