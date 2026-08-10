package ex2_random;

import java.util.Random;

public class Ex1_random {
    public static void main(String[] args) {
        
        // 216~ 1378사이의 난수
        int num = new Random().nextInt(1378-216+1) + 216;
        //위에 nextInt안에가 큰수 - 작은수 +1 이 공식이다.
        //new Random().nextInt(큰수 - 작은수 +1)+시작 수;    

        //new Random().nextInt(난수의 범위)+시작 수;    
        // int num = new Random().nextInt(8)+7;
        //  난수 시작수 7 , 난수의 범위 8 인 7~14의 난수
        // random을 자동완성으로 해야 위에 random이 임포트 된다.
        System.out.println(num);
        // 2~9 사이의 난수에 해당하는 구구단
        int num1 = new Random().nextInt(8)+2;

       
            for(int i=1; i<10 ; i++){
                
                System.out.println(num1+"*"+i+"="+num1*i);
            }
        
        


    }//main
}
