package selenium;


	
class A{  
	protected void msg(){
		 System.out.println("Hello java");}  
	}  
		  
		
public class AccessModifierExample extends A{  
	
		public void msg(){
			System.out.println("Hello java");
			}//C.T.Error  
		
		 public static void main(String args[]){  
			 AccessModifierExample obj=new AccessModifierExample();  
		   obj.msg();  
		   }  
		}  


