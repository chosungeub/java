package chamjo;

public class M80705 {

	public static void main(String[] args) {
		//문자열 배열복사
		String[] str= {"자바","안드로이드","아두이노"};
		String[] newStr=new String[5];
		for(int i=0; i<str.length; i++) {
			newStr[i]=str[i];  
			//0816 알아낸 사실 대입연산자로 null값은 입력되지 않는다.
			//for(int i=0; i<newStr.length; i++)으로 조건을 걸자 오류남
		}
		for(int i=0; i<newStr.length; i++) {
			System.out.print(newStr[i]+", ");
			//문자열 배열의 방은 아무것도 넣지 않으면 null이 들어간다.
		}
	}

}
