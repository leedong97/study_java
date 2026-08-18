package ex_work;

import java.util.Scanner;

public class Ex1_work {
    // 키보드에서 입력받은 값이 회문인지 판단
    // --------------------------------
    // 회문이란 앞에서 읽으나 뒤에서 읽으나 같은애들
    // 토마토, 기러기, 오디오
    // 입력 : abcba
    // abcba은(는) 회문입니다.

    // 입력: abc
    // abc은(는) 회문이 아닙니다
    public void palindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        String a = sc.next();
        int count = 0;
        for(int i =0; i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-1-i)){
                count ++;
                break;
            }
       
        }
        if(count ==0){
            System.out.print(a+"는 회문입니다.");
        }else{
            System.out.println(a+"는 회문이 아닙니다");
        }
        
    


    }
}
