package ncs.test3;

import java.util.Arrays;
import java.util.Comparator;

public class TvTest {

	public static void main(String[] args) {
		Tv[] tvArray = new Tv[3];
		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2000000, "3D TV");

		for (Tv t : tvArray) {
			System.out.println(t.toString());
		}
		
		Arrays.sort(tvArray, Comparator.comparing(Tv::getPrice));
		
		System.out.println("가격이 가장 비싼 제품 : "+tvArray[tvArray.length-1].getName());
		System.out.println("가격이 가장 저렴한 제품 : "+tvArray[0].getName());
	}
}
