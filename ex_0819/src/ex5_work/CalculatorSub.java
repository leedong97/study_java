package ex5_work;

public class CalculatorSub {
    
    
    public int result(int su1, int su2, String op){


        switch(op){

            case "+":
            // System.out.println(su1+su2);
             return su1+su2;
            // return으로도 조건문을 빠져나올수있다
            case "-":
            // System.out.println(su1-su2);
            return su1-su2;

            case "*":
            // System.out.println(su1*su2);
            return su1*su2;

            case "/":
            // System.out.println(su1/su2);
            return su1/su2;
            
            default :
            System.out.println("연산자를 제대로 입력하세요");
            return -1;
            //아무것도 반환을 안할수가 없어서 -1로 그냥 지금 임의로 설정한거다

        }
     
    }
}
