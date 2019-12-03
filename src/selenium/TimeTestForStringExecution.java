package selenium;

class Test1 {

	public String concatWithStringLiteral() {
		String s1 = "java";
		for (int i = 0; i < 10000; i++) {
			s1 = s1 + "Development";

		}
		return s1;
	}

	public String concatWithoutStringLiteral() {

		StringBuilder sb = new StringBuilder("java");
		for (int i = 0; i < 10000; i++) {
			sb.append("development");

		}
		return sb.toString();
	}

}

public class TimeTestForStringExecution {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		long startTime = System.currentTimeMillis();
		t1.concatWithStringLiteral();
		System.out.println(System.currentTimeMillis() - startTime);
		long newStartTime = System.currentTimeMillis();
		t1.concatWithoutStringLiteral();
		System.out.println(System.currentTimeMillis() - newStartTime);

	}

}


