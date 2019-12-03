package selenium;


class BankSbi{
	private long accountNo;
	private String nameOfAccountHolder;
	private String mailId;
	private int contactNo;
	
	
	public long getAccountNo(){
		return accountNo;
	}
	
	public String getnameOfAccountHolder(){
		return nameOfAccountHolder;
	}
	
	public int getcontactNo(){
		return contactNo;
	}
	
	public String getmailId(){
		return mailId;
	}
	
	public void setAccountNo(long accountNo){
		accountNo= accountNo;
	}
	
	public void setnameOfAccountHolder(String nameOfAccountHolder ){
		this.nameOfAccountHolder = nameOfAccountHolder;
	}
	
	public void setcontactNo(int contactNo){
		this.contactNo=contactNo;
	}
	
	public void setmailId(String mailId){
		this.mailId=mailId;
	}
	
	
	
}

public class EncapsulationExample {

	public static void main(String[] args) {
		
		BankSbi e = new BankSbi();
		e.setAccountNo(12344580L);
		e.setcontactNo(983939292);
		e.setnameOfAccountHolder("Deepak");
		e.setmailId("dblgrd@gmail.com");
		System.out.println(e.getAccountNo()+" "+ e.getnameOfAccountHolder() + " "+ e.getmailId() + " "+ e.getcontactNo());
	}
}
