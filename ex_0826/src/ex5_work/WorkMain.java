package ex5_work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WorkMain {

    public static void main(String[] args) {

        // id : aaa(문자열)
        // pw : 1111(숫자)
        // aaa/1111
        // ----------------------
        // id : bbb
        // pw : 2222
        // aaa/111
        // bbb/222
        // ----------
        // id:
        List<String> listId = new ArrayList<String>();
        List<Integer> listPw = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("id :");
            String id = sc.next();
            listId.add(id);

            System.out.print("pw :");
            int pw = sc.nextInt();
            listPw.add(pw);

            for (int i = 0; i < listId.size(); i++) {
                System.out.println(listId.get(i) + "/" + listPw.get(i));
            }
        }

    }// main
}
