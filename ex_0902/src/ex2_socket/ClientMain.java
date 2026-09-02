package ex2_socket;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        PrintWriter pw =null;
        Socket s = null;

        try{
        

            while(true){

                System.out.println("입력: ");
                String msg = sc.nextLine();
                s = new Socket("192.168.0.31",3000);
                //키보드에서 받은 문자열을 서버로 보낸다
                pw = new PrintWriter(s.getOutputStream());
                // pw.write(msg);
                pw.println(msg);

                pw.flush();

            }//while

        }catch(Exception e){

        }finally{

            try{

                if(pw != null) pw.close();
                if( s!= null) s.close();

            }catch(Exception e){

            }
        }
    }
}
