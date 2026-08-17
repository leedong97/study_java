import java.util.Scanner;

public class Ex06_work {
    
    public static void main(String[] args) {
        // 정수 : 7
        // 7은(는) 소수입니다

        // 정수 : 10
        // 10은(는) 소수가 아닙니다

        Scanner sc = new Scanner(System.in);
        System.out.print("정수: ");
        int n= sc.nextInt();
        int cnt= 0;
        for(int a=2; a<n; a++ ){
            if(n%a==0){
                cnt++;
            }
        }
        if(cnt==0){
            System.out.printf("%d은(는) 소수입니다",n);
        }else{
            System.out.printf("%d은(는) 소수가 아닙니다",n);
        }



    }// main
}
