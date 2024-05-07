
import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		int line;
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("별 그리기입니다. 원하는 Line을 홀수로 입력해 주세요 : ");
		line = sc.nextInt();
		
		while(check) {
			int blink = line / 2;
			int change = line / 2;
			int star = 1;
			int lineManage = 0;	
			
			if(line % 2 == 0) {
				System.out.println("입력하신 수는 짝수 입니다. 종료합니다.");
				break;
			}
			else {
		
				for(int i=0; i<line; i++) {
			
					for(int j=0; j<blink; j++) System.out.print("☆");
					for(int j=0; j<star; j++) System.out.print("★");
					for(int j=0; j<blink; j++) System.out.print("☆");
			
					System.out.println();
			
					if(lineManage < change) {
						star += 2;
						blink -= 1;
					}
					else{
						star -= 2;
						blink += 1;
					}
			
					lineManage += 1;
				}
			if(star != 1) star = 1;
			check = false;
			}
		}
		sc.close();
	}
}
