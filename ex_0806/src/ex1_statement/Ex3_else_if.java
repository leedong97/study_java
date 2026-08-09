package ex1_statement;

public class Ex3_else_if {
    public static void main(String[] args){
        
        /*
         [문제]
         0~100 사이의 점수(score)가 주어졌을 때,
           - 90 이상이면 "A"
           - 80 이상 90 미만이면 "B"
           - 70 이상 80 미만이면 "C"
           - 70 미만이면 "D"
         를 출력하는 프로그램을 else if문으로 작성하세요.
        */
  
        int score= 85;
        String s="";
        if(score>=90){
            s="A";
        }else if(score >=80){
            s="B";

        }else if(score >=70){
           s="c";

        }else{
           s="F";
        }
        System.out.println(s);
  
        // int num = 50;
        // String str = "";

        // if(num >= 90){
        //     str = "A";
        // }else if( num >= 80){
        //     str= "B";
        // }else if (num >=70){
        //     str="C";
        // }else if (num >=60){
        //     str="D";
        // }else {
        //     // 위의 조건식들이 모두 거짓일때 반드시 호출되는 영역 제일 마지막에 한번 쓸수잇다.
        //     str="F";
        // }

        // System.out.println(str);

        // // 나이가 20 이상 -> 성인요금
        // // 14이상 20 미만 -> 청소년 요금
        // // 8이상 14미만 -> 어린이 요금
        // // 8미만 -> 유아요금
     
        // int age = 30;
        // str="";
        // if(age>=20){
        //     str="성인요금";
        // }else if(14 <= age){
        //     str="청소년요금";
        // }else if(8 <= age){
        //     str="청소년 요금";
        // }else{
        //     str="유아요금";
        // }
        // System.out.println(str);
    }//main
}//class closed
