package selenium;

class AnotherDemo {
	public NewDemo AnotherDemoMethod() {
		System.out.println("AnotherDemoMethod");
		return new NewDemo();
	}
}

class NewDemo {
	void NewDemoMethod() {
		System.out.println("NewDemoMethod");
	}

}

public class MethodChaining {

	public AnotherDemo DemoMethod() {
		System.out.println("DemoMethod");
		return new AnotherDemo();
	}

	public static void main(String[] args) {

		MethodChaining DemoObject = new MethodChaining();
		AnotherDemo AnotherDemoObject = DemoObject.DemoMethod();
		NewDemo NewDemoObject = AnotherDemoObject.AnotherDemoMethod();
		NewDemoObject.NewDemoMethod();

		// method chaining
		MethodChaining DemoObject1 = new MethodChaining();
		DemoObject1.DemoMethod().AnotherDemoMethod().NewDemoMethod(); // Method
																		// chaining

	}
}
