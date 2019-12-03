package selenium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class FrequencyOfCharacter {
	
	public static void main(String[] args) {
		
//	String s= "deepakkumargiridih";
//	int[] freq = new int[s.length()];
//	char[] st = s.toCharArray();
//	for (int i = 0; i< s.length();i++){
//		freq[i]= 1;
//		for (int j=i+1;j<s.length();j++){
//			if(st[i]==st[j]){
//				freq[i]++;
//				st[j]='0';
//			}
//		for (int ik =0;ik<freq.length;ik++){
//			if(st[i] != ' ' && st[i] != '0')  {
//			System.out.println(st[i] + "-" + freq[i]);
//		}
//		}	
//		}
//	}
		
	     
//	        String str = "picture perfect";  
//	        int[] freq = new int[str.length()];  
//	        int i, j;  
//	          
//	        //Converts given string into character array  
//	        char string[] = str.toCharArray();  
//	          
//	        for(i = 0; i <str.length(); i++) {  
//	            freq[i] = 1;  
//	            for(j = i+1; j <str.length(); j++) {  
//	                if(string[i] == string[j]) {  
//	                    freq[i]++;  
//	                      
//	                    //Set string[j] to 0 to avoid printing visited character  
//	                    string[j] = '0';  
//	                }  
//	            }  
//	        }  
//	          
//	        //Displays the each character and their corresponding frequency  
//	        System.out.println("Characters and their corresponding frequencies");  
//	        for(i = 0; i <freq.length; i++) {  
//	            if(string[i] != ' ' && string[i] != '0')  
//	                System.out.println(string[i] + "-" + freq[i]);  
//	        }  
		
		

		String s = "kavya eaning in crores";
		char[] c = s.trim().toCharArray();
		//System.out.println(c);
		int flag=0;
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		LinkedHashMap<Character, Integer> tm = new LinkedHashMap<Character, Integer>();
		for (char c1 : c) {
			if (tm.containsKey(c1)) {
				tm.put(c1, tm.get(c1) + 1);
				if ((tm.get(c1) > 1)) {
					System.out.println(c1);
					}
				else if(tm.get(c1) == 1){
					System.out.println(c1);
				
			} else {
				tm.put(c1, 1);
			}

		}
	}
       
	
	
	}}
