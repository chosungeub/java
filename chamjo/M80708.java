package chamjo;

public class M80708 {

	public static void main(String[] args) {
		//��2 ���� �˰���2 //**����ǥ**//1�� �̿��� -99�� 2�� �̿�ǥ -90�� . . . . .
		int[] num= {86,99,80,70,63};
		String[] name= {"��ö��", "�̿���", "ȫ�浿","����ȣ","�̿�ǥ"};
		int temp;
		String temp2;
		for(int a=0; a<num.length-1; a++) {
			for(int b=a+1; b<num.length; b++) {
				if(num[a] < num[b]) {
					temp=num[a];
					temp2=name[a];
					num[a]=num[b];
					name[a]=name[b];
					num[b]=temp;
					name[b]=temp2;
				}
			}
		}
		System.out.println("**����ǥ**");
		for(int i=0; i<num.length; i++) {
			System.out.println((i+1)+"�� "+name[i]+" -"+num[i]+"�� ");
		}		
		
	}

}
