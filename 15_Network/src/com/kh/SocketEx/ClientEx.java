package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientEx {

	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost", 12348);
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

			// 서버로 메세지 전송
			out.println("hi server!");

			// 서버로부터 받은 메세지 수신 및 출력
			String messageOut; // = in.readLine();
			
			// for, while 문 사용해서 출력을 확인
			// 클라이언트는 서버가 읽을 때까지 여러번 메세지를 다시 보내서 출력해볼수 있음
			while ((messageOut = in.readLine()) != null) {
				System.out.println("send success : " + messageOut);
			}

			// 닫는 순서 문자 읽기 -> 쓰기 -> 소켓
			in.close();
			out.close();
			client.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
