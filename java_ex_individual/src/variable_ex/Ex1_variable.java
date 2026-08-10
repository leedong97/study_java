package variable_ex;

import java.util.Scanner;

public class Ex1_variable {
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요:");
        String name = sc.next();
        System.out.print("성별을 입력하세요: ");      
        String sex = sc.next();
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.print("키를 입력하세요(cm): ");
        double height =sc.nextDouble();

        System.out.println("키"+height+"cm인 "+age+"살남자 "+name+"님 반갑습니다^^");
        //float 으로 하면 오류가 난다
        //하지만 float h1 = 170.3f;로 하면 java의 기본형인 double을 float으로 형변환을 해주는거이기 때문에 문제가 안된다.
    }
}
