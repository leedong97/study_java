package if_ex;

import java.util.Scanner;

public class Ex1_if {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Ex1_if p = new Ex1_if();
    // p.practice1(sc);
    // p.practice2(sc);
    // p.practice3(sc);
    // p.practice4(sc);
    p.practice5(sc);
    }//main
    
    public void practice1(Scanner sc){
        System.out.print("메뉴 번호를 입력하세요: ");
        int n = sc.nextInt();
    
        String s1= "입력";
        String s2= "수정";
        String s3= "조회";
        String s4= "삭제";
        String s7= "종료";

        if(n==1){
            System.out.printf("%s 메뉴입니다",s1);
        }else if(n==2){
            System.out.printf("%s 메뉴입니다",s2);
            
        }else if (n==3){
            System.out.printf("%s 메뉴입니다",s3);
        }else if (n==4){
            System.out.printf("%s 메뉴입니다",s4);
        }else if (n==7){
            System.out.printf("프로그램이 종료됩니다.");
        }
    
    }//practice1

    public void practice2(Scanner sc){
        System.out.print("숫자를 한 개 입력하세요 :");
        int n = sc.nextInt();
        
        if(n>=0 && n/2==0){
            System.out.println("짝수다");
        }else if(n>0 && n/2!=0){
            System.out.println("홀수다");
        }else if(n<0){
            System.out.println("양수만 입력하세요.");
        }

    }//pr2
    public void practice3(Scanner sc){
        
        System.out.print("국어점수: ");
        int k = sc.nextInt();

        System.out.print("수학점수: ");
        int m = sc.nextInt();

        System.out.print("영어점수: ");
        int e= sc.nextInt();

        int sum = k+m+e;
        double av = (k+m+e)/3;

        if(k>=40 && m>=40 && e>=40 &&av>=60){
            System.out.println("국어: "+k);
            System.out.println("수학: "+m);
            System.out.println("영어: "+e);
            System.out.println("합계: "+sum);
            System.out.println("평균: "+av);
            System.out.println("축하합니다, 합격입니다!");

        }else{
            System.out.print("불합격입니다.");
        }


    }// pr3

    public void practice4(Scanner sc){

        //11월~2월 : 겨울   3월~ 6월: 봄
        //7월~9월 :여름   10월: 가을
        //
    System.out.print(" 1~12 사이의 정수 입력: ");
    int a = sc.nextInt();
    System.out.println();

    switch(a){
        case 1:
            System.out.println(a+"월은 겨울입니다.");
        break;

        case 2:
            System.out.println(a+"월은 겨울입니다");
        break;
            
        case 3:
            System.out.println(a+"월은 봄입니다");
        break;
            
        case 4:
            System.out.println(a+"월은 봄입니다");
        break;
           
        case 5:
            System.out.println(a+"월은 봄입니다");
        break;
            case 6:
            System.out.println(a+"월은 봄입니다");
        break;
           
        case 7:
            System.out.println(a+"월은 여름입니다");
        break;
                
        case 8:
            System.out.println("월은 여름입니다");
        break;
        
        case 9:
            System.out.println(a+"월은 여름입니다");
        break;

        case 10:
            System.out.println(a+"월은 가을입니다");
        break;

        case 11:
            System.out.println(a+"월은 겨울입니다");
        break;

        case 12:
            System.out.println(a+"월은 겨울입니다");
        break;
        
        default:
        System.out.println(a+"월은 잘못 입력된 달입니다.");
        break;
    }
    }//pr4

    public void practice5(Scanner sc){
        String id1="myId";
        String pw1="myPassword12";
        System.out.print("아이디: ");
        String id2= sc.next();

        System.out.print("비밀번호: ");
        String pw2 = sc.next();
        
        if(id1==id2 && pw1==pw2){
            System.out.println("로그인 성공");
        }else if(id1 != id2&& pw1== pw2){
            System.out.println("아이디가 틀렸습니다.");
        }else if(id1 == id2 && pw1!=pw2){
            System.out.println("비밀번호가 틀렸습니다.");
        }

        
    }//pr5
    
}
