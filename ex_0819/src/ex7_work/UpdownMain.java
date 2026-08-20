package ex7_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {
    
    public static void main(String[] args) {
        
        // 1~50사이의 난수를 발생시키고
        // 키보드에서 입력받은 정수를 난수와 비교하기
        //-----------------------
        // 정수 : 30
        // DOWN
        // 정수 : 15
        // UP
        // 정수 : 25
        // 3회만에 정답입니다!!

        

        Scanner sc= new Scanner(System.in);
        int random = new Random().nextInt(50)+1;
        // UpdownSub sub = new UpdownSub();
        // System.out.println(random);
        // sub.result(random);
        UpdowSub2 sub2 = new UpdowSub2();
        System.out.println(random);

        //System.out.print("정수: ");
        //int num1 =sc.nextInt();
        int count =0;
        
       
       //int res=sub2.result2(random,num1,count);
        int res = 0;
        int num1=0;
       while(res!=2){
        System.out.print("정수: ");
        num1 =sc.nextInt();
        res=sub2.result2(random,num1,count);
        count++;
       }
        System.out.println(num1);
        
    }//main
}
