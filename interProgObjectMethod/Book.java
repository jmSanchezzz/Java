package interProgObjectMethod;

public class Book {
	private String isbn;
	private String title;
	private Author author;
	private double price;
	private int qty = 0;
	public Book(String isbn,String title,Author author,double price,int qty) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public Author getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Book sbn=" + isbn + ", Title=" + title + ", Author name=" + author.getName() + ", email="+author.getEmail() +", price=" + price + ", qty=" + qty+"]";
	}
	

}
