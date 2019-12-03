package selenium;

class TestPercentage{
	
	public static  void checkPercentageOfCharactersMethod(String s){
		
		int lowerCase = 0, upperCase = 0, digit = 0, others = 0;
		double lowerCasePercentage=0, upperCasePercentage=0, digitPercentage=0,othersPercentage=0;
		for (int i=0; i<=s.length()-1;i++){
		char c = s.charAt(i);
		if (Character.isLowerCase(c)){
			lowerCase++;
		}
		else if (Character.isUpperCase(c)){
			upperCase++;
		}
		else if (Character.isLowerCase(c)){
			lowerCase++;
		}
		else if (Character.isDigit(c)){
			digit++;
		}
		else{
			others++;
		}	
	}
		System.out.println(lowerCasePercentage=(lowerCase*100)/s.length());
		System.out.println(upperCasePercentage=(upperCase*100)/s.length());
		System.out.println(digitPercentage=(digit*100)/s.length());
		System.out.println(othersPercentage=(others*100)/s.length());
	
		
}}

public class checkPercentageOfCharacters {
	public static void main(String[] args) {
		TestPercentage.checkPercentageOfCharactersMethod("deepakkkk999999999999999&1736snYUBTD09");		
	}	
}
