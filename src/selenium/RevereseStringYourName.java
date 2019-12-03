package selenium;

class Test31 {
	public static String reverseMyName(String myName) {
		String vacant = "";
		for (int i = myName.length() - 1; i >= 0; i--) {
			vacant = vacant + myName.charAt(i);
		}
		return vacant;
	}


	public static int secondLargestInteger(){
		int[] a= {1,22,32,12,28};
		int temp;
		for(int i=0; i<=a.length-1;i++){
			for (int j=1;j<=a.length-1;j++){
				if(a[i]>a[j])
			}
		}
		
	}
}

public class RevereseStringYourName {

	public static void main(String[] args) {
		System.out.println(Test31.reverseMyName("deepak"));

	}

}
