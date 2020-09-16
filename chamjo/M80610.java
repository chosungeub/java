package chamjo;

public class M80610 {

	public static void main(String[] args) {
		//new 리터럴로 새 주소를 갖게된 String은 각각 다른 주소로 인식되어 
		// ==로 비교될때 두 문자가 다름이 나옴
		// 즉, 다른집에 살고있는 또 다른 김철수 2명
		String str1=new String("김철수"); 
		String str2=new String("김철수");
		//if(str1.equals(str2))로 비교하면 주소안에 있는 값 끼리 비교되어 두 문자가 같음으로 나온다.
		if(str1==str2) { 
			System.out.println("두 문자가 같음");
			
		}else {
			System.out.println("두 문자가 다름");
			
		}
		
	}

}
