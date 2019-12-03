package selenium;

public class CapitalizeFirstChar {
	
	public static void main(String[] args){
		
		System.out.println(stringAlteration.changeCase("my name is khusi"));
		
		
}}

class stringAlteration{
	
	public static String changeCase(String Str)
	{
	
	String arr[] = Str.split("\\s");
	String Final = "";
	for(String i:arr){
	String first= i.substring(0,1);
	String restAfterFirst = i.substring(1);
	Final+=first.toUpperCase()+restAfterFirst+" ";
	
	}
	return Final.trim();
	
	
	}
}
