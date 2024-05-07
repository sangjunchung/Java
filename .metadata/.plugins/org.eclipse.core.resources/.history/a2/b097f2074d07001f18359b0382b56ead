package ncs.test10;

public class BookStore {

	public static void main(String[] args) {
		Book bookdata;
		BookUpdate bookupdate;
		
		bookdata = new Book("컴퓨터", "HTML5", 30000, 15);
		System.out.println("기본 정보");
		bookdata.bookInfo();
		
		bookupdate = new BookUpdate(new Book("컴퓨터", "HTML5", 30000, 15));
		bookupdate.updataBookPrice();
		
		System.out.println("변경된 정보");
		bookupdate.getBookData().bookInfo();
	}

}
