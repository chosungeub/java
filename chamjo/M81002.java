package chamjo;

import java.util.Calendar;

public class M81002 {

	public static void main(String[] args) {
		// ����Ÿ��2
		Week today=Week.SUNDAY;
		System.out.println("������ "+today.name()+"�Դϴ�.");
		System.out.println("������ "+today.ordinal()+"�Դϴ�.");
		//today.name() ������ ����� ���ڿ��� �������ݴϴ�.
		//today.ordinal() ������� ������ ������� ��ġ ���� �ִµ�, �� ��ġ���� �����ݴϴ�.
		Week day1=Week.MONDAY;
		Week day2=Week.WEDESDAY;
		System.out.println(day1.compareTo(day2));
		//day1.compareTo(day2) �� �տ� �ִ� day1�� ��ġ ���� �ڿ� �ִ� day2�� ��ġ ���� ���� ���մϴ�.
		//����� -2 
		Week weekDay=Week.valueOf("SUNDAY"); 
		//Week.valueOf("SUNDAY") Week���� �ȿ� �ִ� ���ξ��� ���� ���� ã�� �����ش�.
		System.out.println(weekDay);
		Week[] days=Week.values(); //Week���� �ȿ� �ִ� ��� ���� days���������� �ִ´�.
		for(Week day:days) { //Week day ���������� days�� �������� �ȿ� �ִ� ���� �����Ͽ� ��ġ�ϴ� �� �ִٸ� ��
			System.out.println(day);//�� ���� ������ day ���
		}
		
	}

}
