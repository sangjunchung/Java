package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
IP 주소 : 컴퓨터에서 네트워크에 특정 장치를 확인하는데 사용하는 숫자 

가장 기본 주소 
local host = 192.168.0.1 = 루프백 = 127.0.0.1

port = 네트워크에서 데이터를 주고 받을 수 있는 장소
타인의 컴퓨터나 도메인, 또는 특정 위치에 들어갈수 있는 번호 2자리 ~ 4자리

InetAddress : Java에서 IP 주소를 나타내는데 사용
	호스트명과 IP주소간의 변환, 집주인에 대한 정보 검색 등을 가능하게 해줌
	
메서드
getByName(String 호스트) : host 명에 대한 정보를 반환
getHostName() : host 명을 가져옴
getHostAddress() : IP 주소를 가져옴

호스트명 : www.google.com
IP 주소 : 142.251.130.4

영어로 된 이름 주소와 숫자로 된 주소가 다른 사람이 검색했을 경우와 내가 검색했을 때 숫자 주소가 
다르게 나ㅗㅇ는 경우는 영어로 된 이름 주소 주인이 진짜 본인의 실제 숫자 주소를 보호하기 위해
임시로 보여주는 숫자 주소이기 때문에 개인이 다르게 보여지는 것임
*/

public class AddressEx {

	public static void main(String[] args) {
		// 1. naver 에 대해 알아보기
		try {
			InetAddress address = InetAddress.getByName("www.naver.com");
			System.out.println("호스트명 : " + address.getHostName());
			System.out.println("IP 주소 : " + address.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		// 2. daum 에 대해 알아보기
		try {
			InetAddress address = InetAddress.getByName("www.daum.net");
			System.out.println("호스트명 : " + address.getHostName());
			System.out.println("IP 주소 : " + address.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		// 3. IP 주소로 daum.net 검색하기
		try {
			InetAddress daumIP = InetAddress.getByName("121.53.105.193");
			System.out.println("호스트명 : " + daumIP.getHostName());
			System.out.println("IP 주소 : " + daumIP.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
