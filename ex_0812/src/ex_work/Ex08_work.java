package ex_work;

import java.util.Random;

public class Ex08_work {
    public static void main(String[] args) {
        
        //변수 money에 10 ~ 5000 사이의 난수를 발생시킨다
        // 단 발생한 난수 moeny는 1의 자리가 반드시 0이 되도록 한다
        // money를 최소한의 동전으로 몇 개씩 거슬러 지는지 출력
        // -----------------------------------------------
        // 금액 : 2590( 랜덤으로 나옴+1의자리는 반드시 0)
        // 500원 : 5
        // 50원 : 1
        // 10원 : 4






        Random random = new Random();
        int[] coin = {500, 100, 50, 10};

        int money = new Random().nextInt(500)+1;
        money *=10;

        System.out.println("금액: "+ money);

        for(int i =0; i<coin.length; i++){

            int res = money / coin[i];
            if(res >0){
                System.out.printf("%d원 : %d개\n",coin[i], res);
                money %= coin[i];
            }

        }//for







        // int num = random.nextInt(4990)+10;
        
        
        // int a =0;
        // //500원짜리
        // int b= 0;
        // // 100원짜리
        // int c= 0;
        // // 10원짜리
        // if(num%10==0){
        //    a= num/coin[0];
        //    b= (num-a*500)/coin[1];
        //    c= (num-a*500-b*100)/coin[3];
        // }
        // System.out.println("금액: "+num);
        // System.out.println("500원: "+a);
        // System.out.println("100원: "+b);
        // System.out.println("10원: "+c);
     

    }//main
}
