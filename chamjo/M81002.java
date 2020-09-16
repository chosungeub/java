package chamjo;

import java.util.Calendar;

public class M81002 {

	public static void main(String[] args) {
		// 열거타입2
		Week today=Week.SUNDAY;
		System.out.println("오늘은 "+today.name()+"입니다.");
		System.out.println("오늘은 "+today.ordinal()+"입니다.");
		//today.name() 열거형 상수인 문자열을 리턴해줍니다.
		//today.ordinal() 만들어진 열거형 상수에는 위치 값이 있는데, 그 위치값을 돌려줍니다.
		Week day1=Week.MONDAY;
		Week day2=Week.WEDESDAY;
		System.out.println(day1.compareTo(day2));
		//day1.compareTo(day2) 는 앞에 있는 day1의 위치 값과 뒤에 있는 day2의 위치 값의 차를 구합니다.
		//결과는 -2 
		Week weekDay=Week.valueOf("SUNDAY"); 
		//Week.valueOf("SUNDAY") Week열거 안에 있는 가로안의 같은 값을 찾아 돌려준다.
		System.out.println(weekDay);
		Week[] days=Week.values(); //Week열거 안에 있는 모든 값을 days참조변수에 넣는다.
		for(Week day:days) { //Week day 참조변수에 days의 참조변수 안에 있는 값을 대조하여 일치하는 것 있다면 참
			System.out.println(day);//참 값일 때마다 day 출력
		}
		
	}

}
