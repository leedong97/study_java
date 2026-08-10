package ex1_multi_for;

public class Ex3_multiFor {
    public static void main(String[] args) {
        
        // A B C D
        // E F G H
        // I J K L

        char c = 'A'; 
        // int j =(int)c;
        for(int i=1; i<=3; i++){
            for(int a=1; a<=4; a++){
                System.out.printf("%s ",c++);
            }//inner
            System.out.println();
        }//outer 


    }//main
}
