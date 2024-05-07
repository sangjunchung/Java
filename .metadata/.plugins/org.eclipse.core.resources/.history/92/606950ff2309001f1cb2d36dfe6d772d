package ncs.test6;

public class Customer extends Thread  {
	private Data data;

	public Customer(Data data) {
		this.data = data;
	}

	@Override
	public void run(){
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("get value : "+data.getValue());
				System.out.println("값을 꺼냈습니다. value가 비었습니다.");
				sleep(1000);
			} catch (InterruptedException  e) {
				e.printStackTrace();
			} catch (EmptyException e) {
				e.printStackTrace();
			} 
		}
	}
}
