package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2_Work {
    public static void main(String[] args) {

        // 다섯개의 문장을 입력받아 ArrayList에 저장하고
        // 가장 긴 문자열을 찾아 출력
        // ---------------------------
        // 입력 : aaa
        // 입력 : bbbb
        // 입력 : ccccc
        // 입력 : dddddd
        // 입력 : dsf
        // 가장 긴 문자열 : dddddd

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
       
        for (int i = 0; i < 5; i++) {
            System.out.print("입력: ");
            String sentence = sc.next();
            list.add(sentence);
            
        }
        String max =list.get(0);
        for(int j=0; j<4; j++){
            if(list.get(j).length() <list.get(j+1).length()){
                max=list.get(j+1);
            }
       
    }
    System.out.println(list);
    System.out.println("가장 긴 문자열:" +max);
}// main
}
