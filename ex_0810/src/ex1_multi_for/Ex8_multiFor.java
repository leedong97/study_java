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

         for(int i=0; i<=9;i++){
            for(int j=1; j<=10; j++){

                if(i==0){
                    System.out.printf("%d ",j);
                }else{
                    if(j+i>10){
                        System.out.printf("%d ",j+i-10);
                    }else{
                        System.out.printf("%d ",j+i);
                    }
                    
                }
                
            }
            System.out.println();
        }




        //  for(int i=1; i<=10; i++){
        //     for(int j=i; j<=10; j++){
        //         if(j<=10){
        //           System.out.print(j +=1);        
        //         }else if(j>10){
        //             int c = j-10;
        //             System.out.print(c +=1);     
        //         }
                
        //     }
        //     System.out.println();
         }

    }//main

