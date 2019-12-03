package selenium;

public class encapsulation {
	
	encapsulation()
	{
		System.out.println("default costructor");
	}
	
	{
		System.out.println("non static block");
	}
	
	
	static{
		
		System.out.println("this is static block");
	}
	
	
	public encapsulation(int a)
	{
		
		System.out.println("int constrauctor");
	}
	
	private encapsulation(String a)
	{
		this(8);
		System.out.println("string constructor");
		
	}
	
public static void main(String[] args) {  
   
	
	encapsulation e = new encapsulation("kavya");
	}

	
} 
 


