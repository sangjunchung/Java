package ncs4.test3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) throws ParseException {
		Map<String, Inventory> map = new HashMap<>();
		map.put("삼성", new Inventory("삼성 갤럭시S7", new SimpleDateFormat("yyyy.MM.dd").parse("2016.03.15"), 30));
		map.put("LG", new Inventory("LG G5", new SimpleDateFormat("yyyy.MM.dd").parse("2016.02.25"), 20));
		map.put("애플", new Inventory("애플 아이패드Pro", new SimpleDateFormat("yyyy.MM.dd").parse("2016.01.23"), 15));
		
		for(Map.Entry<String, Inventory> e : map.entrySet()) {
			System.out.println(e.getValue());
		}
		
		Inventory[] inven = new Inventory[map.size()];
		int a = 0;
		for(Inventory in : map.values()) {
			inven[a++] = in;
		}
	
		Scanner sc = new Scanner(System.in);
		System.out.print("출고 수량 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("출고 수량 "+num+"개 적용시 ---------------------------------------------------------");
		for(int i =0; i<inven.length; i++) {
			inven[i].setGetDate(new Date());
			try {
				inven[i].setGetAmount(num);
				System.out.println(inven[i].toString());
				
			} catch (AmountNotEnough e1) {
				System.out.println(inven[i].getProductName()+" 의 재고가 부족합니다. 재고수량 확인하시기 바랍니다.");
			}
		}
		sc.close();
	}
}
