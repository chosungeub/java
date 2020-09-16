package chamjo;

import java.util.Calendar;

public class M081001 {

	public static void main(String[] args) {
		// 열거타입 (자주쓰이는 것은 아님)// new->Enum
		Week today=null;
		Calendar cal=Calendar.getInstance(); //날짜를 받는 내부적 타입인 Calender 
		int week=cal.get(Calendar.DAY_OF_WEEK); 
		//DAY_OF_WEEK 요일에 따라 숫자를 돌려줌 일요일->1, 토요일->7
		//Calendar.getInstance 오늘 날짜를 불러옴
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
		System.out.println("오늘은 "+today+"입니다.");
		if(today==Week.SUNDAY) {
			System.out.println("가족과 휴일을 즐겁게 보냅니다.");
		}else {
			System.out.println("열심히 자바공부를 합니다.");
		}

	}

}
