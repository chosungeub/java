package banbokmoon;

import java.util.Scanner;

public class M80506c {

	public static void main(String[] args) {
		// �ݺ��� ����5(���๮������) // ���ڸ� �Է��ϼ���? 3 // 3�� �Ҽ��Դϴ�.
		System.out.println("���ڸ� �Է��ϼ���?");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int i;
		for (i=2; i<=num-1; i++) {
			if(num%i==0) {
				break;
			}
		}
		if(num==i) {
			System.out.println("�Ҽ��Դϴ�.");
		}else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
	}

}
