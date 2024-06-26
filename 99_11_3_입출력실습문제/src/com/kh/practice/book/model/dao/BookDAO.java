package com.kh.practice.book.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.kh.practice.book.model.vo.Book;

public class BookDAO implements Serializable {

	private Book[] bArr = new Book[10];

	public void fileSave(Book[] bArr) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Book.txt"));
			oos.writeObject(bArr);
			oos.close();
			System.out.println("성공적으로 저장되었습니다.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Book[] fileRead() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Book.txt"));
			bArr = (Book[]) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bArr;
	}
}
