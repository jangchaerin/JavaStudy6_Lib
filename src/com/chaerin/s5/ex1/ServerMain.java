package com.chaerin.s5.ex1;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("서버 입니다");
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			System.out.println("클라이언트 접속 기다리는중");
			serverSocket = new ServerSocket(8282);// 클라이언트와 접속준비
			socket = serverSocket.accept();// 클라이언트와 연결
			System.out.println("접속한 클라이언트와 1대1 연결 완료");
			
			InputStream is = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			String message = br.readLine();
			System.out.println("client : "+ message);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
