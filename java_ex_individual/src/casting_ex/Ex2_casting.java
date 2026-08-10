package casting_ex;

import java.util.Scanner;

public class Ex2_casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어: ");
        double kscore = sc.nextDouble();

        System.out.print("영어: ");
        double escore = sc.nextDouble();

        System.out.print("수학: ");
        double mscore = sc.nextDouble();

        int total =(int)(kscore+escore+mscore);
        System.out.println("총점: "+total);

        int av = total/3;
        System.out.print("평균: "+av);
       
    }//main
    








}//class
















