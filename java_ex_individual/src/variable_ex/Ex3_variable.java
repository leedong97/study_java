package variable_ex;

import java.util.Scanner;

public class Ex3_variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("가로: ");
        double width= sc.nextDouble();

        System.out.print("세로: ");
        double height= sc.nextDouble();

        System.out.println("면적: "+ width*height);
        System.out.print("둘레: "+(width+height)*2);
    }
}
