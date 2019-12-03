package selenium;

import java.util.Arrays;

public class FindDuplicateInArray {

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 5, 6,3, 7, 9 };
//		for (int i = 1; i < (a.length); i++) {
//			for (int j = 0; j < i; j++) {
//				if (a[i] == a[j]) {
//					System.out.println("duplicate available");
//					System.out.println(a[j]);
//					//continue;
//				}
//			}
//
//		}
		
		
		Arrays.sort(a);
		for (int i =0;i<(a.length)-1; i++){
			if (a[i]==a[i+1]){
				System.out.println(a[i]);
			}
		}
	}
}
