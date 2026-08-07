package ex1_statement;

public class Ex1_for {
    public static void main(String[] args) {
        
        /* for문 : 특정 코드를 원하는 만큼 반복하고자 할 때 
            for(초기식; 조건식; 증감식 ){
                조건식이 참일 때 수행되는 영역
    
            /}
            
        */

        // int a= 10; //전역변수
        //여기에서의 a 는 메인메소드 내에서의 지역변수이다. 하지만 여기서는 메인이라 a는 전역변수라고해서,
        // 아래의 for문 내에서도 사용이 가능하다. 벤다이어그램으로 생각하면 편하다.
        // 전역변수와 같은 지역변수를 만들수 없다.
        // int i =0;
        for(int i =0; i <= 2; i++){
            // 여기서 i 는 for문 내에서만 사용되는 지역변수이다. 바깥에서는 사용이 불가능하다.
            System.out.println(i);

            
        }// for
        // System.out.println("결과: "+i);
        // 여기서 i의 값이 3인 이유는 위에서 2까지 반복을 했지만 3까지도 돌고 조건식에서 막혀서 값이 안나와 있었기 때문에
        // 아래에서는 3이 나오는것이다.
        System.out.println("---------------------------");

        /*
            10~ 1까지 반복하는 for 문
        */
        int a=10;
        for(; a>=1; a--){
            System.out.println(a);
        }

        System.out.println("for문 밖: "+a);

        System.out.println("-------------------------");
        /*
            1~ 100까지 반복하는 for문을 만들되
            5의 배수만 출력
        */

       
        for(int i=1; i <=100; i++)
        {
            if(i%5 ==0){
                System.out.println(i);

            }
        }
        System.out.println("-------------------------");

        for (int i =5; i <=100; i+=5){

            System.out.println(i);
        }
        System.out.println("-------------------------");






    }//main
}
