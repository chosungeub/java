package chamjo;

public class M80705 {

	public static void main(String[] args) {
		//���ڿ� �迭����
		String[] str= {"�ڹ�","�ȵ���̵�","�Ƶ��̳�"};
		String[] newStr=new String[5];
		for(int i=0; i<str.length; i++) {
			newStr[i]=str[i];  
			//0816 �˾Ƴ� ��� ���Կ����ڷ� null���� �Էµ��� �ʴ´�.
			//for(int i=0; i<newStr.length; i++)���� ������ ���� ������
		}
		for(int i=0; i<newStr.length; i++) {
			System.out.print(newStr[i]+", ");
			//���ڿ� �迭�� ���� �ƹ��͵� ���� ������ null�� ����.
		}
	}

}
