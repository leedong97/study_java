package ex06_overload;

import java.util.Scanner;

public class BreadMain {
    
    public static void main(String[] args) {
        // 빵을 만들었습니다 <<- 메서드 1 호출
        //------------------------
        // 빵을 만들었습니다
        // 빵을 만들었습니다
        // 요청하신 2개의 빵을 만들었습니다     <<- 메서드 2 호출
        //--------------------------------
        // 크림빵을 만들었습니다 
        // 크림빵을 만들었습니다
        // 요청하신 2개의 크림빵을 만들었습니다 <<- 메서드 3 호출

        Scanner sc = new Scanner(System.in);
        System.out.print("빵종류 :");
        String type = sc.next();
        System.out.print("빵의 갯수: ");
        int num = sc.nextInt(); 
        Bread bread = new Bread();

        bread.makeBread();
        
        if(type.equals("일반")){
            bread.makeBread(num);
        }else if(type.equals("크림")){
            bread.makeBread(type,num);
        }
    }//main
}
