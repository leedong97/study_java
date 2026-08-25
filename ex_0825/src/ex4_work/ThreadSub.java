package ex4_work;

import java.util.Scanner;

public class ThreadSub extends Thread {
    int num;
    public ThreadSub(int num){
        this.num = num;
    }
    @Override
    public void run() {
           
           for(int i =num; i>=0; i--){
            
            try{
                Thread.sleep(1000);               
                System.out.println(num);
                num--;
           }catch(Exception e){

           }


    }
}
}
