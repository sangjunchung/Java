package ncs.test8;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("호스트명 또는 도메인명 입력 : ");
		String host = sc.nextLine();
		
		try {
			InetAddress[] ipAr = InetAddress.getAllByName(host);
			
			System.out.println(host+"는 "+ipAr.length+"개의 IP주소를 가지고 있습니다.");
			for(int i =0; i<ipAr.length; i++) {
				System.out.println((i+1)+"번 IP = "+ipAr[i]);
			}
		} catch (UnknownHostException e) {
			System.out.println("잘못된 호스트를 입력하셨습니다.");
		}
		sc.close();
	}
}
