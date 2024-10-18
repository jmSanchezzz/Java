package interProgObjectMethod;
public class BookTest {

	public static void main(String[] args) {
		
     Author author = new Author("Marcus Laurence","marcus@pogi.com");
     System.out.println(author);
     author.setEmail("marcuslaurence@pogi.com");
     System.out.println(author);
     System.out.println();
     Book book = new Book("0061964360","Intermediate Programming using Java",author,3200.25,120);
     System.out.println(book);
     book.setPrice(4675.75);
     book.setQty(180);
     System.out.println(book);
     System.out.println();
     System.out.println("ISBN: "+book.getIsbn());
     System.out.println("Title: "+book.getTitle());
     System.out.println("Price: "+book.getPrice());
     System.out.println("Quantity: "+book.getQty()+" pcs");
     System.out.println("Author: "+author);
     System.out.println("Author's Name: "+author.getName());
     System.out.println("Author's Email: "+author.getEmail());
	}
}
