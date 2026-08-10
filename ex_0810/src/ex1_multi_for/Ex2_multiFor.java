package ex1_multi_for;

public class Ex2_multiFor {
    public static void main(String[] args) {
        
        // 01 02 03 04
        // 05 06 07 08
        // 09 10 11 12

         int cnt =0;
         for( int i = 1; i<=3; i++){

            for (int j =1; j<=4; j++){
                System.out.printf("%02d ", ++cnt);
            }
            System.out.println();
         }
        // for(int i= 1; i <=3; i++ ){

        //     if(i==1){
        //     for(int j=1; j<=4; j++){
        //         System.out.printf("%02d ",j);
        //     }
        //     System.out.println();
        //     }else if(i==2){
        //         for(int j=5; j<=8; j++){
        //             System.out.printf("%02d ",j);
        //         }
        //         System.out.println();
        //     }else if(i==3){
        //         for(int j=9; j<=12; j++){
        //             System.out.printf("%02d ",j);
        //         }
        //     }
        }//for문

    }//main
    

