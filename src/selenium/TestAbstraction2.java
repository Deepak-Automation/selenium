package selenium;

abstract class MyBike{  
	   MyBike(){System.out.println("bike is created");}  
	   abstract void run();  
	   void changenewGear(){System.out.println("gear changed");}  
	 }  
	//Creating a Child class which inherits Abstract class  
	 class MyHonda extends MyBike{  
	 void run(){System.out.println("running safely..");}  
	 }  
	//Creating a Test class which calls abstract and non-abstract methods  
	class TestAbstraction2{  
	 public static void main(String args[]){  
	  MyBike obj= new MyHonda();  
	  obj.run();  
	  obj.changenewGear();  
	 }  
	}  
