import java.util.Scanner;

public class Ex02_work {

    /*
     * 1~12월 사이의 값을 키보드에서 입력
     * 입력된 값에 해당하는 달이 몇일까지 있는지 출력
     * --------------------------
     * 월 : 3
     * 3월은 31일까지 있습니다
     * 
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("월: ");
        int a = sc.nextInt();

        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(a + "월은 31일까지");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(a + "월은 30일까지");
                break;
            case 2:
                System.out.println(a + "월은 28일까지 있습니다");
                break;
            default:
                System.out.println("제대로된 달을 입력해주세요");
                break;

        }
    }

}
