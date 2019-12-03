package selenium;

class reverseOperation {

	public static String reverseString(String s) {
		String newString = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			newString = newString + s.charAt(i);
		}
		return newString;

	}

	public static String reverseEachWord(String s) {
		String newString = "";
		String[] a = s.split("\\s");
		for (String i : a) {
			StringBuilder sb = new StringBuilder(i);
			newString = newString + sb.reverse() + " ";
		}
		return newString;
	}

	public static boolean verifyIsPallindrome(String s) {
		StringBuilder sb = new StringBuilder(s);
		if (s.equals(sb.reverse().toString())) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean verifyIsFullStringPallindrome(String s) {
		StringBuilder sb = new StringBuilder(s);
		
		if (s.trim().equals(sb.reverse().toString().trim())) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean verifyIsPallindromeWithoutReverse(String s) {
		boolean myFlag = false;
		if (s.length() % 2 == 0) {
			for (int i = 0, j = s.length() - 1; i <= s.length() && j >= 0; i++, j--) {
				if (s.charAt(i) == s.charAt(j)) {
					myFlag = true;
				}
				else{
					myFlag = false;
				}
			}

		} else {
			for (int i = 0, j = s.length() - 1; i <= s.length() && j >= 0; i++, j--) {
				int n = s.length() / 2 + 1;
				if (i == n) {
					continue;
				} else if (s.charAt(i) == s.charAt(j)) {
					myFlag = true;
				}
				else{
					myFlag = false;
				}
			}
		}
		return myFlag;
	}
	
	public static String toggleFirstLetterNew(String s){
		
		String[] arr = s.split("\\s");
		String NewWord = "";
		for (String i: arr){
			String FirstChar = i.substring(0,1);
			String RestChar = i.substring(1);
			System.out.print(FirstChar);
			System.out.println(RestChar);
			NewWord += FirstChar.toUpperCase()+ RestChar.toLowerCase()+ " ";
		}
		return NewWord;
		
		
	}
	
}



public class StringOccurence {

	public static void main(String[] args) {

		//System.out.println(reverseOperation.reverseString("my name is deepak"));
		//System.out.println(reverseOperation.reverseEachWord("my name is deepak"));
		//System.out.println(reverseOperation.verifyIsPallindrome("madam"));
		//System.out.println(reverseOperation.verifyIsFullStringPallindrome("step on  no    pets "));
		//System.out.println(reverseOperation.verifyIsPallindromeWithoutReverse("madam"));
		System.out.println(reverseOperation.toggleFirstLetterNew("my name is deepak"));
		
		

	}
}


