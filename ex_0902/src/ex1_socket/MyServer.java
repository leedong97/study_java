package ex1_socket;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {

    ServerSocket ss;

    public MyServer() {

        try {

            // 서버소켓을 생성할 때 서비스를 위한 포트번호를 지정
            ss = new ServerSocket(3000);
            System.out.println("서버 준비 완료");

        } catch (Exception e) {

        }

    }// 생성자

    @Override
    public void run() {
        while (true) {

            try{
            Socket s =ss.accept();//접속자의 정보를 받는다

            // 접속한 클라이언트의 ip정보 가져오기
            // 접속한 환경의 접속한 유저의 ip정보를 가져온다
            String ip = s.getInetAddress().getHostAddress();

            System.out.println(ip+ "님 다녀감");

            }catch(Exception e){

            }
        } // while
    }
}
