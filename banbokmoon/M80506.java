package banbokmoon;

import java.util.Scanner;

public class M80506 {

	public static void main(String[] args) {
		// �ݺ��� ����5(���๮��) // ���ڸ� �Է��ϼ���? 3 // 3�� �Ҽ��Դϴ�.
		System.out.println("���ڸ� �Է��ϼ���?");
		Scanner sc = new Scanner(System.in);
		int dan=sc.nextInt();
		String memo="�Ҽ� �Դϴ�.";
		int i;
		for(i=2; i<=9; i++) {
			if(!(dan==i) && dan%i==0) {
				memo="�Ҽ��� �ƴմϴ�.";
			}else if(dan%i==0 && dan%1==dan) {
				memo="�Ҽ� �Դϴ�.";
			}
		}
		System.out.println(memo); //�����̶�� ��.. 
	}

}
