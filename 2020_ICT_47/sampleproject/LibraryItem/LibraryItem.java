abstract class LibraryItem{
	private String title;
	private String itemId;
	private boolean checkedOut;
	
	public LibraryItem(String title,String itemId){
		this.title=title;
		this.itemId=itemId;
		this.checkedOut=false;
	}
	
	
   public void checkOut(){
		if(!checkedOut){
			checkedOut=true;
			System.out.println(title+" has been checked out.");
		}
		else{
			System.out.println(title+" is already checked out.");
		}
   }		
			
	public void checkIn(){
		if(checkedOut){
			checkedOut=false;
			System.out.println(title+" has been checked in.");
		}
		else{
			System.out.println(title+" is already checked in.");
		}
	}
			
	public void displayItemDetails(){
		System.out.println("Title: "+title);
		System.out.println("Item ID: "+itemId);
		
	}
		
}
	