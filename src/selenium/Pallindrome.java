package selenium;

public class Pallindrome extends ReverseFirstWord {
	
	public static void main(String[] args){
		
		
		System.out.println(StringInput.ispallindrome("nitin"));
		System.out.println(StringInput.ispallindrome("kabutar"));
	}
	

}

class StringInput{
	
	public static boolean ispallindrome(String str)
	{
	StringBuilder sb = new StringBuilder(str);
	//System.out.println(sb.reverse());
	String newStr =sb.reverse().toString();
	if (newStr==str){
		
		return true;
	}
	else if (newStr.equals(str))
	{
		System.out.println("here equal method is working");
		return true;
	}
	
	
	else{
		return false;
	}
}}
