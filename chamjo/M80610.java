package chamjo;

public class M80610 {

	public static void main(String[] args) {
		//new ���ͷ��� �� �ּҸ� ���Ե� String�� ���� �ٸ� �ּҷ� �νĵǾ� 
		// ==�� �񱳵ɶ� �� ���ڰ� �ٸ��� ����
		// ��, �ٸ����� ����ִ� �� �ٸ� ��ö�� 2��
		String str1=new String("��ö��"); 
		String str2=new String("��ö��");
		//if(str1.equals(str2))�� ���ϸ� �ּҾȿ� �ִ� �� ���� �񱳵Ǿ� �� ���ڰ� �������� ���´�.
		if(str1==str2) { 
			System.out.println("�� ���ڰ� ����");
			
		}else {
			System.out.println("�� ���ڰ� �ٸ�");
			
		}
		
	}

}
