package selenium;

public class ArrayOperations {

//	static void min(int arr[]) {
//		int min = arr[0];
//		for (int i = 1; i < arr.length; i++){
//			if (min < arr[i])
//				min = arr[i];
//		}
//		System.out.println(min);
//	}
//
//	public static void main(String args[]) {
//		int a[] = {  33,5,4,39};// declaring and initializing an array
//		min(a);// passing array to method
//
//	}
	
	
	public static void main(String[] args) {
		int a[] = new int[3];
		a[1]= 2;
		a[2]=3;
		a[0]=4;
		for(int i :a ){
			System.out.println(i);
		}
	}

}
