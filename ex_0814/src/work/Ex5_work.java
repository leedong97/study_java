package work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {

        // 문장 : HelloWorld
        // 결과 : Hlool
        //  -> 내가 입력받은것중에서 홀수에 있는 값만 추출해서 뽑는다

        Scanner sc = new Scanner(System.in);
        System.out.print("문장: ");
        String s= sc.next();
        String r = "";
        
        for(int i=0; i<s.length();i++){
            if(i%2==0){
                r+= s.charAt(i);
            }
        }

        System.out.println("결과: "+ r);













    }//main
}
