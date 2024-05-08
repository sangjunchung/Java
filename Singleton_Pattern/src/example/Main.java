package example;

public class Main {

	public static void main(String[] args) {
		SingletonLogger sgl = SingletonLogger.getInstance();
		
		System.out.println(sgl);
		System.out.println(SingletonLogger.getInstance());
		
		sgl.logInfo("This is an info message");
	}
}
