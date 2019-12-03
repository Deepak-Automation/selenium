package selenium;

import java.io.InputStream;
import java.util.Scanner;


public class ReplacingCharctersAccordingToInput {
	
//	public static void main(String[] args) {
//		//Scanner scn = new Scanner(System.in);
//		//int inputOfNumber= scn.nextInt();
//		String s= "qwertyuiop";
//		StringBuffer s1 = new StringBuffer(s);
//		System.out.println(s1.toString());
//		System.out.println(s1.replace(1 ,4,"a"));
//		
//		
//	}
	
	public static void main(String[] args) {
		int low, high, i, j;
		int flag = 1;
		Scanner scn = new Scanner(System.in);
		low = scn.nextInt();
		high = scn.nextInt();
		for (i = low; i <= high; i++) {
			for(j=2;j<=low/2;j++){
				if (i%j==0){
					flag= 0;
					break;
				}
				}
				if(flag==1){
					System.out.println(low);
				}
			}
}}

