package ex1_multi_for;

public class Ex4_multiFor {
    
    public static void main(String[] args) {
        
        // *****
        // 12345
        // *****
        // 12345
        // *****
       

        // for(int i=1; i<=5;i++){
        //     if(i/2 !=0){
        //         System.out.println("*****");

        //     }else if(i/2 ==0) {
        //         for(int j=1; j<=5; j++){
        //             System.out.print(j);
        //         }
        //     }
            
        // }
        for(int i =1; i<=5; i++){
            for(int j =1; j<=5; j++){
                if( i %2 ==1){
                    System.out.print("* ");
                }else{
                    System.out.print(j);
                }
            }//inner
            System.out.println();
        }//outer


    }//main
}
