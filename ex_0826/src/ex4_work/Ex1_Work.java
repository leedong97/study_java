package ex4_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_Work {
    

    public static void main(String[] args) {
        
        // id : aaa(키보드에서받음)
        // aaa 회원
        // id: bbb
        // aaa 회원
        // bbb 회원
        // id : aaa
        // aaa회원은 이미 존재함

        Scanner sc= new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        
        outer: while(true){
            System.out.print("id : ");
            String id = sc.next();
            
            //중복체크2
            for(int i =0; i< list.size(); i++){

                if(id.equals(list.get(i))){
                    System.out.println(id+"회원은 이미 있어");
                    continue outer;
                }
            }//for

            // 중복체크
            // if(list.contains(id)){
            //     System.out.println(id+"회원은 이미 존재함");
            //     continue;
            // }
                list.add(id);
            
           
            //전체 회원
            for(int i =0; i<list.size();i++){

                System.out.println(list.get(i)+"회원");


            }//for
        }
            
            

            

















        
    }//main
}
