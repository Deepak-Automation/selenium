package selenium;

public class UseOfSuperKeyword{

	public static void main(String[] args) {

		ChildClass childObj = new ChildClass();
		ChildClass childObjParam = new ChildClass(19,"ram");
		
	}
}

class ParentClass {

	int roll=10;
	String name="kavya";
	
	ParentClass() {
		System.out.println("This is default constructor in parent class");
	}

	ParentClass(int roll, String name) {
		//name = this.name;
		//roll = this.roll;
		System.out.println("This is parametrized constructor in parent class");
	}

//	int test1(int a, int b) {
//
//		int c = a + b;
//		System.out.println("this is add method in parent class");
//		return c;
//	}
}

class ChildClass extends ParentClass  {
	
	
	int roll=122;
	String name="deepak";

	ChildClass() {
		super();
		System.out.println("this is default constructor in child class");
	}

	ChildClass(int roll, String name) {
		name = this.name;
		roll = this.roll;
		System.out.println("this is parameterized constructor in child class");
		System.out.println(name);
		System.out.println(roll);
		System.out.println("i am printing name and roll of  parameterized constructor in child class");
	}

//	int test1(int a, int b) {
//
//		super.test1(a, b);
//		int c = a * b;
//		System.out.println("this is multiply method in child class");
//		return c;
//	}
}
