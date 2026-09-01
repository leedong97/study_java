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
                    user=  userLoader.loadInfoTel(tel);

                    System.out.println("이름: "+user.getName());                    
                    System.out.println("나이: "+user.getAge());                  
                    System.out.println("전화번호: "+user.getTel());                   
                    System.out.println("닉네임: "+user.getNickname());
                    
                    System.out.println
                    ("수정하고싶은 카테고리를 고르세요. 1)이름 2)나이 3)전화번호 4)닉네임");
                    String category =sc.next();
                    switch(category){
                        case "이름":
                        System.out.print("수정할 이름: ");
                        user.setName(sc.next());
                        System.out.println(user.getName()+"으로 수정되었습니다.");
                        break;

                        case "나이":
                        System.out.print("수정할 나이: ");
                        user.setAge(sc.nextInt());
                        System.out.println(user.getAge()+"으로 수정되었습니다.");
                        break;

                        case "전화번호":
                        System.out.print("수정할 전화번호: ");
                        user.setTel(sc.next());
                        System.out.println(user.getTel()+"으로 수정되었습니다.");
                        break;

                        case "닉네임":
                        System.out.print("수정할 닉네임: ");
                        user.setNickname(sc.next());
                        System.out.println(user.getNickname()+"으로수정되었습니다.");
                        break;
                    }
                }else if(sc.next()=="닉네임"){
                    System.out.println("닉네임을 입력하세요.");
                    String nickname = sc.next();
                    UserLoader userLoader = new UserLoader();
                    user =userLoader.loadInfoNick(nickname);
                }


            break;


            case 3:

            break;


            case 4:
            
            break;




        }
    }
}
