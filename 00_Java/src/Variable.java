
public class Variable {

	public static void main(String[] args) {
		
		byte bte = 2;
		short shrt = 2;
		int nt = 2;
		long lng = 2;
		char myChar = 'A';
		String str1 = "와 드디어 문자다~~";
		
		String name = "정상준";
		String greeting = "안녕하세요.";
		String introduction = " 저는요. 수원에 사는 OOO 입니다.";
		String number = "111-2222-3333";
		String secret = "비밀";
		char bloodType = 79;
		
		float ff1 = 3.14f;
		float ff2 = 3.14F;
		double dd1 = 3.14;
		
		boolean isTrue = true;
		boolean isFalse = false;
		
		int num = 10;
		char ch = 90;
		String text = "Hello, World!";
		double d1 = 3.14;
		boolean isTrue2 = true;
		
		System.out.println(bte);
		System.out.println(shrt);
		System.out.println(nt);
		System.out.println(lng);
		System.out.println(myChar);
		System.out.println(str1);
		System.out.println(name);
		System.out.println();
		
		System.out.println(greeting + introduction);
		System.out.println("제 전화번호는 "+number+" 입니다.");
		System.out.println("제 주민번호는 "+secret+"입니다.");
		System.out.println("제 혈액형 "+bloodType+"형입니다.");
		System.out.println();
		
		System.out.println("ff1 은 : "+ff1+" 이다.");
		System.out.println("ff2 은 : "+ff2+" 이다.");
		System.out.println("dd1 은 : "+dd1+" 이다.");
		System.out.println();
		
		System.out.println("오늘 날씨는 "+isTrue);
		System.out.println("내일 날씨는 "+isFalse+ " ?");
		System.out.println();
		
		System.out.println("정수 num의 값 = "+num);
		System.out.println("문자 ch 의 값 = "+ch);
		System.out.println("문자열은 text = "+text);
		System.out.println(d1);
		System.out.println("isTrue2 = "+isTrue2);
		
		num = 20;
		System.out.println("정수 num의 값 = "+num);
		System.out.println();
		
		String name1 = "철수";
		String age = "19";
		
		System.out.println(name1+"는 "+age+"살이었다.");
		
		age = "20";
		
		System.out.println("그런데 24년이 되면서 "+age+"살이 되었다.");
		
		}
}
