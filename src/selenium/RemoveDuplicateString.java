package selenium;

class DuplicateString{
	
	public static String RemoveDuplicateStringMethod(String s){
		String s1= s.replaceAll("\\s", "");
		return s1;
	}
	
	public static String RemoveDuplicateStringMethodWithoutReplace(String s){
		char[] s2 = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i= 0; i<=s.length()-1;i++){
			if(s2[i] != ' '){
				sb.append(s2[i]);
			} 
		}
		return sb.toString();
		
		
		}

}


public class RemoveDuplicateString {
	public static void main(String[] args) {
		System.out.println(DuplicateString.RemoveDuplicateStringMethod("my name is deepak"));
		System.out.println(DuplicateString.RemoveDuplicateStringMethodWithoutReplace("my name is deepak"));
	}

}
