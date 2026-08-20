package ex01_work;

import java.util.Scanner;

public class NumberSub {
    

    public boolean isNumber(String str){

        for(int i=0; i <str.length(); i++){

            char ch = str.charAt(i);

            if(ch <'0'|| ch>'9'){
                return false;
            }

        }
        return true;

    }
    // public int result(String value){

      
    //     Scanner sc = new Scanner(System.in);
    //     for(int i =0; i<value.length();i++){
    //         char ch = value.charAt(i);

    //         if(ch<'0'||ch>'9'){
    //             return 0;
    //         }
    //     }
    //     return 1;
    // }

    
}
