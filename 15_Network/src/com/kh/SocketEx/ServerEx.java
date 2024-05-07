package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		// 서버는 나의 IP 주소와 접근 경로(포트반호) 생성

		// 서버 측의 포트 번호를 지정해서 ServerSocket 생성

		try {
			ServerSocket server = new ServerSocket(12348);
			System.out.println("party chat open");

			// 서버에 접근하는 클라이언트의 연결을 수락
			Socket client = server.accept();
			System.out.println("client success");
			
			// 서버와 통신을 하기 위한 입출력 스트림 생성
			// 1. client.getInputStream() : 클라이언트가 작성한 데이터를 읽어오기 위한 입력 스트림을 가져옴(숫자 값으로 가져옴)
			// 2. InputStreamReader() : 하나씩 된 단어들을 숫자에서 문자로 변환하는데 사용
			// 3. BufferedReader() : 하나씩 된 데이터를 한 번에 가져오고 읽을 수 있도록 도와줌
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

			// 작성한 내용을 눈으로 볼 수 있게 내보내는 역활을 하고, 눈으로 읽을 수 있게 도와줌
			// 1. client.getOutputStream(), true : 참가자가 작성한 내용을 내보내기 위해 가져옴
			// true를 사용함으로써 내보내도 ok 라는 의미
			// 2. PrintWriter() : 텍스트를 출력하는데 불편함 없이 매끄럽게 출력할 수 있도록 도와줌
			// flush() : 강제로 출력하는 역활 <- true에 포함되어 있음
			PrintWriter out = new PrintWriter(client.getOutputStream(), true);

			// 클라이언트에게 받은 메세지 수신 및 출력
			String messageOut; // = in.readLine();

			while ((messageOut = in.readLine()) != null) {
				System.out.println("send success : " + messageOut);
				
				out.println("cccccc hhhhhh eeeee cccc kkk");
				out.println("cccccc hhhhhh eeeee cccc kkk");
			}

			client.close();
			server.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
