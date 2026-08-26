package ex2_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3_Map {

    public static void main(String[] args) {

        // id : abc
        // pw : 1111
        // id 가 존재하지 않습니다.

        // id: kim
        // pw: 2222
        // 비밀번호 불일치

        // id: lee
        // pw: 2222
        // 로그인 성공
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("kim", 1111);
        map.put("lee", 2222);

        Scanner sc = new Scanner(System.in);
        System.out.print("id: ");
        String id = sc.next();
        System.out.print("pw: ");
        int pw = sc.nextInt();
        while (!map.containsKey(id) && !map.containsValue(pw)) {

            try {
                System.out.print("id: ");
                id = sc.next();
                System.out.print("pw: ");
                pw = sc.nextInt();
                if (map.containsKey(id) && map.containsValue(pw)) {
                    System.out.println("로그인 성공");
                } else if (!map.containsKey(id) && map.containsValue(pw)) {
                    System.out.println("아이디 불일치");
                } else if (map.containsKey(id) && !map.containsValue(pw)) {
                    System.out.println("비밀번호 불일치");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("다시 입력하세요");
            }

        } // main
    }
}
