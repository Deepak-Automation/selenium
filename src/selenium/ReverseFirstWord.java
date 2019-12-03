package selenium;

public class ReverseFirstWord {

	public static void main(String[] args) {
		System.out.print(TestReverseFirstWord.TestReverseFirstWordMethod("my name is deepak"));
		
	}

}

class TestReverseFirstWord {

	

	public static String TestReverseFirstWordMethod(String str) {

	String reverseString = "";
		String arr[] = str.split("\\s");
		for (String i : arr) {
			StringBuilder sb = new StringBuilder(i);
			sb.reverse();
			
			reverseString+=sb.toString()+ " ";
			
		}
		 return reverseString.trim();
	}

}






//
//
//public class ReverseFirstWord{
//	
//	public static void main(String[] args) {
//		
//		System.out.println(TestReverseword.reverseMethod("Deepak"));
//		
//	}
//
//}
//
//class TestReverseword{
//	
//	public static String reverseMethod(String s){
//		String newString="";
//		for (int i = s.length()-1;i >=0; i--){
//			newString = newString + s.charAt(i);
//		}
//		return newString;
//		
//	}
//	
//}
//
//
//
