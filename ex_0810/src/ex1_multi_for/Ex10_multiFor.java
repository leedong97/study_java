package ex1_multi_for;

public class Ex10_multiFor {
    public static void main(String[] args) {
        
        /*
        1 3 5 7 9 
        3 5 7 9 1
        5 7 9 1 3
        7 9 1 3 5
        9 1 3 5 7
        */

        for(int i=1; i<=5; i++){
            for(int j=0; j<5; j++){                
                int num=  2*(i+j)-1;
                if(num>10)
                    num -=10;

                System.out.printf("%d ",num);
            }//inner
            System.out.println();
        }//outer

        System.out.println("----------------------------------------");

    }
}
