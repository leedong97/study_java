package ex1_obgstream.practice;

import java.util.Scanner;



public class UserMain {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("**********<데이터 관리>*********");
        System.out.println("1. 등록하기");
        System.out.println("2. 수정하기");
        System.out.println("3. 삭제하기");
        System.out.println("4. 불러오기");
        System.out.print("숫자를 입력하세요: ");
        int menu = sc.nextInt();
        User user = new User();
        switch(menu){
            
            case 1: // 유저등록
                System.out.println("이름: ");
                user.setName(sc.next());

                System.out.println("나이: ");
                user.setAge(sc.nextInt());

                System.out.println("전화번호: ");
                user.setTel(sc.next());

                System.out.println("닉네임: ");
                user.setNickname(sc.next());


            break;

            case 2:
                System.out.println("입력할 카테고리를 고르세요.");
                System.out.print("전화번호 or 닉네임");
                if(sc.next() =="전화번호"){
                    System.out.println("전화번호를 입력하세요.");
                    String tel = sc.next();
                    UserLoader userLoader = new UserLoader();
                    userLoader.loadInfoTel(tel);
                    
                }else if(sc.next()=="닉네임"){
                    System.out.println("닉네임을 입력하세요.");
                    String nickname = sc.next();
                    UserLoader userLoader = new UserLoader();
                    userLoader.loadInfoNick(nickname);
                }


            break;


            case 3:

            break;


            case 4:
            
            break;




        }
    }
}
