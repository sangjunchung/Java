package example;

import java.util.ArrayList;
import java.util.List;

interface StockMarket {
	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObserver(double price);
}

interface Observer {
	void update(double price);
}

class StockExchange implements StockMarket {
	private List<Observer> observers = new ArrayList<>();
	private double price;

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver(double price) {
		for (Observer observer : observers) {
			observer.update(price);
		}
	}

	public void updatePrice(double newPrice) {
		this.price = newPrice;
		notifyObserver(newPrice);
	}
}

class User implements Observer {
	private String name;

	public User(String name) {
		this.name = name;
	}

	@Override
	public void update(double price) {
		System.out.println(name + "님, 주식 가격이 변경되었습니다. 현재 가격 : $" + price);
	}
}

public class StockMarketDemo {

	public static void main(String[] args) {
		StockExchange stock = new StockExchange();

		User u1 = new User("고영희");
		User u2 = new User("박철진");
		stock.addObserver(u1);
		stock.addObserver(u2);
		
		stock.updatePrice(100);
		stock.updatePrice(105);
		
		stock.removeObserver(u2);
		stock.updatePrice(110);
	}

}
