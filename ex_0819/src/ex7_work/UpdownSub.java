package ex7_work;

import java.util.Scanner;

public class UpdownSub {
    
    public void result(int random){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수: ");
        int num1 =sc.nextInt();
        int count =0;

        while(true){
                count++;
            
            
            if(random> num1){
                System.out.println("up");
                System.out.print("정수: ");
                num1 =sc.nextInt();
                continue;
            }else if(random < num1){
                System.out.println("Down");
                System.out.print("정수: ");
                num1 =sc.nextInt();
                continue;
            }else{
                System.out.println(count+"회만에 정답입니다!!");
                break;

            }
            
            
            
        }
       
    }
}
