package ex1_obgstream;

import java.util.Scanner;

public class UserMain {
    

    public static void main(String[] args) {
        

        Scanner sc= new Scanner(System.in);
        User user =new User();
        // user객체만 만들어져있지만 아무것도 없는 null인 상태이다
        // 메모리만 할당받아져있다.

        System.out.println("1. 새로등록");
        System.out.println("2. 불러오기");
        System.out.print(">>");

        int sel = sc.nextInt();

        switch(sel){

            case 1: // 유저등록
                System.out.print("이름: ");
                user.setName(sc.next());

                System.out.print("나이: ");
                user.setAge(sc.nextInt());

                System.out.print("전화번호: ");
                user.setTel(sc.next());

                // 이름, 나이, 전화번호를 이제 아는상태
                UserWriter uw = new UserWriter();
                uw.wirteInfo(user);
                // user라는 객체를 담아서 writeInfo메서드 실행

                break;
            
            case 2: // 불러오기

                System.out.println("전화번호: ");
                String tel = sc.next();
                // 지금 현 시점에서 user는 아무런 정보도 받지못해서
                // 아무런 값도 가지고 있지않다.
                // 2번을 다시 돌렷을때 말하는거.

                UserLoader u1 = new UserLoader();
                user =u1.loadInfo(tel);
                // 이제 loader 에 010(tel)을 보냈다.

                if(user != null){
                    System.out.println("이름: "+ user.getName());
                    System.out.println("나이: "+ user.getAge());
                    System.out.println("전화: "+ user.getTel());
                }
                break;
            
        }//switch
    }//main
}
