package ex5_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkMainTeacher {
    

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
        // id: bbb
        // pw: 1111
        // 아이디가 중복됩니다
        // -------
        // id:
        Scanner sc= new Scanner(System.in);
        List<User> list = new ArrayList<User>();
        //이 구조는 무조건 무조건 외워라
        //User타입만 ArrayList에 넣는다는 뜻

        outer: while(true){
            System.out.print("id :");
            String id = sc.next();

            System.out.print("pw :");
            int pwd = sc.nextInt();
            
            //중복체크
            for(int i =0; i<list.size(); i++){
                if((list.get(i).getId()).equals(id)){
                    System.out.println("아이디가 중복됩니다");
                    continue outer;
                }
            }//for문
            
            User us = new User();
            //User를 명시적 생성으로 생성했는데
            // 이걸 위에서 한번에 해버리면 명시적 생성없이 하나 만들어진 메모리에서
            // list의 값을 참조하기때문에 user의 정보는 쌓이는게 아니라
            // 계속 바뀌기만한다.
            
            us.setId(id);
            us.setPw(pwd);
            //User 객체 만들었고 id,pw 값넣는중

            list.add(us);

            for(int i =0; i<list.size(); i++){
                System.out.println(list.get(i).getId()+"/"+
                                list.get(i).getPw());
                
            }//
            System.out.println("--------------");



        }//while
















    }//main
}
