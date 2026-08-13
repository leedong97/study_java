package work;

import java.util.Scanner;

public class Ex07_work {
    public static void main(String[] args) {

        // 홀수 : 3
        // 08 01 06
        // 03 05 07
        // 04 09 02
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수: ");
        int a = sc.nextInt();
        int[][] arr = new int[a][a];
        arr[0][a / 2] = 1;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                num2 += arr[i][j];
            }
            num1 += arr[0][i];

        }

        if (num1 == num2) {

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }

        }

    } // main
}
