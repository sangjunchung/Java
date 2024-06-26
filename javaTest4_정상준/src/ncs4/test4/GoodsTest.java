package ncs4.test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodsTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		Goods goods = null;

		try {
			System.out.println("다음 항목의 값을 입력하시오.");
			System.out.print("상품명 : ");
			String str = br.readLine();
			System.out.print("가격 : ");
			int a = Integer.parseInt(br.readLine());
			System.out.print("수량 : ");
			int b = Integer.parseInt(br.readLine());

			goods = new Goods(str, a, b);

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 	
		System.out.println();
		System.out.println("입력된 결과는 다음과 같습니다.");
		System.out.println(goods.toString());
		System.out.println("총 구매 가격 : " + (goods.getPrice() * goods.getQuantity()) + "원");
	}
}
