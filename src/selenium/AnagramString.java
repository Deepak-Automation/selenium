package selenium;

import java.util.Arrays;

class TestAnagram {

	private static Object d;

	public static boolean AnagramMethod(String str1, String str2) {

		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		char[] a = s1.toLowerCase().toCharArray();
		char[] b = s2.toLowerCase().toCharArray();
		Arrays.sort(b);
		System.out.println(a);
		boolean status = true;
	
		
		if (s1.length() != s2.length()) {
			status = false;
			System.out.println("length is not same");
		} 
		else {
			if (Arrays.equals(a, b)){
			status = true;
			System.out.println(s1 + " and " + s2 +" are anagram");
			} 
			else {
			status = false;
			System.out.println(s1 + " and " + s2 +" are not anagram");
			}}
		return status;
	
}}

public class AnagramString {
	
	public static void main(String[] args) {
		
		TestAnagram.AnagramMethod("Mothzr in Ljaw", "Hitler Woman");
	}

}
