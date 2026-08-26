package ex2_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3_MapTeacher {
    // value값은 map.get으로 불러온다

    public static void main(String[] args) {
        

        Scanner sc= new Scanner(System.in);

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("kim", 1111);
        map.put("lee", 2222);

        System.out.println("id: ");
        String id = sc.next();
        System.out.print("pw: ");
        int pwd = sc.nextInt();

        if(!map.containsKey(id)){
            System.out.println("아이디가 존재하지 않음");
        }else{
            if(map.get(id)==pwd){
                System.out.println("로그인 성공");
            }else{
                System.out.println("비밀번호 불일치");
            }

        }
    }
}
