package selenium;

//import java.util.ArrayList;
//import java.util.List;
//
//public class addition {
//	
//	public static void main(String[] args) {
//	
//		domor();
//	}
//	
//	public static void domor() {
//		
//		
//		throw new ArithmeticException();
//	}
//	
//}


//class Vehicle{  
//	  //defining a method  
//	  void run(){System.out.println("Vehicle is running");}  
//	}  
//	//Creating a child class  
//	class Bike2 extends Vehicle{  
//	  //defining the same method as in the parent class  
//	  void run(){System.out.println("Bike is running safely");}  
//	  
//	  public static void main(String args[]){  
//		  Vehicle obj = new Bike2();//creating object  Cha
//	  obj.run();//calling method  
//	  }  
//	}  
//	
//	

class addition {

	public static void main(String[] args) {
		String n = "";
		int num = 0;
		String s = "AS2GD314Uus";
		char[] s1 = s.toCharArray();
		for (char c : s1) {
			if (Character.isDigit(c)) {
				n+=c;
				int a= Integer.parseInt(n);
				num = num+ a;
				n="";
			}
		}
		
		
		System.out.println(num);
	}
}
	