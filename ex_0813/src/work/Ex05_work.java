package work;

import java.util.Scanner;

public class Ex05_work {

    public static void main(String[] args) {

        // 찾을 값 : 10
        // 10보다 큰 첫번째 요소 :11
        // 해당 행의 모든 요소
        // 9 10 11 12
        int[][] array = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16} };

        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 값: ");

        int a= sc.nextInt();
        int b= 0;
        int c= 0;
        out:for(int i= 0; i<array.length;i++){
            for(int j=0; j<array[i].length; j++){
                if(a<array[i][j]){
                    b= array[i][j];
                    c=i;
                    break out;
                    // 선생님은 변수를 따로 안만들고 for문안에서 for문을 한번더 돌리는 3중 for문으로 값을 다 뽑아냇다
                    //sysout도 마찬가지
                }
                
            }
           
        }
        System.out.println(a+"보다 큰 첫번째 요소: "+b);
        System.out.print("해당 행의 모든 요소: ");

        for(int i =0; i<array[c].length; i++){
            System.out.print(array[c][i]+" ");
        }









    }// main
}
