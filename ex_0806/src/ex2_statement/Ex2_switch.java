package ex2_statement;

public class Ex2_switch {
    public static void main(String[] args) {
        
     String str = "S";
     String res = "";

     switch(str){//비교값

        case "A": // 비교값과 조건값을 맞추기 위해서 case도 String 즉 문자열로 만들어준거다.
            res= "90~100";
            break; // break를 실수로 안적으면 break가 나올떄까지 쭉 내려가고
                    // 이번 경우에는 case"B"의 값인 80~89가 나온다.
        case "B":
            res="80~89";
            break;

        case "C":
            res="70~79";
            break;
        case "D":
            res="60~69";
            break;
        case "F":
            res="59점이하";
            break;

        default:
            System.out.println("올바른 성적을 입력해주세요");
            break;
     }//switch

     System.out.println(res);



    }//main

}//class closed
