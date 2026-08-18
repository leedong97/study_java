package work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        
        //키보드에서 입력받은 ox값을 계산하여 출력하기
        //------------------------------
        // 입력:ooxxo
        //     -> 12001
        // 결과 : 4

        Scanner sc= new Scanner(System.in);
        System.out.print("입력: ");
        String s = sc.next();
        int count = 0;
        int value = 0;
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)=='o'){
                value++;
                count += value;
            }else if(s.charAt(i)=='x'){
                value=0;
            }
        }
        System.out.print("결과: "+ count);
    }//main
}
