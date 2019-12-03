package selenium;
class Inheritencec {

	String mobile = "v5s";
	String companyName = "vivo";

	public void cameraFeature() {
		System.out.println("this is cameraFeature");
	}

	public void fingerTouchFeature() {
		System.out.println("this is fingertouch feature");
	}
}

class abcdsf extends Inheritencec {
	String mobile = "9lite";
	String companyName = "honor";

	public void display() {
		System.out.println(super.mobile);
		System.out.println(super.companyName);
		System.out.println(mobile);
		System.out.println(companyName);
		
		super.cameraFeature() ;
		cameraFeature();
	}
	
	public void cameraFeature() {
		System.out.println("this is cameraFeature in child class");
	}
	
	
	

}
public class Test {

	public static void main(String[] args) {
		abcdsf c = new abcdsf();
		c.display();
		
	}
}
