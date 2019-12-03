package selenium;

public class ToggleAndReverseToggle {
	
	
	//Write a java program to tOGGLE each word in string? Ex. this is javatpoint->tHIS iS jAVATPOINT
	
	public static void main(String[] args) throws InterruptedException{
		
		long startTime = System.currentTimeMillis();
		System.out.println(ToggleClass.ToggleMethod("my name is deepak"));
		long endTimeOfToggle = System.currentTimeMillis();
		long totalExecutionTime = endTimeOfToggle - startTime ;
		System.out.println(totalExecutionTime);
		System.out.println(ToggleClass.ReverseToggleMethod("my name is deepak"));
		long endTimeOfRevreseToggle = System.currentTimeMillis();
		Thread.sleep(10);
		long totalExecutionTimeofReverseToggle = endTimeOfRevreseToggle - totalExecutionTime ;
		System.out.println(totalExecutionTimeofReverseToggle);
		
		
	}

}

class ToggleClass{
	
	public static String ToggleMethod(String str){
		String arr[]= str.split("\\s");
		String FinalString ="";
		for (String i :arr){
			
			String First =i.substring(0,1);
			String SecondOnwards = i.substring(1);
			FinalString+= First.toLowerCase()+SecondOnwards.toUpperCase()+ " ";
		}
		return FinalString;
		
	}
	
	public static String ReverseToggleMethod(String str){
		String arr[]= str.split("\\s");
		String FinalString ="";
		for (String i :arr){
			StringBuilder sb = new StringBuilder(i);
			sb.reverse();
			//String First =i.substring(0,1);
			//String SecondOnwards = i.substring(1);
			//FinalString+= First.toLowerCase()+SecondOnwards.toUpperCase()+ " ";
			
			String First = sb.substring(0,1).toString();
			String SecondOnwards = sb.substring(1).toString();
			FinalString += First.toLowerCase()+ SecondOnwards.toUpperCase()+ " ";
		}
		return FinalString;
		
	}
	
	
	
}
