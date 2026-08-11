package ex1_multi_for;

public class Ex9_multiFor {
    public static void main(String[] args) {
        
        /*           
               *
             * * * 
           * * * * *
         * * * * * * *
        * * * * * * * * *
        */

        // 생각하기나름이지만 처음부터 삼각형을 배열로 나타내려고하기보다
        // 방법은 여러가지이겟지만 빈곳을 베재하는 방법으로 코딩했다.
        for(int i =0; i<5; i++){

            for(int j =0; j<5+i; j++){

                if(i+j>3)
                System.out.print("* ");

                else
                    System.out.print("  ");

            }//inner

            System.out.println();
        }//outer



    //    for(int i=1; i<=5;i++){
        
    //     for(int j =1; j<=(2*i-1); j++){
    //         System.out.print(" * ");
    //         for(int k =1; k<=9-j; k++){
    //             System.out.print(" ");
    //         }
    //     }
        
    //     System.out.println();
    //    }
    }
}
