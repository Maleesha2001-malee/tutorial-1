class ChatGPT{
	public static void main(String args[]){
		Book b1= new Book("The Catcher in the Rye","B001","J.D.Salinger",240);
		Book b2= new Book("To Kill a Mockingbird","B002","Harper Lee",281);
		Book b3= new Book("1984","B003","George Orwell",328);
		Book b4= new Book("Pride and Prejudice","B004","Jane Austen",432);
		Book b5= new Book("The Hobbit","B005","J.R.R.Tolkien",320);
		
		b1.checkOut();
		b1.checkIn();
		
		System.out.println("Books:");
		Book books[]=new Book[5];
		books[0]=b1;
		books[1]=b2;
		books[2]=b3;
		books[3]=b4;
		books[4]=b5;
		for(Book book: books){
			book.displayItemDetails();
			}
			
		Magazine m1=new Magazine("National Geographic","M001","August 2023","National Geographic Society");
		Magazine m2=new Magazine("Time","M002","September 2023","Time USA,LLC");
		Magazine m3=new Magazine("Forbes","M003","June 2023","Forbes Media");
		Magazine m4=new Magazine("vogue","M004","July 2023","Conde Nast");
		Magazine m5=new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");
		
		System.out.println("Magazines:");
		Magazine magazines[]=new Magazine[5];
		magazines[0]=m1;
		magazines[1]=m2;
		magazines[2]=m3;
		magazines[3]=m4;
		magazines[4]=m5;
		for(Magazine magazine:magazines){
			magazine.displayItemDetails();
		}
		
		
		LibraryMember l1=new LibraryMember("L001","John Doe");
		LibraryMember l2=new LibraryMember("L002","Jane Smith");
		LibraryMember l3=new LibraryMember("L003","David Johnson");
		LibraryMember l4=new LibraryMember("L004","Sarah Williams");
		LibraryMember l5=new LibraryMember("L005","Michael Brown");
		
		System.out.println("Library Members:");
		LibraryMember libraryMembers[]=new LibraryMember[5];
	    libraryMembers[0]=l1;
		libraryMembers[1]=l2;
		libraryMembers[2]=l3;
		libraryMembers[3]=l4;
		libraryMembers[4]=l5;
		for(LibraryMember libraryMember:libraryMembers){
			libraryMember.dispalyMemberDetails();
		}
	}
}