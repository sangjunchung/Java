import java.util.Scanner;

public class VariableScan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[][] info = new String[2][6];
		
		System.out.println("사용자의 이름을 입력하세요.");
		String name = sc.nextLine(); //nextLine : 문자 또는 엔터를 치기 전까지의 문장 전체를 가져옴
		
		System.out.println("사용자의 사는 곳을 입력하세요.");
		String live = sc.nextLine();
	
		System.out.println("사용자의 핸드폰 번호를 입력하세요.");
		String phoneNumber = sc.nextLine();
		
		System.out.println("사용자의 키를 입력하세요.");
		String height = sc.nextLine();
		
		System.out.println("사용자의 나이를 입력하세요.");
		String age = sc.nextLine();
			
		System.out.println("사용자의 닉네임을 입력하세요.");
		String nickname = sc.nextLine();

		sc.close();
		
		info[0][0] = "이름";
		info[0][1] = "사는 곳";
		info[0][2] = "휴대폰 번호";
		info[0][3] = "키";
		info[0][4] = "나이";
		info[0][5] = "닉네임";
		
		info[1][0] = name;
		info[1][1] = live;
		info[1][2] = phoneNumber;
		info[1][3] = height;
		info[1][4] = age;
		info[1][5] = nickname;
		
		System.out.println();
		
		for(int j=0; j<info[1].length; j++) {
			System.out.println(info[0][j]+" : "+info[1][j]);
		}
		
		
	}

}
