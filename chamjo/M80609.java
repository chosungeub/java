package chamjo;

public class M80609 {

	public static void main(String[] args) {
		//new 리터럴로 새 주소를 갖게된 String은 각각 다른 주소로 인식되어 
		// ==로 비교될때 두 문자가 다름이 나옴
		String str1=new String("korea"); 
		String str2=new String("korea");
		if(str1==str2) { 
			System.out.println("두 문자가 같음");
			
		}else {
			System.out.println("두 문자가 다름");
			
		}
		
	}

}
