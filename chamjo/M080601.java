package chamjo;

public class M080601 {

	public static void main(String[] args) {
		// 교 134p 2번문제 해설
		char fruit='A'; //소문자 a로 변수값을 바꾸면 default값인 알 수 없습니다.가 나온다.
		switch(fruit) {
			case 'A':
			//case 'a':  ->이렇게 case를 넣어주면 해당 문자가 모두 "사과"로인식
				System.out.println("사과");
				break;
			case 'B':
			//case 'b':
				System.out.println("바나나");
				break;
			case 'K':
			//case 'k':
				System.out.println("키위");
				break;
			default:
				System.out.println("알수 없습니다.");
		}

	}

}
