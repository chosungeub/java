package chamjo;

public class M80608 {

	public static void main(String[] args) {
		//숫자는 같냐고 물어볼때 == 쓰고 같지 않을때 !=를 쓴다.
		//그러나 문자는 .equals()로 같은지 물어본다. 같지 않냐일때는 맨 앞에 !붙이기
		//문자를==로 비교할때는 true가 나오는 것은 참조영역(주소)이 같기 때문
		String str1="korea";
		String str2="korea";
		if(str1.equals(str2)) { //if(!str1.equals(str2)) 같지않다.
			System.out.println("두 문자가 같음");
			
		}else {
			System.out.println("두 문자가 다름");
			
		}
		
	}

}
