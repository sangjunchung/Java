package example2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

enum Category{
	TECH, SPORTS, POLITICS, HEALTH
}

interface Subscriber{
	void update(String articleTitle);
}

interface Blog{
	void addObserver(Category category, Subscriber subscriber);
	void removeObserver(Category category, Subscriber subcriber);
	void notifySubscriber(Category category, String articleTitle);
	void writeArticle(String articleTitle, List<Category> categories);
}

class BlogSite implements Blog {
	private Map<Category, List<Subscriber>> map = new HashMap<>();

	@Override
	public void addObserver(Category category, Subscriber subscriber) {
		map.computeIfAbsent(category,V -> new ArrayList<>()).add(subscriber);
	}
	
	@Override
	public void removeObserver(Category category, Subscriber subcriber) {
		map.getOrDefault(category, new ArrayList<>()).remove(subcriber);
	}

	@Override
	public void notifySubscriber(Category category, String articleTitle) {
		List<Subscriber> list = map.getOrDefault(category, new ArrayList<>());
		for(Subscriber s: list) {
			s.update(articleTitle);
		}
	}

	@Override
	public void writeArticle(String articleTitle, List<Category> categories) {
		for(Category ca : categories) {
			notifySubscriber(ca, articleTitle);
		}
	}
}

class User implements Subscriber {
	private String name;
	
	public User(String name) {
		this.name = name;
	}

	@Override
	public void update(String articleTitle) {
		System.out.println(name+"님, 새로운 글이 작성되었습니다 : "+articleTitle);
	}	
}

public class BlogApplication {
	public static void main(String[] args) {
		BlogSite blog = new BlogSite();
		
		User u1 = new User("동그라미");
		User u2 = new User("김세모");
		
		blog.addObserver(Category.TECH, u1);
		blog.addObserver(Category.SPORTS, u1);
		blog.addObserver(Category.TECH, u2);
		
		List<Category> listc = new ArrayList<>();
		listc.add(Category.TECH);
		listc.add(Category.POLITICS);
		listc.add(Category.SPORTS);
		blog.writeArticle("옵저버", listc);
	}
}
