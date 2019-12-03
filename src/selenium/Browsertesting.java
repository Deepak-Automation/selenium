package selenium;

public class Browsertesting {

	public static void myDetail(String a) {

		System.out.println("abc");

	}

	public int a=29;
	public int b=37;
		Browsertesting(int a, int b){
		
	    
		this.a=a;
		this.b=b;;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("this is constrctor");
		Browsertesting.myDetail("kavya", "deepak");
		System.out.println("this is after constructor");
	}

	public static void myDetail(String a, String b) {
		System.out.println("efg");
	}

	public static void main(String[] args) {
		
		Browsertesting a = new Browsertesting(56,34);
		Manid mani = new Manid();
		mani.myDetail("name");
		
		

	}

}

class Manid {

	public static void myDetail(String a) {

		System.out.println("qwreu");
	}
}
