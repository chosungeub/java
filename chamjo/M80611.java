package chamjo;

public class M80611 {

	public static void main(String[] args) {
		String str1=new String("김철수"); // str1,str2는 다른주소 다른 객체 같은 값
		String str2=new String("김철수"); 
		String str3="김철수"; //str3,4는 주소가 같은 같은 객체 같은 값
		String str4="김철수";
		if(str1==str2) { 
			System.out.println("두 문자가 같음");
			
		}else {
			System.out.println("두 문자가 다름");
			
		}
		
	}

}
