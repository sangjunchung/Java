package ncs.test7;

public class BookTest {

	public static void main(String[] args) {
		Book[] bookArray = new Book[5];
		bookArray[0] = new Book("IT", "SQL Plus", 50000, 5);
		bookArray[1] = new Book("IT", "Java 2.0", 40000, 3);
		bookArray[2] = new Book("IT", "JSP Servlet", 60000, 6);
		bookArray[3] = new Book("Nobel", "davincicode", 30000, 10);
		bookArray[4] = new Book("Nobel", "cloven hoof", 50000, 15);

		double sum = 0.0;

		for (Book b : bookArray) {
			System.out.println(b.toString());
			sum += b.getBookPrice();
		}
		System.out.println();
		System.out.println("책 가격의 합 : " + sum + "원");
	}
}
