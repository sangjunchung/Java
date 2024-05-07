package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// port 2자리 3자리 4자리는 컴퓨터에서 약속으로 사용한다고 지정한 숫자
public class ServerPre {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(12370);

			Socket client = server.accept();

			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			PrintWriter out = new PrintWriter(client.getOutputStream(), true);

			String message;

			while ((message = in.readLine()) != null) {
				System.out.println("send : " + message);
				out.println("success : "+message);
			}
			
			in.close();
			out.close();
			client.close();
			server.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
