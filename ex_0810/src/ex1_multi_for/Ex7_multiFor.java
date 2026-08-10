package ex1_multi_for;

public class Ex7_multiFor {
    public static void main(String[] args) {
    
        // 2 x 1 =2     3 x 1=3  4x1=4 ... 9x1=9
        // 2 x 2 =4

        // ...

        // 2x9= 18   3x9= 27 ...            9x9 =81

        for(int i =1; i<=9 ; i++){
            for(int j=2; j<9; j++){

                System.out.printf("%d x %d = %d\t",j,i,j*i);
            }//inner
            System.out.println();
        }//outer

    }//main

}
