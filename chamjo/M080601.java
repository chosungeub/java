package chamjo;

public class M080601 {

	public static void main(String[] args) {
		// �� 134p 2������ �ؼ�
		char fruit='A'; //�ҹ��� a�� �������� �ٲٸ� default���� �� �� �����ϴ�.�� ���´�.
		switch(fruit) {
			case 'A':
			//case 'a':  ->�̷��� case�� �־��ָ� �ش� ���ڰ� ��� "���"���ν�
				System.out.println("���");
				break;
			case 'B':
			//case 'b':
				System.out.println("�ٳ���");
				break;
			case 'K':
			//case 'k':
				System.out.println("Ű��");
				break;
			default:
				System.out.println("�˼� �����ϴ�.");
		}

	}

}
