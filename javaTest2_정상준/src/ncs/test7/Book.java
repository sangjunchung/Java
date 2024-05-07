package ncs.test7;

public class Book {
	private String category;
	private String bookName;
	private double bookPrice;
	private double bookDiscountRate;

	public void setCategory(String category) {
		this.category = category;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}

	public String getCategory() {
		return category;
	}

	public String getBookName() {
		return bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public Book() {

	}

	public Book(String inCategory, String inBookName, double inBookPrice, double inDiscount) {
		this.category = inCategory;
		this.bookName = inBookName;
		this.bookPrice = inBookPrice;
		this.bookDiscountRate = inDiscount;
	}

	public String toString() {
		return category + " " + bookName + " " + bookPrice + "원 " + bookDiscountRate + "%";
	}
}
