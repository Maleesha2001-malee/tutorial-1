class LibraryMember{
	private String memberId;
	private String name;
	
	public LibraryMember(String memberId,String name){
		this.memberId=memberId;
		this.name=name;
	}
	
	public void dispalyMemberDetails(){
		System.out.println("Member ID:" +memberId);
		System.out.println("Name: " +name);
	}
}