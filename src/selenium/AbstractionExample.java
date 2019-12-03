//example of abstract class that have method body
package selenium;

 abstract class Bike11{
   Bike11(){System.out.println("bike is created");}
   abstract void run();
   void changeGear(){System.out.println("gear changed");}
 }

 class Honda extends Bike11{
 void run(){System.out.println("running safely..");}
 }
 class AbstractionExample{
 public static void main(String args[]){
  Bike11 obj = new Honda();
  obj.run();
  obj.changeGear();
 }
}
