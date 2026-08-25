package ex_work;

import java.util.Scanner;

public class WorkSub implements Runnable {

    int num1;
    int num2;
    int num3;
    boolean running = true;

    public WorkSub(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        Thread t = new Thread();

        if (t.isAlive()) {
            try { 
                Thread.sleep(1000);
                count++;
            } catch (Exception e) {

            }
        }
        System.out.printf("걸린시간 %d 초입니다.",count);
        try {
            while (count != 5) {
                num3 = sc.nextInt();
                if (num1 + num2 == num3) {
                    // System.out.println("--------");
                    System.out.println("정답입니다.");
                    count++;
                    System.out.printf("%d + %d =", num1, num2);

                } else {
                    System.out.println("오답입니다.");
                    System.out.printf("%d + %d =", num1, num2);

                }

            }

        } catch (Exception e) {
            System.out.println("정답은 정수로입력하세요.");
            e.printStackTrace();

        }

    }

}
