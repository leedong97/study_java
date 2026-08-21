package ex8_work;

import java.util.Random;

public class WorkMain_teacher {
    
    public static void main(String[] args) {
        
        int[] coin = { 500, 100, 50, 10 };
        int money = new Random().nextInt(500)+1;
        money *= 10;
        
        WorkSub_teacher ws = new WorkSub_teacher();
        ws.myCoin(coin,money);




    }
}
