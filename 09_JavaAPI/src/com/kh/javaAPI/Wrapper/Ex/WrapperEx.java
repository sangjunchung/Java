package com.kh.javaAPI.Wrapper.Ex;

/*
Wrapper = 감싸다
기본데티어 타입 - primitive types
	기본 자료형 타입을 객체로 감싸서 사용할 수 있는 클래스
	기본으로 제공해주는 int, double, char, short, long, boolean, float, byte
	ArrayList 에서 부를 때 사용 많이함 
	
	Byte = byte
	Short = short
	Integer = int
	Long = long
	Float = float
	Double = double
	Character = char
	Boolean = boolean
*/

public class WrapperEx {

	public static void main(String[] args) {
		Byte bt = 10;
		byte rbt = bt.byteValue();
		System.out.println("바이트 값 : " + bt);
		System.out.println("기본 바이트 값 :" + rbt);
		
		Short st = 200;
		short rst = st.shortValue();
		System.out.println("쇼트 값 : "+st);
		System.out.println("기본 쇼트 값 : "+rst);
		
		Integer inte = 30000;
		int rinte = inte.intValue();
		System.out.println("인트 값 : "+inte);
		System.out.println("기본 인트 값 : "+rinte);
		
		Long lo = 400000l;
		long rlo = lo.longValue();
		System.out.println("롱 값 : "+lo);
		System.out.println("기본 롱 값 : "+rlo);
		
		Float flo = 5.55f; 
		float rflo = flo.floatValue();
		System.out.println("플롯 값 : "+flo);
		System.out.println("기본 플롯 값 : "+rflo);
		
		Double dou = 6.66;
		double rdou = dou.doubleValue();
		System.out.println("더블 값 : "+dou);
		System.out.println("기본 더블 값 : "+rdou);
		
		Character cha = 'A';
		char rcha = cha.charValue();
		System.out.println("캐릭터 값 : "+cha);
		System.out.println("기본 캐릭터 값 : "+rcha);
		
		Boolean bool = true;
		boolean rbool = bool.booleanValue();
		System.out.println("불리언 값 : "+bool);
		System.out.println("기본 불리언 값 : "+rbool);
	}
}
