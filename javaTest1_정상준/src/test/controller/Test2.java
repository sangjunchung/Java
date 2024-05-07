package test.controller;

public class Test2 {

	public static void main(String[] args) {
		
		for(int i=3; i<=5; i+=2) {
			for(int j=1; j<10; j+=2) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}
	}
}
