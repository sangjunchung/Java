package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientPre {

	public static void main(String[] args) {
		Socket socket;
		try {
			socket = new Socket("localhost", 12370);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

			out.println("hi server!");
			
			String message;

			while ((message = in.readLine()) != null) {
				System.out.println("send : " + message);
				out.println("success : "+message);
			}
			
			in.close();
			out.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
