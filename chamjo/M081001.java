package chamjo;

import java.util.Calendar;

public class M081001 {

	public static void main(String[] args) {
		// ����Ÿ�� (���־��̴� ���� �ƴ�)// new->Enum
		Week today=null;
		Calendar cal=Calendar.getInstance(); //��¥�� �޴� ������ Ÿ���� Calender 
		int week=cal.get(Calendar.DAY_OF_WEEK); 
		//DAY_OF_WEEK ���Ͽ� ���� ���ڸ� ������ �Ͽ���->1, �����->7
		//Calendar.getInstance ���� ��¥�� �ҷ���
		switch(week) {
		case 1:
			today=Week.SUNDAY;
			break;
		case 2:
			today=Week.MONDAY;
			break;
		case 3:
			today=Week.TUESDAY;
			break;
		case 4:
			today=Week.WEDESDAY;
			break;
		case 5:
			today=Week.THURSDAY;
			break;
		case 6:
			today=Week.FRIDAY;
			break;
		case 7:
			today=Week.SATURDAY;
			break;
		}
		System.out.println("������ "+today+"�Դϴ�.");
		if(today==Week.SUNDAY) {
			System.out.println("������ ������ ��̰� �����ϴ�.");
		}else {
			System.out.println("������ �ڹٰ��θ� �մϴ�.");
		}

	}

}
