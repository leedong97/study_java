package ex1_statement;

public class Ex2_if_else {
    public static void main(String args[]){
        /*
         if-else문: 하나의 조건식에 대해서
         참일때와 거짓일 때를 모두 판단할 수 있는 제어문        
        */
       int n = 40;
       String str = "";

       // 
       
    //    int n = 39;
    //    //String str = "";
    //    //아래 조건식이 거짓이라고하더라도 거짓인걸 판별하는 사이에 이미 41로 증가해있다.
    //    if(++n <= 40){
    //       str="n은 40이하의 수";
    //    }if(++n > 40){
    //       str= "n은 40 초과인 수";
    //    }
    //    System.out.println(str);
          
    //      if(++n >=50){
    //         // 조건식이 참일때 실행되는 영역
    //         str = "n은 50이상의 수";
    //      }else{
    //         // 조건식이 거짓일 때 실행되는 영역
    //         str="n은 50 미만의 수";
    //      }

    //   System.out.println("str:"+str);

      /*
       변수 age에 나이를 대입하고 30 이상이면
       드실만큼 드셧군요를, 그렇지 않으면 조금더 드셔도 돼요를
       출력하는 if문을 구현
      */
       int age =30;
       str ="";
       if (age>=30){
        str="드실만큼 드셧군요";
      
       }else{
        str="조금 더 드셔도돼요";
        
       }
       System.out.println(str);
   
    // 위의 30 어쩌고 코드를 
    // 삼항연산자로 구현
       String str1= age >=30? "드실만큼 드셧군요": "조금더";
       System.out.println(str1);
    }
}
