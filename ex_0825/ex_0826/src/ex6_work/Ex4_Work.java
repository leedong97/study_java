package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex4_Work {
    
    public static void main(String[] args) {
        // ArrayList에 색상 정보를 랜덤으로 10개 담기
        // 담긴 값들 중, 내가 입력받은 문장과 동일한 값이
        // 몇 번째 index에 있는지 찾아내서 출력
        // ----------------------------------
        // 찾을 색상 : yellow
        // [RED, BLUE, BLUE, YELLOW, RED, YELLOW,........]
        //   0    1     2     3        4     5
        // yellow의 모든 index :[3,5]

        String[] str = {"RED","GREEN","BLUE","YELLOW"};
        List<String> list = new ArrayList<String>();
        List<Integer> list2 = new ArrayList<Integer>();
        Random rnd = new Random();
        Scanner sc= new Scanner(System.in);
        
        for(int i =0; i<10; i++){
            int rndnum = rnd.nextInt(4);
            list.add(str[rndnum]);
        } 
        System.out.println(list);
        System.out.print("찾을 색상: ");
        String color = sc.next();

        for(int i=0; i<list.size(); i++){           
            if((list.get(i)).equalsIgnoreCase(color)){
                list2.add(i);
            }
        }
        System.out.println(color+"의 모든 index: "+list2);













    }//main
}
