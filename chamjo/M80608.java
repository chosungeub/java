package chamjo;

public class M80608 {

	public static void main(String[] args) {
		//���ڴ� ���İ� ����� == ���� ���� ������ !=�� ����.
		//�׷��� ���ڴ� .equals()�� ������ �����. ���� �ʳ��϶��� �� �տ� !���̱�
		//���ڸ�==�� ���Ҷ��� true�� ������ ���� ��������(�ּ�)�� ���� ����
		String str1="korea";
		String str2="korea";
		if(str1.equals(str2)) { //if(!str1.equals(str2)) �����ʴ�.
			System.out.println("�� ���ڰ� ����");
			
		}else {
			System.out.println("�� ���ڰ� �ٸ�");
			
		}
		
	}

}
