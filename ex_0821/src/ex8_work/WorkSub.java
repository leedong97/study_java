package ex8_work;

public class WorkSub {
    
    public int change(int[] coin,int money){

        int a= 0;
        int b= 0;
        for(int i= 0; i<coin.length; i++){
            a=money/coin[i];
            b=money%coin[i];

            System.out.println("500원: "+a);
            System.out.println();




        }

    }
}
