package com.chaerin.s5.ex1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

   public static void main(String[] args) {
      System.out.println("클라이언트입니다");
      Socket socket=null;
      Scanner sc = new Scanner (System.in);
      try {
       socket = new Socket("192.168.45.209", 8282);
         System.out.println("서버 접속 성공!");
         System.out.println("서버로 보낼 메세지 입력");
         String message = sc.nextLine();
         System.out.println(message);
         
         //1. output stream을 구해오기
         OutputStream os = socket.getOutputStream();
         OutputStreamWriter ow = new OutputStreamWriter(os);
         BufferedWriter bw = new BufferedWriter(ow);
         //전송준비끝
         
         //전송
         bw.write(message+"\r\n");	//\r 커서를 앞으로 보내라, \n 줄바꿈 
         //강제로 버퍼 비우기
         bw.flush();
         
      } catch (Exception e) {

         e.printStackTrace();
      }

   }

}