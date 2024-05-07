package ncs.test6;

public class Data {
	private int value;
	private boolean isEmpty = true;

	public Data() {

	}

	public synchronized void setValue(int value) {
		if (isEmpty == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.value = value;
		isEmpty = false;
		System.out.println("값이 입력되었습니다.");
		System.out.println("put value : " + value);

		notify();
	}

	public synchronized int getValue() throws EmptyException {
		if (isEmpty == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(value == 0) {
			throw new EmptyException("값이 비어있습니다.");
		}
		int a = value;
		value = 0;
		isEmpty = true;
		
		notify();
		
		return a;
	}
}
