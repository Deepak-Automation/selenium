package selenium;

class Demo1Overlodding{
	
	public int addNum(int a, int b){
		int c = a + b;
		return c;
	}
	
	public int addNum(int a, int b, int c){
		
		int d= a+b+c;
		return d;
	}
		
	public int MulNum(int a, int b){
			
			int d= a*b;
			return d;
			}
}

class Demo2OverRidding extends Demo1Overlodding{
	

	public int addNum (int a, int b){
		int c= a-b;
		return c;
	}
	
	public float MulNum(int a, float b, int c){
		
		float d= a*b*c;
		return d;

	}
}

public class MethodOverloadingAndRidding {

	public static void main(String[] args) {
		
		Demo2OverRidding poly = new Demo2OverRidding();
		int addoftwo= poly.addNum(100, 50);
		int addofthree = poly.addNum(100,50,57);
		System.out.println("Sum of two integer values :"+ addoftwo );
		System.out.println("Sum of two integer values :"+ addofthree );		
			
	}	
}

