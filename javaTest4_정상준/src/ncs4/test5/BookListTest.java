package ncs4.test5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookListTest {

	public void storeList(List<Book> list) {
		list.add(new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15));
		list.add(new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2));
		list.add(new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1));
	}
	
	public void saveFile(List<Book> list) {
		File file = new File("book.dat");
		
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(list);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Book> loadFile(){
		List<Book> books = new ArrayList<>();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.dat"));
			books = (List<Book>) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}
	
	public void printList(List<Book> list) {
		for(Book b : list) {
			System.out.println(b.toString());
			System.out.println("할인된 가격 : "+(int)(b.getPrice()*(1-b.getDiscountRate()))+"원");
		}
	}
	
	public static void main(String[] args) {
		BookListTest test5 = new BookListTest();
		ArrayList<Book> list = new ArrayList<>();
		
		test5.storeList(list);
		test5.saveFile(list);
		
		List<Book> bookList = test5.loadFile();
		test5.printList(bookList);
	}

}
