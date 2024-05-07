package ncs.test2;

public class StringTest {

	public static void main(String[] args) {
		String str = "A, b, c, D, a, B, C, d, f, F";
		
		String[] st = str.split(", ");
		char[] data = new char[st.length];
		int count = 0;
		
		for(String s : st) {
			if(s.charAt(0) < 'a') {
				data[count] = s.charAt(0);
			}
			count++;
		}
		
		int num = 0;
		while(num < count) {
			if(data[num] == 0) {
				num++;
				continue;
			} else {
				System.out.println("data["+num+"] : "+data[num]);
			}
			num++;
		}
	}
}
