package selenium;

public class StringOperations {

	public static void main(String[] args) {
		
		
//		String demo = "Strings are immutable";
//		String demo1= "Strings are immutablf";
//		String demo2= "Strings are immutabld";
//		String demo3= "Strings are immutablE";
//		
//		
//		String s = new String(demo);
//		String s1 = new String(demo1);
//		String s2 = new String(demo2);
//		String s3 = new String(demo1);
//		System.out.println(s.charAt(3));
//		System.out.println(s.length());
//		System.out.println(s2.compareTo(demo1));
//		
//		//here lexicographically demo1 is greater that demo2 so we are getting negative value 
//		
//		System.out.println(s.compareToIgnoreCase(demo3));
//		System.out.println(s1.concat(s2));
//		System.out.println(s.hashCode());
//		System.out.println(s.indexOf('i'));
//		System.out.println(s.indexOf('m', 14));
//		demo = s.replace('m','k');
//		System.out.println(demo);
//		System.out.println(s);
		
//		String s = "sachin";
//		System.out.println(s.concat("tendulkar"));
//		System.out.println(s);
				//String s1 = new String("GFG"); //object for this will be in heap memory and pool 
		        String s1 = "GFG";
				//String s2 = s1.concat("GFG");  // object reflect to scp
		        String s3 = s1.intern(); 
		        //String s3 = "GFG";
		        System.out.println(s1 == s3);   
		        String s4 = "GFGGFG";
		        System.out.println(s1.equals(s3));  
		    }  
		}  



