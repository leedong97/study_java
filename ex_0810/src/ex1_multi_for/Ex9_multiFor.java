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
       for(int i=1; i<=5;i++){
        
        for(int j =1; j<=(2*i-1); j++){
            System.out.print(" * ");
            for(int k =1; k<=9-j; k++){
                System.out.print(" ");
            }
        }
        
        System.out.println();
       }
    }
}
