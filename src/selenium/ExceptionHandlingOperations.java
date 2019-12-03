package selenium;

public class ExceptionHandlingOperations extends NullPointerException {

	public static void main(String[] args) {
//		doStuff();
//
//	}
//	
//	public static void doStuff(){
//		doMoreStuff();
//
//	}
//	
//	public static void doMoreStuff(){
//		
//		
//		throw new ArithmeticException();
//		System.out.println("hello");
//	}

		
		
		System.out.println("hello this is the first statement befoe exception");
		try{
			
		System.out.println(10/2);
		}
		catch(ArithmeticException e){
			System.out.println(10/2);
			
		}
		try{
			throw new ExceptionHandlingOperations();
		}
		catch(NullPointerException e){
			System.out.println("this is nullpointer");
		}
		finally{
			System.out.println("this is the last statemnet used in finally");
		}
}}
