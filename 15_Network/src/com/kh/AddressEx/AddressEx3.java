package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressEx3 {

	public static void main(String[] args) {
		try {
			InetAddress addressName = InetAddress.getByName("www.google.com");

			// getByName 은 영어주소와 숫자주소를 한 번에 가져옴
			System.out.println("getByName으로 구글을 가져온 이름 : " + addressName);

			// getLocalHost 를 이용해서 내 집 주소를 가져오고 집 주소에 대한 상세 정보 확인
			// 내 집주소에 대한 영어 주소 이름 내 컴퓨터 숫자 주소
			InetAddress myAddress = InetAddress.getLocalHost();
			System.out.println("내 IP 주소 : " + myAddress);

			// 멀티캐스트 주소 여부 확인
			// 한 컴퓨터에서 2개 이상의 컴퓨터로 동시에 파일 전송하는 방법
			
			System.out.println(myAddress.isMulticastAddress());
			
			// byte[] 주소를 활용한 객체 가져오기
			// 루프백 주소 현재 컴퓨터 자체를 가리키고 외부 연결을 하지 않고 내 컴퓨터 사용
			byte[] ipAddress = { 127, 0, 0, 1 };
			InetAddress byAddress = InetAddress.getByAddress(ipAddress);
			System.out.println(byAddress);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}