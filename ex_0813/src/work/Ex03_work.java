package work;

import java.util.Scanner;

public class Ex03_work {
    public static void main(String[] args) {
        // 키보드에서 입력받은 값보다 큰 첫번 째 요소를 찾아 출력
        // ---------------------------------
        // 입력 : 8
        // 결과 : 10
        // int [][] arr= {{1,3,4,7},
        // {10,2,9,3,8},
        // {11,4,1}

        // };
        // Scanner sc = new Scanner(System.in);
        // System.out.print("입력: ");
        // int num = sc.nextInt();
        // int[][] arr = { { 1, 3, 4, 7 },
        //         { 10, 2, 9, 3, 8 },
        //         { 11, 4, 1 }

        // };

        // out: for (int i = 0; i < arr.length; i++) {

        //     for (int j = 0; j < arr[i].length; j++) {
        //         if (arr[i][j] > num) {
        //             System.out.println("결과: " + arr[i][j]);
        //             break out;
        //         }

        //     } // inner
        // } // outer

        // 키보드에서 입력받은 값보다 큰것중 가장 큰 요소를 찾아 출력
        // ---------------------------------
        // 입력 : 8
        // 결과 : 11
        // int [][] arr= {{1,3,4,7},
        // {10,2,9,3,8},
        // {11,4,1}
        int[][] arr = { { 1, 3, 4, 7 },
                { 10, 2, 9, 3, 8 },
                { 11, 4, 1 }

        };
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int a = sc.nextInt();

        int b = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (a < arr[i][j] && b < arr[i][j]) {
                    b = arr[i][j];

                }
            }

        }
        System.out.println("결과: " + b);

    }// main
}
