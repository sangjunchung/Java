package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {

	public static void main(String[] args) {

		try {
			InetAddress address = InetAddress.getByName("www.google.com");
			System.out.println("호스트명 : " + address.getHostName());
			System.out.println("IP 주소 : " + address.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		// 나의 컴퓨터 이름과 자리번호 확인하기
		try {
			InetAddress myCom = InetAddress.getLocalHost();
			System.out.println(myCom);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		// www.facebook.com 페이스북 호스트이름 호스트주소
		try {
			InetAddress facebook = InetAddress.getByName("www.facebook.com");
			System.out.println("페이스북 호스트명 : " + facebook.getHostName());
			System.out.println("페이스북 IP 주소 : " + facebook.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		// www.instagram.com 인스타그램 호스트이름 호스트주소
		try {
			InetAddress insta = InetAddress.getByName("www.instagram.com");
			System.out.println("인스타그램 호스트명 : " + insta.getHostName());
			System.out.println("인스타그램 IP 주소 : " + insta.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
