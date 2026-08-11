package ex1_multi_for;

public class Ex8_multiFor {
    public static void main(String[] args) {
        
        /*
         1 2 3 4 5 6 7 8 9 10 
         2 3 4 5 6 7 8 9 10 1
         3 4 5 6 7 8 9 10 1 2
         ......
         10 1 2 3 4 5 6 7 8 9
        */


         
        //  for(int i=0; i<=9;i++){
        //     for(int j=1; j<=10; j++){

        //         if(i==0){
        //             System.out.printf("%d ",j);
        //         }else{
        //             if(j+i>10){
        //                 System.out.printf("%d ",j+i-10);
        //             }else{
        //                 System.out.printf("%d ",j+i);
        //             }
                    
        //         }
                
        //     }
        //     System.out.println();
        // }

        for(int i = 1; i<=10; i++){
            for(int j =0; j <10; j++ ){

                int num = i  + j;
                if(num > 10){
                    num-=10;
                }
                //if문이나 for 문 혹은 while 문에서 그 조건에대해 실행코드가 한줄인 경우엔 
                // 중괄호를 생략할수있다.
                System.out.print(num+"");
            }//inner
            System.out.println();
        }//outer



        
         }

    }//main

