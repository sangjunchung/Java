package ncs.test10;

public class BookUpdate {
	private Book bookDate;

	public void setBookDate(Book bookDate) {
		this.bookDate = bookDate;
	}

	public Book getBookDate() {
		return bookDate;
	}

	public BookUpdate() {

	}

	public BookUpdate(Book inBook) {
		this.bookDate = inBook;
	}
	
	public Book getBookData() {
		return bookDate;
	}
	
	public void updataBookPrice() {
		bookDate.setBookPrice(bookDate.getBookPrice()*((100-bookDate.getBookDiscountRate())/100));
	}
}
