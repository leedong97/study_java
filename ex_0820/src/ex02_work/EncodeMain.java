package ex02_work;

import java.util.Scanner;

public class EncodeMain {
    
    public static void main(String[] args) {
    
        // 입력 : abc123
        // 결과 : `~!wer
        // 입력 : jk56
        // 결과 : *(yu
        Scanner sc= new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next();
        System.out.print("결과: ");
        
        EncodeSub sub = new EncodeSub();
        String res =sub.encoding(str);
        System.out.println(res);











    }


}
