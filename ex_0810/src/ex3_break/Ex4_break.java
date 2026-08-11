package ex3_break;

import java.util.Scanner;

public class Ex4_break {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.print("입력 : ");
            int num = sc.nextInt();
            System.out.println("결과: "+num);

            if(num==3){
                System.out.println("이제야 정답을 입력했군~!");
                break; 
            }

        }//while








    }//main












}
