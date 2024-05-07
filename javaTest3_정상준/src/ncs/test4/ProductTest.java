package ncs.test4;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("개수 : ");
		int quan = sc.nextInt();

		Product pd = new Product(name, price, quan);

		System.out.println(pd.information());
		System.out.println("총 구매 가격 : " + (pd.getPrice() * pd.getQuantity()) + " 원");

		sc.close();
	}
}
