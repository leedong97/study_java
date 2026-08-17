package ex5_label;

public class Ex1_label {
    public static void main(String[] args) {
        
        // 특정 반복문에 label을 붙여
        // 한 번에 두 개 이상의 반복문을 제어할 수 있다.
        out : for(int i =1; i<=3; i++){
            // out = out이라는 별칭을 준것이다(label)
            for(int j =1; j<=10; j++){

                if(j%2 ==0)
                    break out;
                    // continue;

                System.out.print(j+" ");
            }//inner

            System.out.println();

        }//outer
        

















    }//main
}
